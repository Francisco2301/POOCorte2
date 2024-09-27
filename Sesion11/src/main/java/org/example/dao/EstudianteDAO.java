package org.example.dao;

import org.example.interfaz.operacion;
import org.example.models.Estudiante;

import java.util.ArrayList;

public class EstudianteDAO implements operacion {

    private final ArrayList<Estudiante> estudiantes = new ArrayList<>();

    @Override
    public void create(Object object) {
        try {
            Estudiante estudiante = (Estudiante) object;
            estudiantes.add(estudiante);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        // Retorna todos los estudiantes en formato de ArrayList<Object>
        return new ArrayList<>(estudiantes);
    }

    @Override
    public void Update(Object object) {
        Estudiante est = (Estudiante) object;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCif().equals(est.getCif())) {
                estudiante.setNombres(est.getNombres());
                estudiante.setApellidos(est.getApellidos());
                estudiante.setEmail(est.getEmail());
                estudiante.setTelefono(est.getTelefono());
                return;
            }
        }
    }

    @Override
    public void Delete(int id) {
        // Elimina un estudiante por su ID (cif)
        estudiantes.removeIf(estudiante -> estudiante.getCif().equals(String.valueOf(id)));
    }

    @Override
    public Object search(int id) {
        // Busca un estudiante por su ID
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCif().equals(String.valueOf(id))) {
                return estudiante;
            }
        }
        return null;
    }

    @Override
    public Object search(String name) {
        // Busca un estudiante por su nombre
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombres().equalsIgnoreCase(name)) {
                return estudiante;
            }
        }
        return null;
    }
}

