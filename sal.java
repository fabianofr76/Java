public class CalculaNovoSalario {
	public static void main(String[] args) {
		double salario, bonificacao = 0, auxilio, novoSalario;
		
		System.out.print("Salario do funcionario: ");
		salario = Double.parseDouble(System.console().readLine());
				
		if(salario > 500 && salario <= 1200)
			bonificacao = salario * 5 / 100;
		else
			bonificacao = salario * 12 / 100;
		if(salario > 1200)
			bonificacao = 0;
		
		if(salario <= 500)
			auxilio = 150;
		if(salario <= 600)
			auxilio = 100;
		
		novoSalario = salario + bonificacao + auxilio;
		
		System.out.printf("SALARIO A RECEBER = R$ %.2f\n", novoSalario);
	}
}

