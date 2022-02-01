package com.university.doo.o;

public abstract class Profesor {
    protected String nombre;
    protected String materia;

    public void saludar() {
        System.out.println("Hola");
    }

    public abstract void calificarEstudiantes();
}
