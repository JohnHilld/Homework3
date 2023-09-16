public class Cat extends Animal {
    private static int catPopulation;

    public Cat() {
        catPopulation++;
        System.out.println("Create 1 cat.");
    }

    @Override
    public void run(int obstacleLen) {
        if(obstacleLen > 200 || obstacleLen <= 0) {
            System.out.println("Cat can't run this distance: " + obstacleLen + "м!");
            return;
        }

        System.out.println("Cat run " + obstacleLen + "м.");
    }

    @Override
    public void swim(int obstacleLen) {
        System.out.println("Cat can't swim!");
    }

    public static int count() {
        return catPopulation;
    }
}
