public class mediaPonderada{
public static void main(String[] args){
double trablab,avasem,exf,med;
System.out.print("Digite nota do trabalho de laboratorio: ");
trablab=Double.parseDouble(System.console().readLine());
trablab = (trablab)*2;
System.out.printf("Trabalho de Laboratorio = %.1f\n",trablab);

System.out.print("Digite nota da avaliação semestral: ");
avasem=Double.parseDouble(System.console().readLine());
avasem = (avasem)*3;
System.out.printf("Avalição Semestral = %.1f\n",avasem);

System.out.print("Digite nota do exame final: ");
exf=Double.parseDouble(System.console().readLine());
exf = (exf)*5;
System.out.printf("Exame Final = %.1f\n",exf);

med=(trablab+avasem+exf)/3;
System.out.printf("Media Ponderada = %.1f\n",med);

if(med >= 8)
System.out.printf("Conceito A = %.1f\n",med);
else if(med >= 7)
System.out.printf("Conceito B = %.1f\n",med);
else if(med >= 6)
System.out.printf("Conceito C = %.1f\n",med);
else if(med >= 5)
System.out.printf("Conceito D = %.1f\n",med);
else if(med >= 0)
System.out.printf("Conceito E = %.1f\n",med);

}
}