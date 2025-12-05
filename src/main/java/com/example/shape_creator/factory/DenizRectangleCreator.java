package com.example.shape_creator.factory;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class DenizRectangleCreator extends ShapeCreator{
    public DenizRectangleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {

        double width = rnd.nextDouble(10,40);
        double height = rnd.nextDouble(20,60);
        Rectangle rec = new Rectangle(randomX(),randomY(),width,height);
        rec.setFill(Color.color(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),0.6));
        rec.setStroke(Color.BLACK);

        return rec;
    }
}
