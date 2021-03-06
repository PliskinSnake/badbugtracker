package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.BugEntity;
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

    public List<BugEntity> getAllBugs() {
        return bugRepo.findAll();
    }

    public void removeBug(Long id) {
        bugRepo.deleteById(id);
    }

    public BugEntity updateBug(BugEntity bug) {
        return bugRepo.save(bug);
    }

}
