package com.example.demo;



import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repository")



public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/user")
    public ModelAndView getUserList(){
        ModelAndView model = new ModelAndView("users");
        model.addObject("list",userRepository.findAll());


        return model;
    }


}
