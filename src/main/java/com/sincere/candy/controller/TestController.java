package com.sincere.candy.controller;

import com.sincere.candy.model.Pet;
import com.sincere.candy.service.PetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
@Api(description = "textController")
public class TestController {

    @Autowired
    private PetService petService;

    @GetMapping("index")
    @ApiOperation(value = "simple return string")
//    public String testIndex(){
//        return "my first web app";
//    }

    public String index(HttpServletRequest request){
        List<Pet> allPets = petService.getAllPets();
        System.out.println(allPets);

        String userName = request.getParameter("userName");
        System.out.println(userName);
        return "index";
    }

}