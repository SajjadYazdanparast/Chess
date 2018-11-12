package com.yazdanparast.sajjad.chess;

public class Bead
{
    private String color;
    private String name;
    private int x;
    private int y;
    private int id;
    private int imageId ;
    boolean first_move;


    public Bead(String color, int id, int x, int y , String name, int imageId) {
        this.color = color;

        this.id = id;
        this.x = x;
        this.y = y;
        this.name = name;
        first_move = true;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public boolean isFirst_move() {
        return first_move;
    }

    public void setFirst_move(boolean first_move) {
        this.first_move = first_move;
    }
}
