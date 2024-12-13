package CodeAvengers.Sarthi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="scheduledappointments")

public class ScheduledAppointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String doctorName;
    private String slot;
    private long patientId;
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return the doctorName
     */
    public String getDoctorName() {
        return doctorName;
    }
    /**
     * @param doctorName the doctorName to set
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    /**
     * @return the slot
     */
    public String getSlot() {
        return slot;
    }
    /**
     * @param slot the slot to set
     */
    public void setSlot(String slot) {
        this.slot = slot;
    }
    public long getPatientId() {
        return patientId;
    }
    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    @Override
    public String toString() {
        return "ScheduledAppointments [id=" + id + ", doctorName=" + doctorName + ", slot=" + slot + ", patientId="
                + patientId + "]";
    }




}
