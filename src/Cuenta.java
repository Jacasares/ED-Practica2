
public class Cuenta {
	private int numero_cuenta;
	private double saldo;
	private Cliente cliente;
	public Cuenta(int numero_cuenta, double saldo, Cliente cliente) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public int getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(int numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	


}
