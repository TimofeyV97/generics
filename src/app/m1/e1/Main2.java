package app.m1.e1;

public class Main2 {

    public static void main(String[] args) {
        final Human h = new Human();
        final SpaceShip2<Human> ss = new SpaceShip2<>(h);
//        ss.showLFName();
        final Human h2 = ss.getLF();
    }

}
