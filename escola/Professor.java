package escola;
public class Professor extends Pessoa implements Secretaria{

    private int cargaHoraria;
    private String fone;

    public Professor(int cargaHoraria, String fone, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.cargaHoraria = cargaHoraria;
        this.fone = fone;
    }
    
    @Override
    public void info(){
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Telefone: " + this.fone);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public void dadosAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
