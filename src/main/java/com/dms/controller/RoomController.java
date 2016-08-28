package com.dms.controller;

import com.dms.Enums.RoomType;
import com.dms.model.Building;
import com.dms.model.Item;
import com.dms.model.Room;
import com.dms.service.BuildingService;
import com.dms.service.ItemService;
import com.dms.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rishi on 8/5/2016.
 */
@Controller
@RequestMapping(value = "/admin/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private ItemService itemService;

    private static String PATH="/admin/room/";

//    @RequestMapping(value = "/createRoom")
//    public String createRoom(Model model){
//        model.addAttribute("room",roomService.getAll());
//        return PATH+"createRoom";
//    }
//
//    @RequestMapping(value="/add", method= RequestMethod.GET)
//    public String addBook(@ModelAttribute Book book, HttpSession session, Model model){
//        if(!loggedIn(session)) return "redirect:/admin";
//        model.addAttribute("categories", categoryService.getAll());
//        return "/admin/view/addBook";
//    }

    @RequestMapping(value="/createRoom",method = RequestMethod.GET)
    public String CreateRoom(@ModelAttribute Room room,Model model){
        model.addAttribute("buildingList",buildingService.getAll());
        model.addAttribute("itemList",itemService.getAll());
        return PATH+"createRoom";
    }
//    @RequestMapping(value = "/add", method=RequestMethod.POST)
//    public String saveBuilding(Model model , @Valid Building building, BindingResult result, RedirectAttributes redirect){
//        String view= "redirect:"+PATH+"add";
//        if(result.hasErrors()){
//            redirect.addFlashAttribute("message", "please correct the following information");
//
//        }
//        else{
//            buildingService.add(building);
//            redirect.addFlashAttribute("message","Building Added Successfully");
//
//        }
//        return view;
//    }


    @RequestMapping(value = "/createRoom", method = RequestMethod.POST)
    public String addRoom(Model model, @Valid Room room, @RequestParam(value = "item[]") String[] items, BindingResult result, RedirectAttributes redirect){
        String view="redirect:"+PATH+"createRoom";

        if(result.hasErrors()){
            redirect.addFlashAttribute("message", "Please correct the following information");
        }
        else{
            List<Item> list= new ArrayList<>();
            for(int i=0 ;i<items.length;i++){
                list.add(itemService.findBy(Long.parseLong(items[i])));

            }
            //System.out.println(list);
            room.setItemList(list);
            roomService.add(room);
            redirect.addAttribute("message","message added successfully");
        }
        return view;
    }


    @ModelAttribute("roomType")
    public List<RoomType> populateRoomType(){
        return Arrays.asList(RoomType.values());
    }

//    @ModelAttribute("allFeatures")
//    public List<Integer> populateFeatures() {
//        return  Arrays.asList(1, 2, 3, 4, 5, 6);
//    }

}
