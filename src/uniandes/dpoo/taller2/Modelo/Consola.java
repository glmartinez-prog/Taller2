package uniandes.dpoo.taller2.Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola extends Restaurante{
	
	public void ejecutarOpcion(int opcionSeleccionada)
	{

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				opcionSeleccionada = Integer.parseInt(input("Por favor seleccione una opción: \n"));
				if (opcionSeleccionada == 1)
					ejecutarMostrarMenu();
				else if (opcionSeleccionada == 2)
					0 = input("Por favor, ingrese su nombre\n")
					iniciarPedido(input("Por favor, ingrese su nombre\n"), input("Por favor, ingrese su direccion\n"));
				else if (opcionSeleccionada == 3)
					ejecutarAgregarElemento();
				else if (opcionSeleccionada == 4)
					ejecutarCerrarYGuardar();
				else if (opcionSeleccionada == 5)
					ejecutarConsultarPedido();
				else if (opcionSeleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}

				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
}


public void mostrarMenu()
{
	System.out.println("\nOpciones de la aplicación\n");
	System.out.println("1. Mostrar el menú");
	System.out.println("2. Iniciar un nuevo pedido");
	System.out.println("3. Agregar un elemento a un pedido");
	System.out.println("4. Cerrar un pedido y guardar la factura");
	System.out.println("5. Consultar la información de un pedido con su id");
	System.out.println("6. Salir de la aplicación\n");
}	

private void ejecutarConsultarPedido() {
		// TODO Auto-generated method stub
		
	}


private void ejecutarCerrarYGuardar() {
		// TODO Auto-generated method stub
		
	}


private void ejecutarAgregarElemento() {
		// TODO Auto-generated method stub
		
	}


private void ejecutarIniciarNuevoPedido() {
		// TODO Auto-generated method stub
		
	}


private void ejecutarMostrarMenu() {
		// TODO Auto-generated method stub
		
	}


public String input(String mensaje)
{
	try
	{
		System.out.print(mensaje + ": ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
	catch (IOException e)
	{
		System.out.println("Error leyendo de la consola");
		e.printStackTrace();
	}
	return null;
}


public static void main(String[] args)
{
	ConsolaHamburguesas consola = new ConsolaHamburguesas();
	consola.ejecutarOpcion(int );
}
}