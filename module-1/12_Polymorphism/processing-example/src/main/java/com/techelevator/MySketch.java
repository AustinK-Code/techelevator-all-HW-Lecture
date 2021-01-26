package com.techelevator;

import processing.core.PApplet;

public class MySketch extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        background(255,0,0);
    }

    @Override
    public void draw() {
        Face myFace = new Face(width /2.0f,width /2.0f);
        myFace.draw(this);

        Face myFace1 = new Face(width /4.0f,width /2.0f);
        myFace1.draw(this);

        Face myFace2 = new Face(width /2.0f,width /19.0f);
        myFace2.draw(this);

        Face myFace3 = new Face(width /2.0f,width /10);
        myFace3.draw(this);

        Face myFace4 = new Face(width /7f,width /2.0f);
        myFace4.draw(this);

        Face myFace5 = new Face(width /7.6f,width /8.8f);
        myFace5.draw(this);

        for (int i = 10 ; i < 400 ; i += 10){
            Face face6 = new Face(mouseX,mouseY);
            face6.draw(this);
        }




    }

}
