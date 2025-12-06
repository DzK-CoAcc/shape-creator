package com.example.shape_creator.factory;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class PolygonCreator extends ShapeCreator{
    public PolygonCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {

        double x1 = randomX();
        double y1 = randomY();
        double x2 = randomX();
        double y2 = randomY();
        double x3 = randomX();
        double y3 = randomY();
        double x4 = randomX();
        double y4 = randomY();
        double x5 = randomX();
        double y5 = randomY();

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                x1, y1,
                x2, y2,
                x3, y3,
                x4, y4,
                x5, y5
        });

        polygon.setFill(Color.color(1.0, 0.5, rnd.nextDouble()));
        polygon.setStroke(Color.BLUE);
        return polygon;
    }
}
