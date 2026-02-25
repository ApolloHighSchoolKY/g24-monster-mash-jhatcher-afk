public class Witch extends Monster{
    public Witch(String name){
        super(name);
    }


    //Overide kill
    public String kill(){
        return getName() + " killed a victim.  Splish Splash. \n";
    }

    public String fly(){
        return getName() + " went flying and cackling on their broomstick. \n";
    }
}
