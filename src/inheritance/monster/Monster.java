package inheritance.monster;

public class Monster {
    public double speedMove;
    public double hitPoint;

    public void atack(){
        /*
        DEAULT IMPLEMENTATION ATACK
         */
        System.out.println("This is method atack from class Monster");
    }

    public Monster(){
        System.out.println("Default constructor from class Monster.");
    }

    public Monster(double speedMove, double hitPoint){
        this.speedMove = speedMove;
        this.hitPoint = hitPoint;
        System.out.println("Not default constructor from class Monster.");
    }

}
