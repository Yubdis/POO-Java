package escola; 
public class Escola {
    public static void main(String[] args) {
        Professor prof1 = new Professor(12, "(51)99543-1234", "Adalto", 40, "123.456.789.00");
        prof1.info();
        prof1.mostrar();
        System.out.println("Professor: " + prof1.nome);
        System.out.println("Telefone: " + prof1.getFone());
        System.out.println("CPF: " + prof1.getCpf());
              
             
        
        Aluno aluno1 = new Aluno(998877, "ADS", "Manhã", "Juquinha", 19, "333.444.555-66");
        aluno1.dadosAluno();
    }
}
