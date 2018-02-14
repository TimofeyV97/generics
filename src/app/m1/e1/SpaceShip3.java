package app.m1.e1;


public class SpaceShip3<T extends LifeForm> {

    private final T lf;

    public SpaceShip3(final T lf) {
        this.lf = lf;
    }

    public T getLF() {
        return this.lf;
    }

    public void showLFName() {
        System.out.println(lf.getName());
    }

}
