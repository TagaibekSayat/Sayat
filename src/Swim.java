public class Swim extends Birds implements Srfwb{

    int years;
    int day;
    float isUnderwater;
    float getSwim(float isUnderwater){
        this.isUnderwater = isUnderwater;
        isUnderwater = isUnderwater/3.6F;

        return isUnderwater;
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
