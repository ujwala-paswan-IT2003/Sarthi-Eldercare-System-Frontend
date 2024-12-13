package CodeAvengers.Sarthi.dto;

import lombok.Data;

@Data
public class AppointmentRequest {
    private String doctorName;
    private String slot;
    private long patientId;
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getSlot() {
        return slot;
    }
    public void setSlot(String slot) {
        this.slot = slot;
    }
    public long getPatientId() {
        return patientId;
    }
    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    /**
     * @param doctorName
     * @param slot
     * @param patientId
     */
    public AppointmentRequest(String doctorName, String slot, long patientId) {
        super();
        this.doctorName = doctorName;
        this.slot = slot;
        this.patientId = patientId;
    }

    public AppointmentRequest() {

    }
    @Override
    public String toString() {
        return "AppointmentRequest [doctorName=" + doctorName + ", slot=" + slot + ", patientId=" + patientId + "]";
    }

}
