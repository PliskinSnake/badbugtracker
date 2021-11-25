package com.dmitrii.silin.badbugtracker.repositories;

import com.dmitrii.silin.badbugtracker.entities.DeveloperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepo extends JpaRepository<DeveloperEntity, Long> {

}
