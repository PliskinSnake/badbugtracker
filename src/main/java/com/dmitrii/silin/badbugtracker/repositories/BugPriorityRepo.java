package com.dmitrii.silin.badbugtracker.repositories;

import com.dmitrii.silin.badbugtracker.entities.BugPriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugPriorityRepo extends JpaRepository<BugPriorityEntity, Long> {
}

