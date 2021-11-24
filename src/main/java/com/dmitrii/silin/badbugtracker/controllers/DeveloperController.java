package com.dmitrii.silin.badbugtracker.controllers;

import com.dmitrii.silin.badbugtracker.entities.Developer;
import com.dmitrii.silin.badbugtracker.services.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteDeveloper(@PathVariable("id") Long id) {
        developerService.deleteDeveloper(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Developer updateDeveloper(@RequestBody Developer developer) {
        return developerService.updateDeveloper(developer);
    }





}
