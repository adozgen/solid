package com.adozgen.solid.lsp.example2.bad;

public class ReportService {
    public void viewReport(Report report) {
        report.fetchReportData();
        report.prepareHeader();
        report.prepareContent();
        report.prepareFooter();
        report.displayReport(); // EmployeeReport için hata atacak
    }
}
