public class Cat {
    
// Instance Variables
    private String breed;
    private int age;
    private String color;
    private double weight;
    private boolean isAlive;
    public String name;

//Constructor
    public Cat(String theBreed, String theName, int theAge, String theColor, double theWeight, boolean alive) {
        breed = theBreed;
        age = theAge;
        color = theColor;
        weight = theWeight;
        isAlive = alive;
        name = theName;
    }
    
    public String speak() {
        return (name + "'s breed is " + breed + ". Meow!");
    }
    
    public double eat(double food) { 
        return weight + food;
    }
    
    public double getWeight() {
        return weight;
    }
}
