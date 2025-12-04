package com.example.shape_creator.factory;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

import java.util.Random;

public abstract class ShapeCreator {

    protected final Pane canvas;
    protected final Random rnd = new Random();

    protected ShapeCreator(Pane canvas) {
        this.canvas = canvas;
    }

    public abstract Shape createShape();

    /**
     * zufällige Position innerhalb der Zeichnfläche
     * @return
     */
    protected double randomX(){
        return rnd.nextDouble(20, Math.max(40,canvas.getWidth()-20));
    }

    protected double randomY(){
        return rnd.nextDouble(20, Math.max(40,canvas.getHeight()-20));
    }
}
