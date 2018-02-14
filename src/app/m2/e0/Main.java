package app.m2.e0;


public class Main {

    public static void main(String[] args) {
        startConcert(new HumanSinger("Max"));
    }

    private static <T extends Human & ISinger>void startConcert(T maestro) {
        System.out.printf("On the stage is: %s", maestro.getName());
        maestro.sing();
    }

}
