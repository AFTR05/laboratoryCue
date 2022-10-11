package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.service.LoanService;
import com.example.laboratorycue.service.ObjectService;
import com.example.laboratorycue.service.StudentService;
import com.example.laboratorycue.service.ReportService;

public class Laboratory {
    private final LoanServiceImpl loanService;
    private final ObjectServiceImpl objectService;
    private final MonitorServiceImpl monitorService;
    private final StudentServiceImpl studentService;
    private final ReportServiceImpl reportService;

    public LoanServiceImpl getLoanService() {
        return loanService;
    }

    public ObjectServiceImpl getObjectService() {
        return objectService;
    }

    public MonitorServiceImpl getMonitorService() {
        return monitorService;
    }

    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    public ReportServiceImpl getReportService() {
        return reportService;
    }

    public Laboratory() {
        loanService = new LoanServiceImpl();
        objectService =new ObjectServiceImpl();
        monitorService=new MonitorServiceImpl();
        studentService=new StudentServiceImpl();
        reportService = new ReportServiceImpl();
    }
}
