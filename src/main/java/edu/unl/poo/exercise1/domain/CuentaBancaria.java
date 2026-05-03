package edu.unl.poo.exercise1.domain;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String historial;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo, String historial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.historial = historial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            this.historial+= "Deposito +"+ monto;
        }
    }

    public boolean retirar(double monto){
        if(monto > 0 && monto< this.saldo){
            this.saldo -=monto;
            this.historial += "Retiro -" + monto;
            return true;

        }
        return false;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String obtenerDatos(){
        return "Cuenta: " + numeroCuenta +
                "\nTitular: " + titular +
                "\nSaldo de la cuenta: " +saldo+
                "\nHistorial: " + historial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
}