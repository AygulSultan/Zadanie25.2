public class City implements Comparable<City> {
    private Double code;
    private  String name;

    public City(int code, String name) {
        this.code = (double) code;
        this.name = name;
    }

    public Double getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = (double) code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return (int) (o.code-this.code);
    }
}
