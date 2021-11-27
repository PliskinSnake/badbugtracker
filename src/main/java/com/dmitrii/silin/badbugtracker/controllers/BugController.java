package com.dmitrii.silin.badbugtracker.controllers;

import com.dmitrii.silin.badbugtracker.entities.BugEntity;
import com.dmitrii.silin.badbugtracker.services.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bug")
public class BugController {

    private final BugService bugService;

    @Autowired
    public BugController(BugService bugService) {
        this.bugService = bugService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<BugEntity> getAllBugs() {
        return bugService.getAllBugs();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBug(@PathVariable("id") Long id) {
        bugService.removeBug(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public BugEntity updateBug(@RequestBody BugEntity bug) {
        return bugService.updateBug(bug);
    }

}
