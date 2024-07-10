package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
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
        return carsList.stream().limit(number).collect(Collectors.toList());
    }
}

