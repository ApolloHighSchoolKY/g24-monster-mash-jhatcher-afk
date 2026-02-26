/**
* i
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */
import java.util.ArrayList;

public class Farm {

    public static void main(String[]args){
      ArrayList<Animal> farm = new ArrayList<Animal>();

      farm.add(new Cow(1,0));
      farm.add(new Pig(2,0));
      farm.add(new Cow(3,0));
      farm.add(new Cow(4,0));

      for(int i = 0; i<farm.size();i++)
      {
        farm.get(i).eat();

        System.out.println("The animal in the position " + i + " has eaten.\n");

        farm.get(i).speak();
        
        System.out.println("The animal in the position " + i + " says " + farm.get(i).speak() + "\n ");

        if(farm.get(i).getAge() > 25)
        {
            farm.get(i).kill();
        }
        System.out.println("Animal in the position " + i + " was killed.\n ");

        if(i > 0)
        {
            System.out.println(farm.get(i).equals(farm.get(i-1)));
        }
      }
    }
    }
    
    


