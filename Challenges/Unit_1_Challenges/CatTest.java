public class CatTest
{
    public static void main(String[] args) 
    {
        Cat bob = new Cat("Tabby", "Bob", 6, "Rainbow", 43.2, true);
        Cat moskins = new Cat("Tortie", "Molly Moskins", 1, "Tan", 12, true);
        System.out.println(bob.speak());
        System.out.println(moskins.speak());
        System.out.println(moskins.name + "'s weight change to " + moskins.eat(40));
        
    }
}
