package com.codegym.games.spaceinvaders.gameobjects;


public class Ship extends GameObject {
    public double x = 0;
    public double y = 0;

    public Ship(double x, double y) {
        super(x, y);
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
    }
}
