package com.dms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rishi on 7/29/2016.
 */
@Controller
public class testController {
    @RequestMapping(value="/test")
    public String test(){

        return "admin/building/greet";
    }
    @ModelAttribute("allFeatures")
    public List<Integer> populateFeatures() {
        return  Arrays.asList(1, 2, 3, 4, 5, 6);
    }

}
