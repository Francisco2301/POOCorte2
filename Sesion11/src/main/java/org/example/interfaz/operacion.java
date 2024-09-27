package org.example.interfaz;

import java.util.ArrayList;

public interface operacion {

    void create(Object object);

    ArrayList<Object> read();

    void Update(Object object);

    void Delete(int id);

    Object search(int id);

    Object search(String name);
}
