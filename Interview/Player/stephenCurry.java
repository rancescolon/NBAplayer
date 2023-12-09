package Player;

public class stephenCurry extends Shooter{
    public stephenCurry(double height, String name, int shootRating){
        super(height, name,shootRating);
    }

    @Override
    public void shootingRating(){
        System.out.println(getName() + "Shoots with " + getShootingRating()+"% efficacy");
    }


    @Override
    public String dibbleSpeed(){return "dibble speed:99";}

    public static void main(String[] args){
        stephenCurry curry = new stephenCurry(74," Stephen Curry ",99);
        curry.runSpeed();
        curry.jumpHeight();
        System.out.println(curry.getName() + "can"+ curry.canDunk());

        String[] splits = curry.dibbleSpeed().split(":");
        int dibbleSpeed = Integer.parseInt(splits[1]);
        if (dibbleSpeed > 90){System.out.println(curry.getName() + "is a Dibble god");}

        curry.shootingRating();
        curry.shootIn(curry.getShootingRating());
        curry.setShootingRating(18);
        curry.shootingRating();
        curry.shootIn(curry.getShootingRating());
    }
}
