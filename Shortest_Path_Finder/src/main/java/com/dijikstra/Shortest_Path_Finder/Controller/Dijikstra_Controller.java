package com.dijikstra.Shortest_Path_Finder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Dijikstra")
public class Dijikstra_Controller {
	@GetMapping("/main")
    public String openPage() {
		
        return "ShortestPathFinder";
    }
}
