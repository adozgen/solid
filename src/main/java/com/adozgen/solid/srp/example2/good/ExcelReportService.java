package com.adozgen.solid.srp.example2.good;

import com.adozgen.solid.srp.example2.Report;
import org.springframework.stereotype.Service;


@Service
public class ExcelReportService {
    public Report generate() {
        String excelContent = "content";
        return new Report("Excel Report", excelContent);
    }
}
