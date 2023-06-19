package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;
import java.util.List;


@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer allCars, Model model) {
        List<Car> cars = carService.returnCount(allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
