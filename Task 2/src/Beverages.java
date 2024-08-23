abstract class Beverages {
    final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    abstract void addCondiments();

    abstract void setWantsExtras();
}

class Tea extends Beverages {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void setWantsExtras() {
        System.out.println("Adding honey...");
    }
}

class Coffee extends Beverages {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void setWantsExtras() {
        System.out.println("Adding vanilla syrup");
    }
}
