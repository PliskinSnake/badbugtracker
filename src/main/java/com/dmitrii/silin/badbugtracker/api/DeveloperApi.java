package com.dmitrii.silin.badbugtracker.api;


import com.dmitrii.silin.badbugtracker.entities.DeveloperEntity;
import com.dmitrii.silin.badbugtracker.services.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/developers")
public class DeveloperApi {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperApi(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    public List<DeveloperEntity> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }
}
