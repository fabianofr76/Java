public class comisal {
   public static void main(String[] args){
           double salfixo,comi,vendas;
           double calc,sal;
System.out.print("Escreva Salario fixo do funcionario:R$ ");
salfixo = Double.parseDouble(System.console().readLine());

System.out.print("Escreva quanto vendeu o funcionario:R$ ");
vendas = Double.parseDouble(System.console().readLine());

calc = vendas* 4/100;
sal = salfixo + calc;
System.out.printf("Total comissionado Foi: R$ %.2f\n", calc);
System.out.printf("O salario recalculado sera:R$ %.2f", sal); 
}
}
