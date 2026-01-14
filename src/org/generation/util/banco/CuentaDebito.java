package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta {
	private double montoMinimo;

	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, double montoMinimo,
			String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.montoMinimo = montoMinimo;
	}//constructor

	public double getMontoMinimo() {
		return montoMinimo;
	}//getMontoMinimo

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setMontoMinimo
	
	@Override
    public double getSaldo() {
        return saldo;
    }

	@Override
	public double retiro(double cantidad) {
		if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("No hay saldo");
        }
        return saldo;
	}

	@Override
	public double deposito(double cantidad) {
		saldo += cantidad;
		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta Débito [" + super.toString() + 
				", Monto mínimo=" + montoMinimo + "]";
	}//toString

}//class CuentaCredito
