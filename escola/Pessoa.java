package escola;
public abstract class Pessoa { //Abstrata sempre é super
    public String nome;
    public int idade; //comentários
    private String cpf; //000.000.000-99

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    //Métodos
    public void mostrar(){
        System.out.println("INFORMAÇÕES DO SISTEMA");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("FIM DAS INFORMAÇÕes");
           
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
