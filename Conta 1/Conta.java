import java.util.*;
public class Conta {

private String numero_daconta;
private double saldo; 
private String agencia;
private Cliente cliente;

public String getNumero_daconta() {
    return numero_daconta;
    }

public void setNumero_daconta(String numero_daconta) {
    this.numero_daconta = numero_daconta;
    }

public double getSaldo() {
    return saldo;
    }

public void setSaldo(double saldo) {
    this.saldo = saldo;
    }

public String getAgencia() {
    return agencia;
    }

public void setAgencia(String agencia) {
    this.agencia = agencia;
    }

public Cliente getCliente() {
    return cliente;
    }

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
    }

public Conta(String numero_daconta, double saldo, String agencia, Cliente cliente) {
    this.numero_daconta = numero_daconta;
    this.saldo = saldo;
    this.agencia = agencia;
    this.cliente = cliente;
    }

void cadastro(){
Scanner sr = new Scanner(System.in);
System.out.println("digite o nome de usuario ");
String nome_cadastro = sr.nextLine();
System.out.println("digite o numero da conta ");
int numero_conta_cadastro = sr.nextInt();

if (numero_conta_cadastro == 3244  ) {
this.status();
 }else 
System.out.println("erro tente novamente mais tarde ");

    }

void sacar (){
Scanner sr = new Scanner(System.in);
System.out.println("o seu saldo é de "+ this.saldo);
System.out.println("qual valor deseja sacar? ");
double valor_de_saque = sr.nextInt();
this.saldo = this.saldo - valor_de_saque;
System.out.println("saque realizado com sucesso ");
System.out.println("------------------------------");
System.out.println("este é seu novo saldo " + this.saldo);

if (valor_de_saque>this.saldo) {
System.out.println("Não foi possivel realizar o saque valor insuficiente");   
 }   
this.status();
    }

void depositar(){
    Scanner sr = new Scanner(System.in);
System.out.println("Digite valor do depósito ");
double valor_de_deposito = sr.nextDouble();
this.saldo = this.saldo + valor_de_deposito;
    System.out.println("deposito realizado com sucesso ");
    this.status();
}


void transferir(Conta c1, Conta c2,double quantia){
    Scanner sr = new Scanner(System.in);
System.out.println("Digite a conta de que quer fazer a transferencia ");
double conta_de_transferencia = sr.nextDouble();
System.out.println("O dinheiro caira na conta de Felipe Oliveira ");
System.out.println("digite o valor de transferencia ");
double valor_de_transferencia = sr.nextDouble();
this.saldo = this.saldo - valor_de_transferencia;


}

void encerrar(){
    System.out.println("------------------------------");
System.out.println("Fechando processo...");
    System.out.println("------------------------------");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
System.out.println("                                               ");
    this.cadastro();
}


void status(){     
    Scanner sr = new Scanner(System.in);
System.out.println("o seu saldo é de "+ this.saldo);
System.out.println("numero da conta "+ this.numero_daconta);
    System.out.println("------------------------------");
System.out.println("qual operação deseja fazer ");
    System.out.println("------------------------------");
System.out.println("1- sacar  2- depositar  3- transferir 4- encerrar ");
int operaçao = sr.nextInt();
    


switch (operaçao) {
    case 1:
    this.sacar();   
        break;
 
    case 2 :
    this.depositar();
        break;
    case 3 :
    
    break;
    case 4:
    this.encerrar();
    break;
}




}
}



