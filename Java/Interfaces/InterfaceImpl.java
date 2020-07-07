package Interfaces;

class Person{
    String name;
    Meal meal;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void eat(Meal meal){
//        System.out.println(meal);
//
//    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}

public class InterfaceImpl implements Meal{
    @Override
    public void setMeal() {

    }
}
