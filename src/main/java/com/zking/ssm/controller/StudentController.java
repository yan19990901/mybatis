package com.zking.ssm.controller;

import com.zking.ssm.model.Student;
import com.zking.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init...");
        model.addAttribute("classList", new String[]{"T220", "T225", "T230"});

        Student student = new Student();
        student.setAge(19);
        model.addAttribute("student", student);
    }

    @RequestMapping("toAdd")
//    @RequestMapping(value = "toAdd",method = RequestMethod.GET)
//    @GetMapping("/toAdd")
//    @PostMapping("/toAdd")
    public String toAdd(Model model) {
        System.out.println("toAdd...");
        String[] classList = (String[]) model.asMap().get("classList");
        System.out.println(Arrays.toString(classList));
        return "addStudent";
    }

    @PostMapping("/add")
    public ModelAndView add(ModelAndView modelAndView, Student student, RedirectAttributes redirectAttributes) {
        System.out.println("add");
        System.out.println(student);
        studentService.add(student);

        redirectAttributes.addAttribute("id", 110);

        modelAndView.setViewName("redirect:/stu/toAdd");
        return modelAndView;
    }
}
