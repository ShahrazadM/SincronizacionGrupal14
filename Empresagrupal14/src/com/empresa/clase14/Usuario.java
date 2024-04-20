package com.empresa.clase14;

public class Usuario {
	 private String nombre;
	    private String fechaNacimiento;
	    private String run;

	    // Constructor sin parámetros
	    public Usuario() {}

	    // Constructor con todos los atributos
	    public Usuario(String nombre, String fechaNacimiento, String run) {
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.run = run;
	    }

	    // Métodos accesores
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(String fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public String getRun() {
	        return run;
	    }

	    public void setRun(String run) {
	        this.run = run;
	    }

	    // Método para mostrar la edad del usuario
	    public String mostrarEdad() {
	        // Suponiendo que la fecha de nacimiento está en formato dd/mm/yyyy
	        // Se puede mejorar esta lógica para calcular correctamente la edad
	        int edad = 2024 - Integer.parseInt(fechaNacimiento.substring(6));
	        return "El usuario tiene " + edad + " años";
	    }

	    // Método toString
	    @Override
	    public String toString() {
	        return "Usuario{" +
	                "nombre='" + nombre + '\'' +
	                ", fechaNacimiento='" + fechaNacimiento + '\'' +
	                ", run='" + run + '\'' +
	                '}';
	    }
}
