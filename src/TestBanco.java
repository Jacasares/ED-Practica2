public class TestBanco {
	private static Cuenta cuentaAntonio;

	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente javier = new Cliente("123456789Z", "Antonio Alonso", "Av.Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		cuentaAntonio = new Cuenta(48151, 100, javier);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		consultarSaldo(cuentaAntonio, cuentaBeatriz);
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
		consultarSaldo(cuentaAntonio, cuentaBeatriz);
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		consultarSaldo(cuentaAntonio, cuentaBeatriz);
		/*
		 * Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta
		 */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		consultarSaldo(cuentaAntonio, cuentaBeatriz);
	}

	private static void consultarSaldo(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		/* Antonio y Beatriz consultan el saldo */
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + "euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + "euros.");
	}
}