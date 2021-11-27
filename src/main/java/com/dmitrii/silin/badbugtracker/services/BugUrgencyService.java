package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.BugUrgencyEntity;
import com.dmitrii.silin.badbugtracker.repositories.BugUrgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BugUrgencyService {

    private BugUrgencyRepo bugUrgencyRepo;

    @Autowired
    public BugUrgencyService(BugUrgencyRepo bugUrgencyRepo) {
        this.bugUrgencyRepo = bugUrgencyRepo;
    }

    public List<BugUrgencyEntity> getAllBugUrgencyOptions() {
        return bugUrgencyRepo.findAll();
    }
}
