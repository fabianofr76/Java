public class somadez{
public static  void main(String[] args){
int soma,num,cal;
soma=0;
num=1;
while(num<=10){
System.out.println("Digite alguns numeros inteiros positivos:");
cal=Integer.parseInt(System.console().readLine());
num=num+1;
soma=soma+cal;
}
System.out.printf("Soma = %d:",soma);
}
}