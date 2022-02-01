package com.university.doo.o;

public abstract class Profesor {
    protected String nombre;
    protected String materia;

    public void saludar() {
        System.out.println("Hola");
    }

    //cada materia tiene su forma de calificar por eso
    //es mejor usar mas clases para favorecer la o de solid
    // y la s de solid
    public abstract void calificarEstudiantes();
}
