package app.m1.e1;

public class Main3 {

    public static void main(String[] args) {
        final Human h = new Human();
        final SpaceShip3<Human> ss = new SpaceShip3<>(h);
        ss.showLFName();
        final Human h2 = ss.getLF();
    }

}
