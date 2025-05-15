package com.N_Queens_Visualizer.N_Queens_Visualizer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/N-Queen_Visualizer")
public class controller_main {
	@GetMapping("/main")
    public String openPage() {
        return "main_page";
    }

}
