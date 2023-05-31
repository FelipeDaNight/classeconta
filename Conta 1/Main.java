import java.util.Scanner;

public class Main {
Scanner sr = new Scanner(System.in);
public static void main(String[] args) {

Cliente cliente1 = new Cliente("123.123.123-34", "Leandro memes");
Conta c1 = new Conta("3244", 2000, "lendro burro", cliente1);
c1.cadastro();

Cliente cliente2 = new Cliente("154.675.863-75", "Felipe Oliveira");
Conta c2 = new Conta("9000", 10.000, "lendro burro", cliente1);




}


}
