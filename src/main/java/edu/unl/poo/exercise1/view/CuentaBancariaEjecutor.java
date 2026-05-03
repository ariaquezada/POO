package edu.unl.poo.exercise1.view;

import edu.unl.poo.exercise1.domain.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaEjecutor {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Apertura de la cuenta");
        System.out.println("Ingrese número de cuenta: ");
        String numeroCuenta = "";

        while (numeroCuenta.trim().isEmpty()) {
            numeroCuenta = sc.nextLine();
            if (numeroCuenta.trim().isEmpty()) {
                System.out.println("Error: El numero no puede estar vacío.");
                System.out.println("Ingrese nuevamente");
            }
        }

        System.out.println("Por favor, ingrese el titular:");//ascii
        String titular = "";

        while (titular.trim().isEmpty()) {
            titular = sc.nextLine();
            if (titular.trim().isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
                System.out.println("Ingrese nuevamente");
            }
        }

        double saldoInicial = -1;
        while (saldoInicial <= -1) {
            System.out.println("Por favor, ingrese el saldo inicial: ");
            saldoInicial = sc.nextDouble();

            if (saldoInicial <= -1) {
                System.out.println("Error: El saldo inicial debe ser un monto positivo.");
            }
        }
        sc.nextLine();

        CuentaBancaria miCuenta = new CuentaBancaria(numeroCuenta, titular, saldoInicial, "");

        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Ver Datos e Historial");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

             switch (opcion){
                 case 1:
                     System.out.print("Monto que va a depositar: ");
                     double deposito = sc.nextDouble();
                     miCuenta.depositar(deposito);
                     System.out.println("Depositado correctamente: " + deposito);
                     break;

                 case 2:
                     System.out.print("Monto que va a retirar ");
                     double retiro = sc.nextDouble();
                     if ( miCuenta.retirar(retiro) ) {
                         System.out.println("Retiro exitoso.");

                     } else {
                         System.out.println("Saldo insuficiente...");
                     }
                     break;

                 case 3:
                     System.out.println("Saldo actual: " + miCuenta.consultarSaldo());
                     break;

                 case 4:
                     System.out.println(miCuenta.obtenerDatos());
                     break;

                 case 5:
                     System.out.println("Saliendo...Gracias");
                     break;

                 default:
                     System.out.println("Opción no válida.");
             }

        } while (opcion !=5);
        sc.close();
    }
}

