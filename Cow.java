/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private int milk;

    public Cow()
    {
        super("MOO", 0);
        milk = 0;
    }

    public Cow(int age, int milk)
    {
        super("MOO", age);
        this.milk = milk;
    }
    public String speak()
    {
        return "MOOO";
    }

    public String toString()
    {
     	return super.toString();
    }

    public void eat(){
        super.eat();
        milk++;
    }

    public int getMilk(){
        return milk;
    }
}