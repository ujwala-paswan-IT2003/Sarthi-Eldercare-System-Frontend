package CodeAvengers.Sarthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CodeAvengers.Sarthi.entity.ScheduledAppointments;
@Repository
public interface ScheduleAppointmentRepo extends JpaRepository<ScheduledAppointments, Long> {

}
