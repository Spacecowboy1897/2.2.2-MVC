package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    public CarServiceImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car("black", "lada", 100));
        carsList.add(new Car("white", "faw", 200));
        carsList.add(new Car("greem", "byd", 300));
        carsList.add(new Car("yellow", "bmw", 500));
        carsList.add(new Car("orange", "kia", 555));
    }

    @Override
    public List<Car> getCarsByNumber(int number) {
        List<Car> carByNumberList = new ArrayList<>();
        if (number < 5 & number > 0) {
            for (int i = 0; i < number; i++) {
                carByNumberList.add(carsList.get(i));
            }
            return carByNumberList;
        } else {
            return carsList;
        }
    }
}

