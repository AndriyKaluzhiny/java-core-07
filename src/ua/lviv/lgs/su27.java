package ua.lviv.lgs;

import java.util.Random;

public class su27 extends plane implements moveable, Randomize, Specials {

    int maxSpeed;
    int weight;
    int width;
    String color;

    su27 (int maxSpeed, int weight, int width, String color) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.width = width;
        this.color = color;
    }

    @Override
    public void left() {
        System.out.println("Plane is moving left" + " " + randomize(300,100));
    }

    @Override
    public void right() {
        System.out.println("Plane is moving right" + " " + randomize(300,100));
    }

    @Override
    public void up() {
        System.out.println("Plane is moving up" + " " + randomize(300,100));
    }

    @Override
    public void down() {
        System.out.println("Plane is moving down" + " " + randomize(300,100));
    }

    @Override
    public int randomize(int max, int min) {
        Random r = new Random();
        int diff = max - min;
        int i = r.nextInt(diff + 1);
        return i+=min;
    }

    @Override
    public void nitroBoost() {
        System.out.println("Speed after boost is: "+ randomize(1000, maxSpeed));
    }

    @Override
    public void stealthTechnology() {
        System.out.println("Stealth technology is activated for: " + randomize(300, 60) + "Seconds");
    }

    @Override
    public void nuclearShock() {
        System.out.println( randomize(0,10) + "nuclear shelves will be eliminated: ");
    }
}
