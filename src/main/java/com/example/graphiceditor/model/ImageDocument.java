package com.example.graphiceditor.model;

import java.util.ArrayList;
import java.util.List;

public class ImageDocument {
    private Long id;
    private int width;
    private int height;
    private List<Layer> layers = new ArrayList<>();

    public ImageDocument() {}

    public ImageDocument(Long id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public void removeLayer(Layer layer) {
        layers.remove(layer);
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
