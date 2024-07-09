package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarsController {
    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCarsCount(@RequestParam(value = "count", required = false, defaultValue = "5") int cnt, Model model) {
        model.addAttribute("count", cnt);
        model.addAttribute("list", carService.getCarsByNumber(cnt));
        return "cars";
    }


}

