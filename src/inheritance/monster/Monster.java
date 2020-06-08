package inheritance.monster;

public abstract class Monster {
    protected double speedMove;
    protected double hitPoint;

    protected void atack(){
        /*
        DEAULT IMPLEMENTATION ATACK
         */
        System.out.println("This is method atack from class Monster");
    }

    protected abstract void description();

    public Monster(){
        System.out.println("Default constructor from class Monster.");
    }

    public Monster(double speedMove, double hitPoint){
        this.speedMove = speedMove;
        this.hitPoint = hitPoint;
        System.out.println("Not default constructor from class Monster.");
    }

}
