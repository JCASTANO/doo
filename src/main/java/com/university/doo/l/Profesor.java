package com.university.doo.l;

public abstract class Profesor {
    protected String nombre;
    protected String materia;

    public void saludar() {
        System.out.println("Hola");
    }

    public abstract void calificarEstudiantes();

    public abstract void programar();
}
