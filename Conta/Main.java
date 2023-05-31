
package Conta;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    Conta_corrente c1 = new Conta_corrente();
    int i = 0;
    c1.cpf = "123.123.123.34";
    c1.nome_do_titular = "Felipe";
    c1.agencia = "Felps bancos";
    c1.numero_da_conta = "12312";
    c1.saldo = 1700;
    

while (i!=1) {
    
    System.out.println("qual operação dejesa fazer");
    System.out.println("1- Sacar  2-Depositar  3-Transferir  4-Encerrar");
    int operação = sr.nextInt();
    
    switch (operação) {
    
        case 1 : 
        c1.sacar();
        break;
        
        case 2 :
        c1.depositar();
        break;
    
        case 3 :
        c1.transferir();
        break;
    
        case 4 :
        System.out.println("Encerrado");
        i=1;
        break;
    
}
}
}
}