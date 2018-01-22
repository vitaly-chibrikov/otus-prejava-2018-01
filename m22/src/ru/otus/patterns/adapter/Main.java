package ru.otus.patterns.adapter;

/**
 * Created by tully.
 * <p>
 * Client in the Adapter pattern.
 */
public class Main {
    public static void main(String[] args) {
        CartesianPlotter plotter = new CartesianPlotterImpl();
        PolarPlotter adapter = new Polar2CartesianAdapter(plotter);

        adapter.setPoint(0, 42);
        adapter.setPoint(1, Math.PI / 2);
        adapter.setPoint(2, Math.PI);
    }
}
