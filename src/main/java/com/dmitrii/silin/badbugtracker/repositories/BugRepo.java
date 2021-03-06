package com.dmitrii.silin.badbugtracker.repositories;

import com.dmitrii.silin.badbugtracker.entities.BugEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepo extends JpaRepository<BugEntity, Long> {
}
