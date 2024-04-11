package escola;
public class Aluno extends Pessoa implements Secretaria{

    private int RA;
    private String curso;
    private String turno;

    public Aluno(int RA, String curso, String turno, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.RA = RA;
        this.curso = curso;
        this.turno = turno;
    }

//    getters e setters
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    

    @Override
    public void dadosAluno(){
        super.mostrar();
        System.out.println("RA: " +RA);
        System.out.println("Curso: " +curso);
        System.out.println("Turno: " +turno);
                
    }

    @Override
    public void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
