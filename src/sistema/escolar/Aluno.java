
package sistema.escolar;


public class Aluno {
    // Atributos
     private String matricula;
     private String turmaAtual;
     private int faltas;
    

    // Metodos especiais
    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
     private int grau;
     
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurmaAtual() {
        return turmaAtual;
    }

    public void setTurmaAtual(String turmaAtual) {
        this.turmaAtual = turmaAtual;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
     
    // Metodos publicos
    
    public void Faltar (){
     this.setFaltas(this.getFaltas()+1);
        System.out.println("O aluno faltou "+this.getFaltas()+" vezes");
    }

    
}
