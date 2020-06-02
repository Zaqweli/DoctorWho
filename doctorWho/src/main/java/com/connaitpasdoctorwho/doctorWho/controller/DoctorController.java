package com.connaitpasdoctorwho.doctorWho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String showDoc1(){
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String showDoc10(){
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String showDoc13(){
        return "Jodie Whittaker";
    }
}
