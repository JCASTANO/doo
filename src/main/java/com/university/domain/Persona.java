package com.university.domain;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String numeroIdentificacion;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Integer telefonoFijo;
    private String direccion;

    //static factory method
    public static Persona of(String nombre, String numeroIdentificacion, String apellido, LocalDate fechaDeNacimiento, String direccion) {

        validarObligatorio(nombre, "El nombre es obligatorio");
        validarObligatorio(numeroIdentificacion, "El numeroIdentificacion es obligatorio");
        validarObligatorio(apellido, "El apellido es obligatorio");
        validarObligatorio(fechaDeNacimiento, "El fechaDeNacimiento es obligatorio");

        return new Persona(nombre, numeroIdentificacion, apellido, fechaDeNacimiento, direccion);
    }

    private Persona(String nombre, String numeroIdentificacion, String apellido, LocalDate fechaDeNacimiento, String direccion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    private static void validarObligatorio(Object nombre, String mensaje) {
        if(nombre == null || nombre.toString().isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
}
