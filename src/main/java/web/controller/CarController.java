package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(
            value = "count",
            defaultValue = "5")
            int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
    return "cars";
    }

}
