package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Autowired
    private static List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("AUDI", "Red", 1993));
        carList.add(new Car("BMW", "Blue", 1998));
        carList.add(new Car("Lada", "White", 2000));
        carList.add(new Car("Tayota", "Black", 1999));
        carList.add(new Car("Porshe", "White", 2018));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public List<Car> returnCount(Integer countCars) {
        List<Car> list = getCars();
        if (countCars == null || countCars < 0 || countCars > list.size()) {
            countCars = list.size();
        }
        return list.stream().limit(countCars).toList();
    }

}
