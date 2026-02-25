public class Leohr extends Monster{
    private String name;

    public Leohr(String name){
        super(name);
    }


    public String yell(){
        return getName() + " yelled at a student. They fell over. \n";
    }

    public String rage(){
        return getName() + " raged and the class ran away. \n";
    }


}
