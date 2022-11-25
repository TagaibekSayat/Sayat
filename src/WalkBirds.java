public class WalkBirds extends Birds implements Srfwb{
    float height;
    int years;
    int day;
    float getWalk(float height){
        this.height = height;

        height = height/100;
        return height;
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
