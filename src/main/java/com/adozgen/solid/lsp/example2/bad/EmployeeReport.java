package com.adozgen.solid.lsp.example2.bad;

public class EmployeeReport extends Report {
    @Override
    void fetchReportData() {

    }

    @Override
    void prepareHeader() {

    }

    @Override
    void prepareContent() {

    }

    @Override
    void prepareFooter() {

    }

    // Çalışan raporu için özel uygulamalar
    void displayReport() {
        throw new UnsupportedOperationException("Employee report can only be exported as a file.");
    }
}