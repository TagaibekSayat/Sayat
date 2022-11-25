public class Birds implements Srfwb{
    int years;
    int day;
    int weight;
    int getWeight(int weight){
        this.weight = weight;
        int gram = weight / 1000;
        return gram;
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
