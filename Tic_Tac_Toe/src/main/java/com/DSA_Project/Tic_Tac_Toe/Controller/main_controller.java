package com.DSA_Project.Tic_Tac_Toe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Tic_Tac_Toe")
public class main_controller {
	@GetMapping("/main")
    public String openPage() {
		
        return "TTT";
    }
}
