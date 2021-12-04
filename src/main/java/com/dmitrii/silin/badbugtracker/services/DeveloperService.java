package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.DeveloperEntity;
import com.dmitrii.silin.badbugtracker.repositories.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperRepo developerRepo;

    @Autowired
    public DeveloperService(DeveloperRepo developerRepo) {
        this.developerRepo = developerRepo;
    }

    public List<DeveloperEntity> getAllDevelopers() {
        return developerRepo.findAll();
    }

    public void deleteDeveloper(Long id) {
         developerRepo.deleteById(id);
    }

    public DeveloperEntity updateDeveloper(DeveloperEntity developer) {
        return developerRepo.save(developer);
    }

    public DeveloperEntity addDeveloper(DeveloperEntity developer) {
        return developerRepo.save(developer);
    }

    public DeveloperEntity getDeveloper(String email) {
        return developerRepo.findByEmail(email);
    }

}
