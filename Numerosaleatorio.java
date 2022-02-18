import java.io.IOException;
public class Aleatorio{
    public static void main(String[]args ){   
    double Numero;
    int cont = 1;
    String Resultado;
    
        
    while(cont >= 0 && cont<=4){   //contagem
            cont++;
    System.out.println("Gerando numero aleatorio!!!");
}
System.out.println(    );
Numero = Math.floor (Math.random() * 20 - 10); // gera numeros aleatorios

if(Numero < 0){
   Resultado = "Negativo";
}else {
    Resultado = "Positivo";
}
if(Numero == 0){
    Resultado = "Nulo";
}
System.out.println("Numero aleatorio Gerado!!!");
System.out.println(    );
System.out.printf("Numero = %.0f%n",Numero);
System.out.printf("Numero = %.0f%n",Numero);
System.out.printf("Numero = %.0f%n",Numero);
System.out.printf("Numero = %.0f%n",Numero);

cont =1;
while(cont >= 0 && cont<=4){
            cont++;
System.out.println("Verificando se for + ou - !!!");
}
System.out.println(    );
System.out.println("Numero verificado!!!");
System.out.println(    );
System.out.println(Resultado);
}
}