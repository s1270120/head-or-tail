import java.util.Random;
import java.util.Scanner;
    
public class HorT {
    public static void main(String[] args){
	
System.out.println("Who are you? ");
Scanner scan = new Scanner(System.in);
String str = scan.next();
System.out.println("Hello, "+str+"!");

System.out.println("Tossing a coin...");
String[] Ran ={"Heads","Tails"};
int H=0,T=0;
for(int i = 0;i<3; i++){
    Random r = new Random();
    String Ra = Ran [r.nextInt(2)];
    //System.out.println(r);
    if(Ra == "Heads") H = H+1;
    else T=T+1;    
    System.out.println("Round"+ (i+1) +":" + Ra);

}
System.out.println("Heads:"+H+",Tails:"+T);

    }
if(H>T){
    System.out.println(str+ " won");
}
else  System.out.println(str+ " lost");
}
