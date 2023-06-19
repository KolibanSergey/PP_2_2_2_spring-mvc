package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    List<Car> returnCount(Integer countCars);

    List<Car> getCars();

}
