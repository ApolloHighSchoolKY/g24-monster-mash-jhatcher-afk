public class Pig extends Animal{
    private int water;

    public Pig(){
        super("OINK", 0);
        water = 0;
    }

    public Pig(int age, int water)
    {
        super("OINK" , age);
        this.water = water;
    }

    public void eat(){
        super.eat();
        water++;
    }

    public int getWater(){
        return water;
    }
    
}