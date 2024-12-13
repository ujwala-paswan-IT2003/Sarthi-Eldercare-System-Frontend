package CodeAvengers.Sarthi.service;

import CodeAvengers.Sarthi.entity.Report;
import CodeAvengers.Sarthi.exception.ResourceNotFoundException;
import CodeAvengers.Sarthi.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    // Get all reports
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    // Get report by ID
    public Report getReportById(Long id) {
        return reportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Report not found with id " + id));
    }

    // Create new report
    public Report createReport(Report report) {
        return reportRepository.save(report);
    }

    // Update report
    public Report updateReport(Long id, Report reportDetails) {
        Report report = getReportById(id);
        report.setMedicalHistory(reportDetails.getMedicalHistory());
        report.setCurrentStatus(reportDetails.getCurrentStatus());
        report.setImprovement(reportDetails.getImprovement());
        return reportRepository.save(report);
    }

    // Delete report
    public void deleteReport(Long id) {
        Report report = getReportById(id);
        reportRepository.delete(report);
    }
}