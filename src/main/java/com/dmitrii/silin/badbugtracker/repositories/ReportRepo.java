package com.dmitrii.silin.badbugtracker.repositories;

import com.dmitrii.silin.badbugtracker.entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepo extends JpaRepository<ReportEntity, Long> {


}
