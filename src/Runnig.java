public class Runnig extends Birds implements Srfwb {
    float speed;
    int years;
    int day;
    float getRun(float speed){
        this.speed = speed;
        speed = speed / 3.6F;

        return speed;


    }

    @Override
    public void liveing() {
        System.out.println(years * 365 + "day living");
    }

    @Override
    public void eating() {
        System.out.printf(day * 2+"time eat");
    }
}
