package com.adozgen.solid.srp.example2.bad;

import com.adozgen.solid.srp.example2.Report;
import com.adozgen.solid.srp.example2.ReportType;
import org.springframework.stereotype.Service;

public class ReportService {
    public Report generateReport(ReportType type) {
        if (type == ReportType.PDF) {
            return generatePDFReport();
        } else if (type == ReportType.EXCEL) {
            return generateExcelReport();
        }
        return null;
    }

    public Report generatePDFReport() {
        String pdfContent = "content";
        return new Report("PDF Report", pdfContent);
    }

    public Report generateExcelReport() {
        String excelContent = "content";
        return new Report("EXCEL Report", excelContent);
    }
}