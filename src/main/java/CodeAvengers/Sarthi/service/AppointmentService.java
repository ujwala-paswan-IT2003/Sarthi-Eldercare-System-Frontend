package CodeAvengers.Sarthi.service;

import CodeAvengers.Sarthi.dto.AppointmentRequest;
import CodeAvengers.Sarthi.entity.Appointment;
import CodeAvengers.Sarthi.entity.ScheduledAppointments;
import CodeAvengers.Sarthi.exception.ResourceNotFoundException;
import CodeAvengers.Sarthi.repository.AppointmentRepository;
import CodeAvengers.Sarthi.repository.ScheduleAppointmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private ScheduleAppointmentRepo scheduleAppointmentRepo ;

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Get appointment by ID
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not found with id " + id));
    }

    // Create new appointment
    public ScheduledAppointments createAppointment(AppointmentRequest appointmentRequest) {

        System.out.println("Appointment request "+appointmentRequest);
        ScheduledAppointments obj = new ScheduledAppointments();
        obj.setDoctorName(appointmentRequest.getDoctorName());
        obj.setSlot(appointmentRequest.getSlot());
        obj.setPatientId(appointmentRequest.getPatientId());

        // 1. find record by doctor name
        // we'll get booked slots for doc , if slot is not available give return a msg if slot is empty , assign it.
        ScheduledAppointments scheduledAppointment = scheduleAppointmentRepo.save(obj);
        System.out.println("scheduled appointment "+scheduledAppointment);
        return scheduledAppointment;
    }

    // Update appointment
    public Appointment updateAppointment(Long id, Appointment appointmentDetails) {
        Appointment appointment = getAppointmentById(id);
        appointment.setDate(appointmentDetails.getDate());
        appointment.setTime(appointmentDetails.getTime());
        appointment.setComments(appointmentDetails.getComments());
        return appointmentRepository.save(appointment);
    }

    // Delete appointment
    public void deleteAppointment(Long id) {
        System.out.println("id "+ id);
        Optional<ScheduledAppointments> appointment = this.scheduleAppointmentRepo.findById(id);
        // System.out.println("All appointments " + this.scheduleAppointmentRepo.findAll() );
        if( appointment.isPresent()){
            scheduleAppointmentRepo.deleteById(id);
        }else{
            System.out.println("Appointment not found with id " + id);
        }
    }
}
