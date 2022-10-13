public class Animal implements Donors{
    private String name;
    private String color;
    private HabbitsOfAnimal habbits = new HabbitsOfAnimal();
    private static int numberOfAnimals = 0;

    private class HabbitsOfAnimal {
        private String firstHabbit;
        private String secondHabbit;
    }

    public Animal(String name, String color, String firstHabbit, String secondHabbit) {
        this.name = name;
        this.color = color;
        this.habbits.firstHabbit = firstHabbit;
        this.habbits.secondHabbit = secondHabbit;
        new CounterOfAnimals().setCount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFirstHabbits(String habbit) {
        this.habbits.firstHabbit = habbit;
    }

    public void setSecondHabbits(String habbit) {
        this.habbits.secondHabbit = habbit;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFirstHabbits() {
        return habbits.firstHabbit;
    }

    public String getSecondHabbits() {
        return habbits.secondHabbit;
    }

    private static class CounterOfAnimals {
        private void setCount() {
            numberOfAnimals += 1;
        }
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }
}
