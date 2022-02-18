import java.util.Scanner;
//import java.io.IOException;
public class KM {

    public static void main(String[] args){  //throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a distancia:");
        int km = input.nextInt();
        System.out.print("Digite a que velocidade media:");
        int vel = input.nextInt();
        int minutos = (60 * km) / vel;
        int horas = (minutos/60);
        int res = (minutos % 60);
        System.out.println(vel + " km/h  velocidade" ); 
        System.out.println(km + " km  Distancia" ); 
        System.out.println(minutos + " minutos" ); 
        System.out.print(horas + " horas " + res);
        System.out.print(" minutos");
}
}