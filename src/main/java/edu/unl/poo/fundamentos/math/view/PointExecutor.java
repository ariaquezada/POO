package edu.unl.poo.fundamentos.math.view;

import edu.unl.poo.fundamentos.math.domain.Point;

import java.util.Scanner;

public class PointExecutor {
    public static void main(String[] args){
        // llamar a la claase point y asignarlo a nuevas variables
        Point startPoint, endPoint;

        Scanner scan = new Scanner(System.in);
        System.out.println("-OPERACIONES ENTRE DOS PUNTOS EN UN PLANO CARTESIANO-");
        System.out.println("Ingrese los valores de X y Y del punto A");
        System.out.println("Ingrese solo 2 valores");

        int startPointX = scan.nextInt();
        int startPointY = scan.nextInt();
        startPoint = new Point("A", startPointX, startPointY);
        System.out.println("Ingrese los valores de X y Y del punto B");
        System.out.println("Ingrese solo 2 valores");
        int endPointX = scan.nextInt();
        int endPointY = scan.nextInt();
        endPoint = new Point("B", endPointX, endPointY);

        System.out.println("RECTA FORMADA ENTRE: " + startPoint + "-->" + endPoint);
        System.out.println("===============================================================");

        // Calcula la distancia desde el punto de inicio hacia el final
        System.out.println(startPoint + "--> " + endPoint + " Distancia: " + startPoint.distance(endPoint));
        // calcula la distancia desde el punto final hacia el punto de inicio
        System.out.println(endPoint + "--> " + startPoint + " Distancia: " + endPoint.distance(startPoint));
        System.out.println("===============================================================");

        // Punto medio
        System.out.println(startPoint + "--> " + endPoint + " Punto medio: " + "[" + startPoint.medialPointX(endPoint)
                + ", " + startPoint.medialPointY(endPoint) + "]");
        System.out.println("===============================================================");

        // Pendiente
        System.out.println(startPoint + "--> " + endPoint + " Pendiente: " + startPoint.slope(endPoint));
        System.out.println("===============================================================");


        //Tipo de recta de inicio a fin,y luego de final a inicio
        System.out.println(startPoint + "--> " + endPoint + " Tipo de recta: " + startPoint.getLineType(endPoint));
        System.out.println(endPoint + "--> " + startPoint + " Tipo de recta: " + endPoint.getLineType(startPoint));
        System.out.println("===============================================================");


        // Vector existente
        System.out.println(startPoint + "--> " + endPoint + " Vector existente: " + "[" + startPoint.existentVectorX(endPoint)
                + ", " + startPoint.existentVectorY(endPoint) + "]");
        System.out.println("===============================================================");

        // Vector punto
        // X
        System.out.println(startPoint + "--> " + endPoint + " Vector punto A: " + startPoint);
        // Y
        System.out.println(startPoint + "--> " + endPoint + " Vector punto B: " + endPoint);
    }
}