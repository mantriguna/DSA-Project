package com.Visualization.apple.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Tree_Visualization")
public class main_controller {
	@GetMapping("/main")
    public String openPage() {
		
        return "main_file";
    }

}
