package org.example.interfaz;

import java.util.ArrayList;

public interface operacion {

    public void create (Object object);

    public ArrayList<Object> read();

    public void Update (Object object);

    public void Delete (int id);

    public Object search (int id);

    public Object search (String name);


}
