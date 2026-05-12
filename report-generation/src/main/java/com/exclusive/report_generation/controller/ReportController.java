package com.exclusive.report_generation.controller;

import com.exclusive.report_generation.model.Report;
import com.exclusive.report_generation.service.ReportService;
import com.exclusive.report_generation.utils.enums.ReportType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ReportController {

    @GetMapping("/generate")
    public Report generateReport() throws InterruptedException {

        return "reportService.generateReport(ReportType.DEFAULT)";
    }
}
