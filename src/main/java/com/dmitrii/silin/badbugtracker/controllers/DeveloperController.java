package com.dmitrii.silin.badbugtracker.controllers;

import com.dmitrii.silin.badbugtracker.entities.DeveloperEntity;
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<DeveloperEntity> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteDeveloper(@PathVariable("id") Long id) {
        developerService.deleteDeveloper(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public DeveloperEntity updateDeveloper(@RequestBody DeveloperEntity developer) {
        return developerService.updateDeveloper(developer);
    }

    @RequestMapping(value = "/create/", method = RequestMethod.POST)
    public DeveloperEntity createDeveloper(@RequestBody DeveloperEntity developer) {
        return developerService.addDeveloper(developer);
    }

}
