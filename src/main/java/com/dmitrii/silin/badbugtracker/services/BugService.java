package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.Bug;
import com.dmitrii.silin.badbugtracker.repositories.BugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    private final BugRepo bugRepo;

    @Autowired
    public BugService(BugRepo bugRepo) {
        this.bugRepo = bugRepo;
    }

    public List<Bug> getAllBugs() {
        return bugRepo.findAll();
    }
}
