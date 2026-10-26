package class1;

import java.util.Scanner;

import java.util.Scanner;

public class Empleado {

	public String nombre = "";
	public String apellido = "";
	public String cedula = "";
	public String servicio = "";
	public int turnoAsignado = 0;
	public static int turnoSecuencial = 0;

	Scanner sc = new Scanner(System.in);

	public void ingresarDatos() {

		System.out.println("Ingrese nombre: " + nombre);
		nombre = sc.nextLine();
		System.out.println("Ingrese apellido: " + apellido);
		apellido = sc.nextLine();
		System.out.println("Ingrese cedula: " + cedula);
		cedula = sc.nextLine();

	}

	public void GeneraServ() {
		this.servicio = servicio;

		turnoSecuencial++;
		turnoAsignado = turnoSecuencial;

		System.out.println("Ingrese servicio requerido: " + servicio);
		servicio = sc.nextLine();
		if (servicio == servicio || turnoSecuencial == turnoAsignado) {
			for (int i = 0; i < turnoSecuencial; i++) {
				i = turnoAsignado;
				System.out.println("Se asigno turno BANC" + turnoAsignado);

			}
			System.out.println();

		}
	}

	public void AsignarCubiculo(boolean cubiculoDesocupado) {

		int AsigCubiculo = 1;

		if (cubiculoDesocupado == true) {

			turnoAsignado = AsigCubiculo;

			System.out.println("Cubiculo asignado: " + AsigCubiculo);

		} else {

			System.out.println("Cubiculo ocupado");
		}

	}

	public void imprimirInfo() {
		System.out.println("---------DATOS GENERALES--------");
		System.out.println();
		System.out.println("====== DATOS DEL USUARIO ====== ");
		System.out.println("Nombre de Usuario: " + nombre);
		System.out.println("Apellido del Usuario: " + apellido);
		System.out.println("Cedula del Usuario: " + cedula);
		System.out.println();
		System.out.println("======== DATOS DEL SERVICIO =======");
		System.out.println("Servicio requerido: " + servicio);
		System.out.println("El usuario tiene asignado el turno: " + "BANC" + turnoAsignado);
	}

	public static void main(String[] args) {
		Empleado p = new Empleado();
		p.ingresarDatos();
		p.GeneraServ();
		p.imprimirInfo();
		p.AsignarCubiculo(true);
	}

}