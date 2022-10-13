public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Fox", "Orange", "Running", "Hunting");
        Animal a2 = new Animal("Frog", "Green", "Swimming", "Eating");
        Animal a3 = new Animal("Bug", "Brown", "Running", "Eating");
        Animal a4 = new Animal("Bird", "White", "Flying", "Hunting");

        System.out.println("Second habbit of " + a1.getName() + " is " + a1.getSecondHabbits());

        System.out.println("Number of Animals: " + Animal.getNumberOfAnimals());

        System.out.println("The donor's name is " + a1.infoAboutDonors());

//        for (int i = 0; i < 3; i++) {
//            System.out.println(NamesOfAnimals.CAT.getName());
//        }
        int random = (int)Math.random()*10;
        System.out.println("Random number is: " + random);
        int randInt = (int)random;
        System.out.println("Random number is: " + randInt);
        switch (randInt) {
            case 1:
                System.out.println(NamesOfAnimals.FOX.getName());
                break;
            case 2:
                System.out.println(NamesOfAnimals.CAT.getName());
                break;
            case 3:
                System.out.println(NamesOfAnimals.DOG.getName());
                break;
            default:
                System.out.println("Something went wrong.");

//                for (int i = 0; i < 10; i++) {
//                    int rand = (int)(Math.random() * 10);
//
//                    // Output is different everytime this code is executed
//                    System.out.println(rand);
//                }

        }
    }
}