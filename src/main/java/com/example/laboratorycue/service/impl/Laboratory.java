package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.service.LoanService;
import com.example.laboratorycue.service.ObjectService;
import com.example.laboratorycue.service.StudentService;
import com.example.laboratorycue.service.ReportService;

public class Laboratory {
    private final LoanService loanService;
    private final ObjectService objectService;
    private final MonitorServiceImpl monitorService;
    private final StudentServiceImpl studentService;
    private final ReportService reportService;

    public LoanService getLoanService() {
        return loanService;
    }

    public ObjectService getObjectService() {
        return objectService;
    }

    public MonitorServiceImpl getMonitorService() {
        return monitorService;
    }

    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    public ReportService getReportService() {
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
