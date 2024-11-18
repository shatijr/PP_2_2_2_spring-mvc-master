package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>(List.of(
            new Car("Toyota", 10000, 1999),
            new Car("Opel", 12000, 2005),
            new Car("Lada", 5000, 2013),
            new Car("Buggati", 30000, 2015),
            new Car("Skoda", 15000, 2014)
    ));

    @Override
    public List<Car> getCarList(Integer count) {
        return carList.stream().limit(count).toList();
    }
}
