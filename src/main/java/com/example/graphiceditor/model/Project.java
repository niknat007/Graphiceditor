package com.example.graphiceditor.model;

import java.time.LocalDateTime;

public class Project {
    private Long id;
    private String name;
    private LocalDateTime lastModified;
    // один проєкт = одне графічне полотно (ImageDocument)
    private ImageDocument document;

    public Project() {}

    public Project(Long id, String name, LocalDateTime lastModified, ImageDocument document) {
        this.id = id;
        this.name = name;
        this.lastModified = lastModified;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public ImageDocument getDocument() {
        return document;
    }

    public void setDocument(ImageDocument document) {
        this.document = document;
    }
}
