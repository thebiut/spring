package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class SimpleController {


    @RequestMapping("")
    fun getHome(model: Model):String{
        model.addAttribute("uczen",Student("Damian","Barcik"))
        return "home"
    }
    @RequestMapping("index")
    fun getInfo(model: Model):String{
        model.addAttribute("student",Student("Damian","Barcik"))
        model.addAttribute("name","Damian")
        model.addAttribute("surname","Barcik")
        //model.addAttribute("array",IntArray(10){it*it})
        return "index"
    }


}
