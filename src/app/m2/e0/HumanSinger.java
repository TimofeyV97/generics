package app.m2.e0;

public class HumanSinger extends Human implements ISinger{

    public HumanSinger(final String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("trololo");
    }

}
