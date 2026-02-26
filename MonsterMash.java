public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); //NOT ALLOWED
    //Because Monster has a modified constructor but not a default constructor, Monster does not INHERIT a default constructor.
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a monster of your new Type
    //Declare your new Type of Monster
    //Bonus challege: Add an instance field
    Monster leohr = new Leohr("leohr");

    System.out.println(leohr);

    System.out.println(((Leohr)leohr).yell());

    System.out.println(((Leohr)leohr).rage());


    
    Skeleton skelly = new Skeleton();

    System.out.println(skelly);

    skelly = new Skeleton("Giant Skelly");

    System.out.println(skelly);
  }
}
