public class Fly extends WalkBirds implements Srfwb{
    int height;
    int years;
    int day;
    String result = "";
    public String getFly(int height) {
        this.height = height;
        if ((height > 7000) && (height < 13000)){
            result = "Warning!The bird is flying at the height of the plane!";
        }else{
            result =  "Don't worry, the plan is not flying at altitude";
        }
        return result;
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
