package myapp.controllers;

import myapp.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PANNA on 31.03.2017.
 */
@Controller
public class HomeController {
    public static final int STUDENTS_ON_THE_PAGE = 25;
    @Autowired
    private StudentsService studentsService;
    @RequestMapping({"/","/home"})
    public String showHomePage(Model model){
        model.addAttribute("mainText","Hello World");
        model.addAttribute("studentsList",studentsService.getAllStudents());
        return "home";
    }
}