public class Salario {
   public static void main(String[] args){
           double salbase,salrec;
           double sal,aumento,desconto;
System.out.print("Salario base do funcionario: ");
salbase = Double.parseDouble(System.console().readLine());
aumento = salbase * 5/100;
salrec = salbase + aumento;
System.out.printf("Salario com acrecimo:R$ %.2f\n", salrec);
desconto = salrec * 7/100;
System.out.printf("Desconto:R$ %.2f\n", desconto);
sal = salrec - desconto;
System.out.printf("O salario recalculado sera:R$ %.2f", sal); 
}
}