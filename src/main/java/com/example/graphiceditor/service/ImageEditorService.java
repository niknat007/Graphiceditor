package com.example.graphiceditor.service;

import com.example.graphiceditor.model.*;

public class ImageEditorService {

    public Layer addNewLayer(ImageDocument doc, String layerName) {
        Layer layer = new Layer(null, layerName);
        doc.addLayer(layer);
        return layer;
    }

    public void addObjectToLayer(Layer layer, GraphicObject object) {
        layer.addObject(object);
    }

    public void applyFilterToLayer(Layer layer, FilterType filterType) {
        // тут була б логіка змін пікселів/стилів шару
        // зараз просто заглушка
        System.out.println("Applying filter " + filterType + " to layer " + layer.getName());
    }

    public void exportDocument(ImageDocument doc, ExportFormat format) {
        // заглушка для експорту
        System.out.println("Exporting document " + doc.getId() + " as " + format);
    }
}
