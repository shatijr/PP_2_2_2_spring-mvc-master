package web.service;

import model.Car;

import java.util.List;


public interface CarService {
    List<Car> getCarList (Integer count);

}
