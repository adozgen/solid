package com.adozgen.solid.lsp.example2.good;

public class ReportService {
    public void viewReport(DisplayableReport report) {
        report.fetchReportData();
        report.prepareHeader();
        report.prepareContent();
        report.prepareFooter();
        report.displayReport();
    }

    public void exportReport(ExportableReport report, String exportPath) {
        report.fetchReportData();
        report.prepareHeader();
        report.prepareContent();
        report.prepareFooter();
        report.exportReport(exportPath);
    }
}
