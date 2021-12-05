package com.dmitrii.silin.badbugtracker.services;

import com.dmitrii.silin.badbugtracker.entities.ReportEntity;
import com.dmitrii.silin.badbugtracker.repositories.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private final ReportRepo reportRepo;

    @Autowired
    public ReportService(ReportRepo reportRepo) {
        this.reportRepo = reportRepo;
    }

    public List<ReportEntity> getAllReports() {
        return reportRepo.findAll();
    }

}
