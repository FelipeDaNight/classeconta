package Conta;
import java.util.Scanner;


public class Conta_corrente {
    String numero_da_conta;
    String cpf;
    String nome_do_titular;
    int saldo;
    String agencia;



public String getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(String numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_do_titular() {
        return nome_do_titular;
    }

    public void setNome_do_titular(String nome_do_titular) {
        this.nome_do_titular = nome_do_titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

public Conta_corrente() {
        this.numero_da_conta = numero_da_conta;
        this.cpf = cpf;
        this.nome_do_titular = nome_do_titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

void sacar(){
    Scanner sr = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("digite o valor que deseja sacar ");
    System.out.println("-------------------------------------");
int valor_de_saque = sr.nextInt();
setSaldo(this.saldo-valor_de_saque);
if ((valor_de_saque>saldo)) {
    System.out.println("-------------------------------------");
System.out.println("impossivel realizar saque, a conta não possui o valor digitado");  
System.out.println("-------------------------------------");
} else { 
    System.out.println("-------------------------------------");
    System.out.println("saque realizado com sucesso");
    System.out.println("o seu novo saldo é de " +this.saldo);
    System.out.println("-------------------------------------");
}




}

void depositar(){
    Scanner sr = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("digite o valor que deseja depositar ");
    System.out.println("-------------------------------------");
int valor_de_deposito = sr.nextInt();
setSaldo(valor_de_deposito+this.saldo);
System.out.println("-------------------------------------");
System.out.println("deposito realizado com sucesso ");
System.out.println("o seu saldo agora é de "+ this.saldo);
System.out.println("-------------------------------------");
}





void transferir(){
    Scanner sr = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("digite o valor que deseja transferir ");
    System.out.println("-------------------------------------");
    int valor_da_tranferencia = sr.nextInt();
    System.out.println("-------------------------------------");
    System.out.println("digite o numero da conta");
    System.out.println("-------------------------------------");
    int numero_da_conta_de_transferencia = sr.nextInt();
    setSaldo(this.saldo - valor_da_tranferencia );
    if (numero_da_conta_de_transferencia == 8945) {
        System.out.println("seu saldo é de "+this.saldo);
    }
}

}
