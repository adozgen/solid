package com.adozgen.solid.srp.example2.good;

import com.adozgen.solid.srp.example2.Report;
import com.adozgen.solid.srp.example2.ReportType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private PdfReportService pdfReportService;
    @Autowired
    private ExcelReportService excelReportService;

    public Report generateReport(ReportType type) {
        if (type == ReportType.PDF) {
            return this.pdfReportService.generate();
        } else if (type == ReportType.EXCEL) {
            return excelReportService.generate();
        }
        return null;
    }
}