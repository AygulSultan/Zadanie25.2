import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City(312, "Bishkek"));
        cities.add(new City(3124, "Osh"));
        cities.add(new City(3125, "Naryn"));
        cities.add(new City(3126, "Talas"));
        cities.add(new City(3127, "Batken"));
        cities.add(new City(3128, "KaraKol"));
        cities.add(new City(3129, "JalalAbad"));

        TreeSet<City> treeSet = new TreeSet<>();
        for (City a : cities) {
            if (a.getCode() % 2 != 0) {
                treeSet.add(a);
            }
        }
        System.out.println(treeSet);


    }
}
