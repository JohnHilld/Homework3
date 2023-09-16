public class Dog extends Animal {
    private static int dogPopulation;

    public Dog() {
        dogPopulation++;
        System.out.println("Create 1 dog!");
    }

    @Override
    public void run(int obstacleLen) {
        if(obstacleLen > 500 || obstacleLen <= 0) {
            System.out.println("Dog can't run this distance: " + obstacleLen + "м!");
            return;
        }

        System.out.println("Dog run " + obstacleLen + "м.");
    }

    @Override
    public void swim(int obstacleLen) {
        if(obstacleLen > 10 || obstacleLen <= 0) {
            System.out.println("Dog can't swim this distance: " + obstacleLen + "м!");
            return;
        }

        System.out.println("Dog swim " + obstacleLen + "м.");
    }

    public static int count() {
        return dogPopulation;
    }
}
