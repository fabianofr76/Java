public class somatorio{
public static void main(String[]args){

double quad,med;
int nip,vez;

vez=0;
quad=0;


while(nip > 0){
System.out.println("Digite  numeros aleatorios vou calcular a media da soma dos quadrados:");
nip = Integer.parseInt(System.console().readLine());

quad = nip*2;
vez = vez + 1;

}
med = (double)quad + nip;
System.out.print(med);
}
}
