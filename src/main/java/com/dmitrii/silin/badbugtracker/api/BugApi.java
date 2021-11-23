package com.dmitrii.silin.badbugtracker.api;


import com.dmitrii.silin.badbugtracker.entities.Bug;
import com.dmitrii.silin.badbugtracker.services.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/bugs")
public class BugApi {

    final private BugService bugService;

    @Autowired
    public BugApi(BugService bugService) {
        this.bugService = bugService;
    }
    
    @GetMapping
    public List<Bug> getAllBugs() {
        return bugService.getAllBugs();
    }


}
