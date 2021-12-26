package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.engine.cell.*;

public class GameObject {
    public double x;
    public double y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.width = matrix[0].length;
        this.height = matrix.length;
    }

    public void draw(Game game) {
        for(int i = 0; i < this.height; i++) {
            for(int j = 0; j < this.width; j++) {
                game.setCellValueEx((int) (j + this.x), (int) (i + this.y), Color.values()[matrix[i][j]], "");
            }
        }
    }
}
