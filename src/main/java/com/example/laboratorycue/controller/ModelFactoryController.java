package com.example.laboratorycue.controller;

import com.example.laboratorycue.service.ModelFactoryService;
import com.example.laboratorycue.service.impl.Laboratory;

public class ModelFactoryController implements ModelFactoryService {

    private Laboratory laboratory;

    public Laboratory getLaboratory() {
        return laboratory;
    }

    //------------------------------  Singleton ------------------------------------------------
    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    public ModelFactoryController() {
        laboratory=new Laboratory();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }


    @Override
    public void createMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        laboratory.getMonitorService().createStudentMonitor(name,code,phoneNumber,typeDocument,career);
    }
    @Override
    public void updateMonitor(String name, String code, String phoneNumber, String typeDocument, String career){
        laboratory.getMonitorService().updateStudentMonitor(name, code, phoneNumber, typeDocument, career);
    }
    @Override
    public void deleteMonitor(String name, String code, String phoneNumber, String typeDocument, String career){
        laboratory.getMonitorService().deleteStudentMonitor(name, code, phoneNumber, typeDocument, career);
    }
}
