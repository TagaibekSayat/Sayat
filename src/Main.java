public class Main {
    public static void main(String[] args) {
        Birds birds = new Birds();
        System.out.println(birds.getWeight(5000)+"kg");
        WalkBirds wb =new WalkBirds();
        System.out.println(wb.getWalk(25)+"cm");
        Runnig run =new Runnig();
        System.out.println(run.getRun(20)+"k/t");
        Swim swiming = new Swim();
        System.out.println(swiming.getSwim(9)+"k/t");
        Fly flying = new Fly();
        System.out.println(flying.getFly(8000));
    }
}