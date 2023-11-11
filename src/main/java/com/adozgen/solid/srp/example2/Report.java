package com.adozgen.solid.srp.example2;

public class Report {
    // Rapor özellikleri (başlık, içerik vb.)
    private String title;
    private String  content;

    // Constructor, getters ve setters
    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

