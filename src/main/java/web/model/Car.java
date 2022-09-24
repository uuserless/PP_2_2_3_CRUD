package web.model;

public class Car {

    private final int id;
    private final String model;
    private final int series;

    public Car(int id,String model,int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}
