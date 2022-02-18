public class temperatura{
public static void main(String[] args){
double cel,fah;
System.out.print("Escreva a temperatura em celsus:");
cel = Double.parseDouble(System.console().readLine());
fah=(cel*9)/5+32;
System.out.println("A temperatura deseja em fahrenheit:  " + fah);
}
}
