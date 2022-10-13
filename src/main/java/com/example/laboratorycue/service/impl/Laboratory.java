package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.service.LoanService;
import com.example.laboratorycue.service.ObjectService;
import com.example.laboratorycue.service.StudentService;
import com.example.laboratorycue.service.ReportService;
import com.example.laboratorycue.utilities.*;

public class Laboratory {
    private final LoanServiceImpl loanService;
    private final ObjectServiceImpl objectService;
    private final MonitorServiceImpl monitorService;
    private final StudentServiceImpl studentService;
    private final ReportServiceImpl reportService;
    private final ChangerScenesController changerScenes;
    private final ComboBoxAdder comboBoxAdder;
    private final DeleterInputs deleterInputs;
    private final PreparatorTable preparatorTable;
    private final PrepareListObject prepareListObject;
    private final SearcherObject searcherObject;
    private final ShowInformationInputs showInformationInputs;
    private final CloseModal closeModal;
    private final Validator validator;

    public Validator getValidator() {
        return validator;
    }

    public Laboratory() {
        loanService = new LoanServiceImpl();
        objectService =new ObjectServiceImpl();
        monitorService=new MonitorServiceImpl();
        studentService=new StudentServiceImpl();
        reportService = new ReportServiceImpl();
        changerScenes=new ChangerScenesController();
        comboBoxAdder=new ComboBoxAdder();
        deleterInputs=new DeleterInputs();
        preparatorTable=new PreparatorTable();
        prepareListObject=new PrepareListObject();
        searcherObject=new SearcherObject();
        showInformationInputs=new ShowInformationInputs();
        closeModal=new CloseModal();
        validator=new Validator();
    }

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

    public ChangerScenesController getChangerScenes() {
        return changerScenes;
    }

    public ComboBoxAdder getComboBoxAdder() {
        return comboBoxAdder;
    }

    public DeleterInputs getDeleterInputs() {
        return deleterInputs;
    }

    public PreparatorTable getPreparatorTable() {
        return preparatorTable;
    }

    public PrepareListObject getPrepareListObject() {
        return prepareListObject;
    }

    public CloseModal getCloseModal() {
        return closeModal;
    }

    public SearcherObject getSearcherObject() {
        return searcherObject;
    }

    public ShowInformationInputs getShowInformationInputs() {
        return showInformationInputs;
    }
}
