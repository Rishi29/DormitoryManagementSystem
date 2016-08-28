package com.dms.controller;

import com.dms.model.Item;
import com.dms.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
 * Created by Rishi on 8/4/2016.
 */
@Controller
@RequestMapping(value = "/admin/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    public static String PATH="/admin/item/";

@RequestMapping(value = "/all")
public String allItem(Model model){
    model.addAttribute("items",itemService.getAll());
    return PATH+"list";
}

@RequestMapping(value = "/add")
    public String addItemForm(@ModelAttribute Item item){
    return PATH+"add";
}

@RequestMapping(value = "/add", method = RequestMethod.POST)

    public String saveItem(Model model, @Valid Item item, BindingResult result, RedirectAttributes redirect){
    String view= "redirect:"+PATH+"add";
    if(result.hasErrors()){
        redirect.addFlashAttribute("message","please correct the following information");

    }
    else
    {
        itemService.add(item);
        redirect.addFlashAttribute("message","Item added succesfully");
    }
    return  view;
}

@RequestMapping(value = "/delete/{id}")
    public String deleteId(@PathVariable long id){
    itemService.delete(id);
    return "redirect:"+PATH+"all";
}

@RequestMapping(value = "/edit/{id}")
    public String editItem(@PathVariable long id, Model model){
    Item item= itemService.findBy(id);
    model.addAttribute("item", item);
    return PATH+"add";
}




}
