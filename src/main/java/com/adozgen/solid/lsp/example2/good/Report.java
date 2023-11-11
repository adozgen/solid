package com.adozgen.solid.lsp.example2.good;

public abstract class Report {
    abstract void fetchReportData();
    abstract void prepareHeader();
    abstract void prepareContent();
    abstract void prepareFooter();
}
