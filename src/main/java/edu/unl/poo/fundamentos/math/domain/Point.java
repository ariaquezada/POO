package edu.unl.poo.fundamentos.math.domain;

public class Point {

    private int x;
    private int y;

    private String label;
    // Primer constructor
    public Point(String label, int x, int y) {
        this.label = label;
        validateInput(x, "x");
        this.x = x;
        validateInput(y, "y");
        this.y = y;
    }
    // Constructor privado para el Rango permitido
    private void validateInput(int value, String label){
        if(value < -100 || value > 100){
            throw new IllegalArgumentException("Valor de " + label +  " fuera de rango: -100 a 100");
        }
    }
    // metodo para calcular la distancia
    public double distance(Point point){
        double r1 = Math.pow((point.getX() - this.x), 2);
        double r2 = Math.pow((point.getY() - this.y), 2);
        // hacer un retorno directo
        return Math.sqrt(r1 + r2);
    }
    //Metodos para calcular el punto medio
    public double medialPointX(Point point){
        // hacer un retorno directo
        return (double) (this.x + point.getX()) / 2;
    }
    public double medialPointY(Point point){
        // hacer un retorno directo
        return (double) (this.y + point.getY()) / 2;
        // se puede usar * 1.0 para transformar
    }
        // Metodo para calcular la pendiente
    public double slope(Point point){
        double r1 = (point.getX() - this.x);
        double r2 = (point.getY() - this.y);
        // hacer un retorno directo
        return r2 / r1;
    }

    public String getLineType(Point point){
        // obtener la pendiente para poder clasificsrla
        double slope = this.slope(point);
        if(slope == 0){
            return "Linea Constante";
        } else if(slope > 0){
            return "Linea Creciente";
        } else{
            return "Linea Decreciente";
        }
    }
    // Metodos para el vector existente
    public double existentVectorX(Point point){
        return point.getX() - this.x;
    }
    public double existentVectorY(Point point){
        return point.getY() - this.y;
    }
    // Getters y setters, hecho automaticamente con inteliijID
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // Poder transformar a representacion a vector, autohecho con el IDE

    @Override // PI{x, y}
    public String toString() {
        return "P" + label +
                "{" +  x +
                ", " + y +
                "}";
    }


    //Generate: toString(): StringBuffer
   /*@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
    */

    /*@Override
    public String toString() {
        return "P"+label +
            "("+ x +
             ", ="+ y +
             ')';

    }*/

}

