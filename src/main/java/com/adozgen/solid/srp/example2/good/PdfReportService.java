package com.adozgen.solid.srp.example2.good;

import com.adozgen.solid.srp.example2.Report;
import org.springframework.stereotype.Service;


@Service
public class PdfReportService {
    public Report generate() {
        String pdfContent = "content";
        return new Report("PDF Report", pdfContent);
    }
}
