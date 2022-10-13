public enum NamesOfAnimals {

    FOX("Ruby") {
        String getName() {
            return name;
        }
    }, CAT("Moosya") {
        String getName() {
            return name;
        }
    }, DOG("Rambo") {
        String getName() {
            return name;
        }
    };
    String name;

    NamesOfAnimals(String name) {
        this.name = name;
    }

    String getName() {
        return null;
    }

}
