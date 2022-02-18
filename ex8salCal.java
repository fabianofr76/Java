public class salCal{
public static void main(String[] args){
double sal,cal;
System.out.print("Escreva seu salario R$: ");
sal = Double.parseDouble(System.console().readLine());
if(sal<5000){
cal=sal*30/100;
sal=sal+cal;
System.out.print("Seu salario e R$ "+ sal);
}else{
sal=sal;
System.out.print("Seu salario e superior a 5000 não recebe ajuste R$ "+ sal);
}
}
}
