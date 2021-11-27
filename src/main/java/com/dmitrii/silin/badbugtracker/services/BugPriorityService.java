package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.BugPriorityEntity;
import com.dmitrii.silin.badbugtracker.repositories.BugPriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BugPriorityService {

    private BugPriorityRepo bugPriorityRepo;

    @Autowired
    public BugPriorityService(BugPriorityRepo bugPriorityRepo) {
        this.bugPriorityRepo = bugPriorityRepo;
    }

    public List<BugPriorityEntity> getAllBugPriorityOption() {
        return bugPriorityRepo.findAll();
    }
}
