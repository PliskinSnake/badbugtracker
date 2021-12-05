package com.dmitrii.silin.badbugtracker.controllers;

import com.dmitrii.silin.badbugtracker.entities.ReportEntity;
import com.dmitrii.silin.badbugtracker.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/list")
    public List<ReportEntity> getAllReports(){
        return reportService.getAllReports();
    }

}
