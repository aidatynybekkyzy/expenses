package com.example.demoTownsPratice.controller;

import com.example.demoTownsPratice.model.Towns;
import com.example.demoTownsPratice.service.TownsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Timer;
@RestController

public class TownsController {

@Autowired
        private TownsService myService;

@CrossOrigin
        @GetMapping("/{id}")
        public Towns getThing(@PathVariable("id") int id)
        {
            return myService.getThing(id);
        }
@CrossOrigin
        @GetMapping("/all")
        public List<Towns> getAllThings(){
            return myService.getAllThings();
        }
@CrossOrigin
        @PostMapping
        public Towns addThing(@RequestBody Towns thing){
            return myService.addThing(thing);
        }
    }

