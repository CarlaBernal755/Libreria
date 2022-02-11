import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		Libro l1 = new Libro("001", "la vaca no tiene la culpa", 10, 3);
		Libro l2 = new Libro("002", "los cien dias del plebeyo", 24, 4);
		Libro l3 = new Libro("003", "copos de nieve",            21, 2);
		Libro l4 = new Libro("004", "el arbol de manzanas ",      4, 1);
		Libro l5 = new Libro("005", "el juicio",                  8, 4);
		Libro l6 = new Libro("006", "el problema",                5, 1);
		Libro l7 = new Libro("007", "la felicidad es el camino", 34, 9);
		Libro l8 = new Libro("008", "la pregunta mas importante", 6, 2);
		Libro l9 = new Libro("009", "la ranita sorda",           34, 1);
		Libro l10 = new Libro("0010", "la gente que me gusta",   75, 1);
		Inventario inventario = new Inventario();
		
		inventario.almacenar(l1);
		inventario.almacenar(l2);
		inventario.almacenar(l3);
		inventario.almacenar(l4);
		inventario.almacenar(l5);
		inventario.almacenar(l6);
		inventario.almacenar(l7);
		inventario.almacenar(l8);
		inventario.almacenar(l9);
		inventario.almacenar(l10);
		
		ArrayList<Libro> libros = inventario.getLibros();
		
		for(Libro l: libros) {
			System.out.println(l);
		}
		System.out.println("----------------");
       int opc= -1;
		
		while(opc!=0) {
			System.out.println("<1> Buscar libro por el isnb");
			System.out.println("<2> venta de libro");
			System.out.println("<3> Mostrar los libros ");
			System.out.println("<4> Mostrar los tres libros mas caros");
			
			System.out.println("Ingrese la opcion: ");
			opc = leer.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Buscar libro por su isbn:  ");
					String isbn= leer.next();
					inventario.result(isbn);
					if(inventario.result(isbn) != null) {
						System.out.println("-------EL ISBN NO ESTA DENTRO DE LA LISTA-- ");
					}
					else {
						System.out.println("ingresar el titulo del libro: ");
						String titulo = leer.nextLine();
						
						System.out.println("ingresar el precio del libro: ");
						double precio= leer.nextDouble();
						
						System.out.println("ingresar la cantidad de libros que hay: ");
						int cantidad = leer.nextInt();
						
						Libro ln1= new Libro(isbn, titulo, precio, cantidad);
						inventario.almacenar(ln1);
						
						
					}
					
					break;
			case 2:
				System.out.println("----VENTA DE LOS LIBROS---");
				inventario.showlibros();
				System.out.println("\n Que libro va a vender (puede ingresar el isbn): ");
				isbn = leer.next();
				if (inventario.result(isbn) !=null){
					System.out.println("\n Cuantos libros va a vender:  ");
					int cantidad = leer.nextInt();
					inventario.ventaLibro(inventario.result(isbn), cantidad);
					System.out.println(" \n la venta se realizo");
				}
				else {
					System.out.println("No se entro el libro con el isbn ingresado:  "+isbn+"+cantidad+");
				}
				break;
				
			case 3:
                    System.out.println("*Todos los libros*");		
				
				for(int i=0; i<libros.size(); i++) {
				Libro l= libros.get(i);
					
					System.out.println("ISBN: "+l.getIsbn()+"\t"+"TITULO:  "+l.getTitulo()+"\t"+"PRECIO:  "+l.getPrecio()+
										"\t"+" CANTIDAD:  "+l.getCantidad());	
				}
				break;
				
			case 4:
//		Collections.sort(libros);
			for(int i=0; i <3; i++) {
				System.out.println(libros.get(i));
			}
				break;
			
			case 5:
				inventario.showlibros();
				break;
		
		
//		for (int i = 0; i < libros.size(); i++) {
//			Libro l = libros.get(i);
//			System.out.println(l);
//		}
		
		// foreach
}
}
	}
}

