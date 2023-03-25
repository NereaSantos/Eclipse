package ClaseFecha;

import java.util.Scanner;

public class PruebaFecha {
   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // crear objeto Fecha con constructor por defecto
        Fecha fecha1 = new Fecha();

        // crear objeto Fecha con constructor con tres parámetros
        Fecha fecha2 = new Fecha(28, 2, 2021);

        // cambiar valores de los atributos usando métodos set
        fecha1.setDia(15);
        fecha1.setMes(4);
        fecha1.setAnio(2021);

        // imprimir valores de los atributos usando métodos get
        System.out.println("Fecha 1: " + fecha1.getDia() + "-" + fecha1.getMes() + "-" + fecha1.getAnio());
        System.out.println("Fecha 2: " + fecha2.toString());

        // imprimir si fecha1 es correcta o no
        if (fecha1.fechaCorrecta()) {
            System.out.println("Fecha 1 es correcta");
        } else {
            System.out.println("Fecha 1 no es correcta");
        }

        // imprimir si fecha2 es bisiesto o no
        if (fecha2.esBisiesto()) {
            System.out.println("Fecha 2 es bisiesto");
        } else {
            System.out.println("Fecha 2 no es bisiesto");
        }
	}
}
