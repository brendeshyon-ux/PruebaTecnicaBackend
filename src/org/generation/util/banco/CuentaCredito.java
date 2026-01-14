package org.generation.util.banco;

import java.util.Date;

public class CuentaCredito extends Cuenta {
	private double limite;
	private float tasa;
	private Date fechaCorte;
	
	public CuentaCredito(double saldo, String numeroCliente, Date fechaCorte, Date fechaApertura, float tasa, double limite, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.limite = limite;
		this.tasa = tasa;
		this.fechaCorte = fechaCorte ;
	}
	
	public double getLimite() {
		return limite;
	}//getLimite
	public void setLimite(double limite) {
		this.limite = limite;
	}//setLimite

	public float getTasa() {
		return tasa;
	}//getTasa
	public void setTasa(float tasa) {
		this.tasa = tasa;
	}//setTasa

	public Date getFechaCorte() {
		return fechaCorte;
	}//getFechaCorte
	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}//setFechaCort


	@Override
    public double getSaldo() {
        this.saldo += 3;
        return saldo;
    }

	@Override
	public double retiro(double cantidad) {
		if ((limite - saldo) >= cantidad) {
            saldo += cantidad + (cantidad * 0.05);
        } else {
            saldo += 5;
            System.out.println("Límite de crédito excedido.");
        }
        return saldo;
	}

	@Override
	public double deposito(double cantidad) {
		saldo -= cantidad;
        return saldo;
	}
	
	@Override
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString

}//class CuentaCredito
