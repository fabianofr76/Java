# Java
Aula JAVA
https://www.onlinegdb.com/online_java_compiler
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}




import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int X = A+B;
        System.out.println("X = "+ X);
    }
}

import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
double nota1 = entrada.nextDouble();
double nota2 = entrada.nextDouble();
double MEDIA;
MEDIA = (nota1 * nota2)/2;
System.out.printf ("MEDIA = %.2f%n",MEDIA);
    }
}

import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
int A = entrada.nextInt();
int B = entrada.nextInt();
int C = entrada.nextInt();
int D = entrada.nextInt();
int valor = A*B + C*D;
System.out.println("VALOR E IGUAL A:\n"+valor);




import java.util.Scanner; //import para Java
public class Main   //Uma classe MAin
{
    public static void main(String[]args ){   //Uma classe  string lista[] (args)
    Scanner entrada = new Scanner(System.in);  //metodo de entrada via teclado digitado
    double raio1;  //declara variaveis tipo double
    double raio2;  //declara variaveis tipo double
    double area;  //declara variaveis tipo double
    
    raio1 = entrada.nextDouble(); // busca do teclado função
    raio2 = entrada.nextDouble(); // busca do teclado função
    area = 3.14159 * (raio1*raio2); //aki entre parentes para multiplicar primeiro!!!
    System.out.printf("A=%.4f%n",area); // printf aponta para função A=%.2(virgulas)%n espaço",area)
    
    }
}


import java.util.Scanner; //import para Java
public class Main   //Uma classe MAin
{
    public static void main(String[]args ){   //Uma classe  string lista[] (args)
    Scanner entrada = new Scanner(System.in);  //metodo de entrada via teclado digitado
    System.out.println("Digite as laterais em metros");
    
    double l1;  //declara variaveis tipo double
    double l2;
    double l3;
    double volume;  //declara variaveis tipo double
    
    l1 = entrada.nextDouble(); // busca do teclado função
    l2 = entrada.nextDouble(); // busca do teclado função
    l3 = entrada.nextDouble();
    volume = (l1 * l2 * l3); //aki entre parentes para multiplicar primeiro!!!
    System.out.printf("A=%.2f"+(" metros cubicos;\n"),volume);
    
    volume = (volume * 1000);
    
    System.out.println(volume + (" Litros"));
    }
}
