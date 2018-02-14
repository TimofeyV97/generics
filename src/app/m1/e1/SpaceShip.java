package app.m1.e1;


public class SpaceShip {

    private final LifeForm lf;

    public SpaceShip(final LifeForm lf) {
        this.lf = lf;
    }

    public LifeForm getLF() {
        return this.lf;
    }

    public void showLFName() {
        System.out.println(lf.getName());
    }

}
