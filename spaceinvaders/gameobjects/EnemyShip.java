package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;

public class EnemyShip extends Ship{
    public double x;
    public double y;

    public EnemyShip(double x, double y) {
        super(x, y);
        setStaticView(ShapeMatrix.ENEMY);
    }

    public void move(Direction direction, double speed) {
        switch(direction) {
            case RIGHT:
                x+=speed;
            case LEFT:
                x-= speed;
            case DOWN:
                y+=2;
            case UP:
                y-=2;
        }
    }
}
