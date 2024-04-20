package com.empresa.clase14;

public class Main {

	public static void main(String[] args) {
	
		        // Crear instancias de las clases Cliente
		        Cliente cliente1 = new Cliente(12345678, "Juan", "Perez", "123456789", "AFP Provida", 1, "Calle 123", "Santiago", 30);
		        Cliente cliente2 = new Cliente();
		        cliente2.setRut(87654321);
		        cliente2.setNombres("María");
		        cliente2.setApellidos("González");
		        cliente2.setTelefono("987654321");
		        cliente2.setAfp("AFP Capital");
		        cliente2.setSistemaSalud(2);
		        cliente2.setDireccion("Avenida 456");
		        cliente2.setComuna("Puente Alto");
		        cliente2.setEdad(35);

		        // Crear instancias de la clase Usuario
		        Usuario usuario1 = new Usuario("Pedro", "01/01/1990", "12345678-9");
		        Usuario usuario2 = new Usuario();
		        usuario2.setNombre("Ana");
		        usuario2.setFechaNacimiento("15/05/1985");
		        usuario2.setRun("87654321-0");

		        // Crear instancias de la clase Capacitacion
		        Capacitacion capacitacion1 = new Capacitacion(1, 12345678, "05/04/2024", "09:00", "Oficina central", 120, 20);
		        Capacitacion capacitacion2 = new Capacitacion();
		        capacitacion2.setIdentificador(2);
		        capacitacion2.setRutCliente(87654321);
		        capacitacion2.setDia("06/04/2024");
		        capacitacion2.setHora("10:00");
		        capacitacion2.setLugar("Sala de reuniones");
		        capacitacion2.setDuracion(90);
		        capacitacion2.setCantidadAsistentes(15);

		        // Mostrar los datos de los objetos utilizando el método toString
		        System.out.println("Datos de los clientes:");
		        System.out.println(cliente1.toString());
		        System.out.println(cliente2.toString());
		        System.out.println("\nDatos de los usuarios:");
		        System.out.println(usuario1.toString());
		        System.out.println(usuario2.toString());
		        System.out.println("\nDatos de las capacitaciones:");
		        System.out.println(capacitacion1.toString());
		        System.out.println(capacitacion2.toString());

		        // Modificar un atributo de cada clase
		        cliente1.setTelefono("999999999");
		        usuario1.setNombre("Juanito");
		        capacitacion1.setDuracion(150);

		        // Mostrar los datos de los objetos utilizando métodos accesores y métodos adicionales
		        System.out.println("\nDatos actualizados de los clientes:");
		        System.out.println("Cliente 1 - Teléfono: " + cliente1.getTelefono());
		        System.out.println("Cliente 1 - Nombre completo: " + cliente1.obtenerNombre());
		        System.out.println("Cliente 1 - Tipo de sistema de salud: " + cliente1.obtenerSistemaSalud());
		        System.out.println("\nDatos actualizados de los usuarios:");
		        System.out.println("Usuario 1 - Nuevo nombre: " + usuario1.getNombre());
		        System.out.println("Usuario 1 - Edad: " + usuario1.mostrarEdad());
		        System.out.println("\nDatos actualizados de las capacitaciones:");
		        System.out.println("Capacitación 1 - Duración: " + capacitacion1.getDuracion() + " minutos");
		        System.out.println("Capacitación 1 - Detalle: " + capacitacion1.mostrarDetalle());
		    }
		
	}


