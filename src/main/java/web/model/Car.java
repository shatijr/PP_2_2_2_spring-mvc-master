package web.model;

public class Car {
    String model;
    int price;
    int dataRelease;

    public Car(String model, int price, int dataRelease) {
        this.model = model;
        this.price = price;
        this.dataRelease = dataRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDataRelease() {
        return dataRelease;
    }

    public void setDataRelease(int dataRelease) {
        this.dataRelease = dataRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", dataRelease=" + dataRelease +
                '}';
    }



}
