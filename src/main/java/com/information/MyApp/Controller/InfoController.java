package com.information.MyApp.Controller;

import com.information.MyApp.Entity.MyInfo;
import com.information.MyApp.Repository.MyInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {

    @Autowired
    private MyInfoRepo myinfoRepo;
    @GetMapping("/myinfo-form")
    public String showForm(Model model) {
        model.addAttribute("MyInfo", new MyInfo());
        return "myinfo-form";
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute MyInfo myInfo){
        myinfoRepo.save(myInfo);
        return "form-success";

    }
}