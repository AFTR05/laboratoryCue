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
        laboratory = new Laboratory();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    //Monitor------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void createMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        laboratory.getMonitorService().createStudentMonitor(name, code, phoneNumber, typeDocument, career);
    }

    @Override
    public void updateMonitor(String name, String code, String phoneNumber, String typeDocument, String career, String oldCode) {
        laboratory.getMonitorService().updateStudentMonitor(name, code, phoneNumber, typeDocument, career, oldCode);
    }

    @Override
    public void deleteMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        laboratory.getMonitorService().deleteStudentMonitor(name, code, phoneNumber, typeDocument, career);
    }
//Student-------------------------------------------------------------------------------------------------------------------------------------------------------------
        @Override
        public void createStudent(String name, String code, String phoneNumber, String typeDocument, String career){
            laboratory.getStudentService().createStudentMonitor(name, code, phoneNumber, typeDocument, career);
        }
        @Override
        public void updateStudent(String name, String code, String phoneNumber, String typeDocument, String career, String oldCode){
            laboratory.getStudentService().updateStudentMonitor(name, code, phoneNumber, typeDocument, career, oldCode);
        }
        @Override
        public void deleteStudent (String name, String code, String phoneNumber, String typeDocument, String career){
            laboratory.getStudentService().deleteStudentMonitor(name, code, phoneNumber, typeDocument, career);
        }
//Object------------------------------------------------------------------------------------------------------------------------------------------------------

        @Override
        public void createObject (String name, String code, String price, String stock, String position,String status)
        {
            laboratory.getObjectService().createObject(name, code, Double.parseDouble(price), Integer.parseInt(stock), position,status);
        }

        @Override
        public void updateObject (String name, String code, String price, String stock, String position,String status, String oldCode)
        {
            laboratory.getObjectService().updateObject(name, code, Double.parseDouble(price), Integer.parseInt(stock), position,status,oldCode);
        }

        @Override
        public void deleteObject (String name, String code, String price, String stock, String position,String status)
        {
            laboratory.getObjectService().deleteObject(name, code, Double.parseDouble(price), Integer.parseInt(stock), position,status);
        }

}