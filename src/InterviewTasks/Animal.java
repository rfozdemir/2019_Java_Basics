package InterviewTasks;

public class Animal {
    String type="canine";
    int maxSpeed=60;
    Animal(){

    }
    Animal(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }

}
class WildAnimal extends Animal{
    String bounds;
    WildAnimal(String bounds){
       // super();

this.bounds=bounds;

    }
    WildAnimal(String type, int maxSpeed, String t){


    }


    public static void main(String[] args) {
        WildAnimal wolf=new WildAnimal("Long");
        System.out.println(wolf.type+" : "+wolf.maxSpeed+" : "+wolf.bounds);




    }









}