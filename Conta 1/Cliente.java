public class Cliente {

private String cpf;
private String nome_do_titular;

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

public Cliente(String cpf, String nome_do_titular) {
    this.cpf = cpf;
    this.nome_do_titular = nome_do_titular;
}
   
         
    
}
