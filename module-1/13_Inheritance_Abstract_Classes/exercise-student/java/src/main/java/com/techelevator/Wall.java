package com.techelevator;

public abstract class Wall {
    private final String name;
    private final String color;

    //getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Wall(String name, String color){//constructor
        this.name = name;
        this.color = color;
    }

    //area method
    public abstract int getArea();

    public static class TriangleWall extends Wall{

        private int base;
        private int height;

        public TriangleWall(String name, String color, int base, int height){
            super(name,color);
            this.base = base;
            this.height = height;
        }

        public int getBase() {
            return base;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int getArea() {
            return (base * height)/ 2;
        }

        public String toString(){
            return getName() + " (" + base + "x" + height + ") triangle";
        }
    }
}
