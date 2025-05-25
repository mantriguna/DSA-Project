package com.Sudoku_Solver.implementation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Sudoku_Solver")
public class Sudoku_Controller {
	@GetMapping("/main")
    public String openPage() {
		
        return "Sudoku";
    }

}
