package monedero;
/*Defina una clase Monedero que permita gestionar la cantidad de dinero
que una persona dispone en un momento dado . La clase deberá tener un
constructor que permitirá crear un monedero con una cantidad de dinero
inicial y deberá definir un método para meter dinero en el monedero , otro
para sacarlo y finalmente , otro para consultar el disponible ; solo podrá
conocerse la cantidad de dinero del monedero a través de este último
método . Por supuesto , no se podrá sacar más dinero del que haya en un
momento dado en el monedero .
*/
import java.util.Scanner;


public class monedero {
	Scanner sc = new Scanner(System.in);

	// Attributes
	public String nombre;
	public String apellido;
	public double saldoCuenta;
	public double dineroIngresado;
	public double dineroRetirado;

	// Contructor

	public monedero(String nombre, String apellido, double saldoCuenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldoCuenta = saldoCuenta;
	}

	// Methods
	
	public void menu() {

		int menu;
		
		do { 
			System.out.println("Bienvenido "+nombre+" "+apellido+"!");
			System.out.println();
			System.out.println("Qué deseas hacer?");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Consultar saldo");
			
			menu = sc.nextInt();
			if (menu == 1) {
				ingresarDinero();
			}else if (menu== 2) {
				retirarDinero();
			} else if (menu == 3) {
				consultarSaldo();
			}
		} while (menu > 3);

	}
	
	public void ingresarDinero() {
		System.out.println("Ingresa la cantidad que deseas depositar");
		dineroIngresado = sc.nextDouble();
		saldoCuenta = dineroIngresado + saldoCuenta;
		System.out.println("Felicidades! su depósito de "+dineroIngresado+" se realizó con éxito");
		menu();
	}

	public void retirarDinero() {
		System.out.println("Ingresa la cantidad a retirar");
		dineroRetirado = sc.nextDouble();
		if (dineroRetirado <= saldoCuenta) {
			saldoCuenta = saldoCuenta - dineroRetirado;
			System.out.println("Has retirado exitosamente "+dineroRetirado+"!");
			menu();
		} else if (dineroRetirado > saldoCuenta) {
			System.out.println("Lo sentimos, tu saldo no es suficiente, te sugerimos hacer un depósito");
			menu();
		}
	}

	public void consultarSaldo() {
		System.out.println("Tu saldo es de " + this.saldoCuenta);
		menu();
	}

	@Override
	public String toString() {
		return "monedero [sc=" + sc + ", nombre=" + nombre + ", apellido=" + apellido + ", saldoCuenta=" + saldoCuenta
				+ "]";
	}



}// class
