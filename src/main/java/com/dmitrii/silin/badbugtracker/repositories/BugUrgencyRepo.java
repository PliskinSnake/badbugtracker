package com.dmitrii.silin.badbugtracker.repositories;

import com.dmitrii.silin.badbugtracker.entities.BugUrgencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugUrgencyRepo extends JpaRepository<BugUrgencyEntity, Long> {
}
