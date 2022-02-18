public class menortresval{
public static void main(String[] args){
int a,b,c;
int m = 0;
System.out.print("Escreva o valor de a: ");
a=Integer.parseInt(System.console().readLine());

System.out.print("Escreva o valor de b: ");
b=Integer.parseInt(System.console().readLine());

System.out.print("Escreva o valor de c: ");
c=Integer.parseInt(System.console().readLine());

if(a<b){
m=a;
}else{
m=b;
}
if(m<c){
m=m;
}else{
m=c;
}
System.out.print(m);
}
}
