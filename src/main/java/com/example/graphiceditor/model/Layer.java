package com.example.graphiceditor.model;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private Long id;
    private String name;
    private boolean visible = true;
    private double opacity = 1.0; // 0.0 - 1.0

    // Шар може містити різні графічні об’єкти (фігури, текст, тощо)
    private List<GraphicObject> objects = new ArrayList<>();

    public Layer() {}

    public Layer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addObject(GraphicObject obj) {
        objects.add(obj);
    }

    public void removeObject(GraphicObject obj) {
        objects.remove(obj);
    }

    public List<GraphicObject> getObjects() {
        return objects;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVisible() {
        return visible;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
}
