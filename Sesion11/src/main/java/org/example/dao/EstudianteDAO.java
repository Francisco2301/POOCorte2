package org.example.dao;

import org.example.interfaz.operacion;
import org.example.models.Estudiante;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstudianteDAO implements operacion {

    private ArrayList<Estudiante> estudiantes = new ArrayList();

    @Override
    public void create(Object object) {
        try{
            Estudiante estudiante = (Estudiante) object;
            estudiantes.add(estudiante);
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    @Override
    public void Update(Object object) {

    }

    @Override
    public void Delete(int id) {

    }

    @Override
    public Object search(int id) {
        return null;
    }

    @Override
    public Object search(String name) {
        return null;
    }
}
