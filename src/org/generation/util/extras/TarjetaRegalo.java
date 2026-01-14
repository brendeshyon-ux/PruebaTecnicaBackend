package org.generation.util.extras;

import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible {
	private int accountNumber;
	private double balance;
	private String name;

	public TarjetaRegalo(int accountNumber, double balance, String name) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getNumeroCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}//class TarjetaRegalo
