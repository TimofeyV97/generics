package app.m1.e1;


public class Main {

    public static void main(String[] args) {
        final Human h = new Human();
        final SpaceShip ss = new SpaceShip(h);
        ss.showLFName();
//        final Human h2 = (Human) ss.getLF();
        final LifeForm lf = ss.getLF();
    }

}
