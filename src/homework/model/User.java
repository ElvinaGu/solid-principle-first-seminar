package homework.model;

public class User implements Entity{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
