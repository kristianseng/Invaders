package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.engine.cell.Game;
import com.codegym.games.spaceinvaders.ShapeMatrix;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {
    private List<EnemyShip> ships;
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;

    public EnemyFleet() {
        createShips();
    }

    private void createShips() {

        ships = new ArrayList<>();

        for(int i = 0; i < ROWS_COUNT; i++) {
            for(int j = 0; j < COLUMNS_COUNT; j++) {
                ships.add(new EnemyShip(j * STEP, i*STEP + 12));
            }
        };
    }

    public void draw(Game game) {
        for(Ship ship : ships) {
            ship.draw(game);
        }
    }
}
