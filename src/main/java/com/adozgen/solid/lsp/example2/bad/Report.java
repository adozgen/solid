package com.adozgen.solid.lsp.example2.bad;

public abstract class Report {
    abstract void fetchReportData();
    abstract void prepareHeader();
    abstract void prepareContent();
    abstract void prepareFooter();
    abstract void displayReport();
}
