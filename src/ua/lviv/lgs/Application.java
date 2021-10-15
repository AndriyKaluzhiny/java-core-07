package ua.lviv.lgs;

public class Application {

    public static void main(String[] args) {
        su27 su27 = new su27(250,200,100, "Green");

        su27.startEngines();
        su27.takeOff();
        su27.up();
        su27.left();
        su27.right();
        su27.down();
        su27.stealthTechnology();
        su27.nitroBoost();
        su27.landing();
    }
}
