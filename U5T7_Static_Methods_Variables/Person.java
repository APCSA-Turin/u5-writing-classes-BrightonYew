package U5T7_Static_Methods_Variables;

public class Person {
    private boolean isVaccinated;
    private String name;

    public Person(String name) {
        this.name = name;
        isVaccinated = false;
    }

    public String getName() {
        return name;
    }
    
    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void vaccinate() {
        isVaccinated = true;
    }
}
