package org.example;

import org.example.dao.EstudianteDAO;
import org.example.models.Estudiante;

public class Main {
    public static void main(String[] args) {

        EstudianteDAO estudianteDAO = new EstudianteDAO();

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("23010117", "José Francisco", "López", "jlopezm@uamv.edu.ni", "12234-5678");

        estudianteDAO.create(estudiante);

        System.out.println("Listado de estudiantes:");
        for (Object est : estudianteDAO.read()) {
            System.out.println(est);
        }
    }
}
