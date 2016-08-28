package com.dms.controller;

import com.dms.model.Building;
import com.dms.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by Rishi on 7/31/2016.
 */
@Controller
@RequestMapping(value = "/admin/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    private static String PATH="/admin/building/";


//    @RequestMapping(value = "/wlcm")
//    public String welcomePage(Model model){
//        return PATH+"greet";
//    }

    @RequestMapping(value = "/all")
    public String allBuilding(Model model){
        model.addAttribute("building", buildingService.getAll());
        return PATH+"list";
    }


@RequestMapping(value="/add", method=RequestMethod.GET)
public String addBuildingForm(@ModelAttribute Building building){
    return PATH+"add";
}

@RequestMapping(value = "/add", method=RequestMethod.POST)
    public String saveBuilding(Model model , @Valid Building building, BindingResult result, RedirectAttributes redirect){
    String view= "redirect:"+PATH+"add";
    if(result.hasErrors()){
        redirect.addFlashAttribute("message", "please correct the following information");

    }
    else{
        buildingService.add(building);
        redirect.addFlashAttribute("message","Building Added Successfully");

    }
    return view;
}

    @RequestMapping(value="/delete/{id}")
    public String deleteBuilding(@PathVariable long id){
        buildingService.delete(id);
        return "redirect:"+PATH+"all";
    }

    @RequestMapping(value = "/edit/{id}")
    public String editBuilding(@PathVariable long id, Model model){
        Building building = buildingService.findBy(id);
        model.addAttribute("building",building);
        return "/admin/building/add";


    }



}
