package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.BugStatusEntity;
import com.dmitrii.silin.badbugtracker.repositories.BugStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BugStatusService {

    private final BugStatusRepo bugPriorityRepo;

    @Autowired
    public BugStatusService(BugStatusRepo bugPriorityRepo) {
        this.bugPriorityRepo = bugPriorityRepo;
    }

    public List<BugStatusEntity> getAllBugPriorityOption() {
        return bugPriorityRepo.findAll();
    }
}
