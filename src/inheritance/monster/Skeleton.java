package inheritance.monster;

public class Skeleton extends Monster {
    String typeWeapon;
    public void atack(){
        super.atack();
        /*
        ADDITIONAL INSTRUCTION ATTACK
         */
        System.out.println("This is method attack from class Skeleton.");
    }

    @Override
    protected void description() {

    }

    public Skeleton(){
        System.out.println("Default constructor from class Skeleton.");
    }

    public Skeleton(double speedMove, double hitPoint){
        super(speedMove, hitPoint);
        System.out.println("Not default constructor with two paramters, from class Skeleton.");

    }

    public Skeleton(double speedMove, double hitPoint, String typeWeapon){
        super(speedMove, hitPoint);
        this.typeWeapon = typeWeapon;
        System.out.println("Not default constructor with tree parametrs, from class Skeleton.");
    }
}
