package ru.otus.patterns.adapter;

/**
 * Created by tully.
 * <p>
 * PolarPlotter coordinated to CartesianPlotter coordinated adapter.
 */
public class Polar2CartesianAdapter implements PolarPlotter {

    private final CartesianPlotter cartesian;

    public Polar2CartesianAdapter(CartesianPlotter cartesian) {
        this.cartesian = cartesian;
    }

    @Override
    public void setPoint(double r, double theta) {
        cartesian.setPoint(r * Math.cos(theta), r * Math.sin(theta));
    }
}
