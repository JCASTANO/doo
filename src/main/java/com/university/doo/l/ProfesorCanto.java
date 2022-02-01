package com.university.doo.l;

public class ProfesorCanto extends Profesor {

    @Override
    public void calificarEstudiantes() {

    }

    @Override
    public void programar() {
        throw new UnsupportedOperationException("Un profesor de canto no puede programar");
    }
}
