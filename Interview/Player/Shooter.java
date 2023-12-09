package Player;

abstract class Shooter implements NbaPlayer {
    // since a abstract class it can choose to implement a method or pass off to be  subclass
    private double height;
    private String name;
    private int shootingRating;
    public Shooter(double height, String name, int shootRating){
        this.height = height;
        this.name = name;
        this.shootingRating = shootRating;
    }
    public double getHeight(){return height;}
    public String getName(){return name;}
    public int getShootingRating(){return shootingRating;}
    public void setShootingRating(int shootingRating){this.shootingRating = shootingRating;}
    @Override
    public void runSpeed(){
        System.out.println("Run speed: 8.3 mps");
    }
    @Override
    public void jumpHeight(){
        System.out.println(getName() + "can jump 28 inches");
    }
    public String canDunk(){
        if (getHeight() + 28 + 36 >= 126){return " YAMMMM IT!!";}

        else{return "'t dunk";}
    }
    public void shootIn(int shootingRating){
        double random = Math.random() * 100;
        if (shootingRating > random){System.out.println("THREEEE BALLLLLL!!!!");}
        else {
            System.out.println("BRICKKKK");
            System.out.println("-_-");
            System.out.println(" ^  ");
            System.out.println("sad face");
        }
    }
}