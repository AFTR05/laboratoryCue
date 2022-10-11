package com.example.laboratorycue.service;

public interface ObjectService {
    void generateProve();
    void createObject(String name, String code, double price, int stock, String position,String status);
    boolean updateObject(String name, String code, double price, int stock, String position,String status,String oldCode);
    void deleteObject(String name, String code, double price, int stock, String position,String status);
}
