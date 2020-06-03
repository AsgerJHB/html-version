package com.example.demo.Controllers;

import com.example.demo.Model.RentalModel;
import com.example.demo.Reps.IRentalRep;
import com.example.demo.Reps.RentalRep;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RentalController {

    private IRentalRep rentalRepository;

    public RentalController() { rentalRepository = new RentalRep(); }



    @GetMapping("/rentalform")
    public String rentalForm (Model model) {
        RentalModel newRental = new RentalModel();
        model.addAttribute("rentadd", newRental);

        return "rentalform";

    }

    @PostMapping("/rentalform")
    public String rentalCreated(@ModelAttribute RentalModel rentalModel) {
        rentalRepository.createRental(rentalModel);

        return "index";
    }

}
