public class Animal {
    private static int population;

    public Animal() {
        population++;
        System.out.println("Create 1 animal");
    }

    public void run(int obstacleLength) {
        System.out.println("Animal run " + obstacleLength + "м.");
    }

    public void swim(int obstacleLength) {
        System.out.println("Animal swim " + obstacleLength + "м.");
    }

    public static int count() {
        return population;
    }
}
