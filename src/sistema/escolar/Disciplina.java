
package sistema.escolar;
// To criando com atributos bem basicos e padroes
public abstract class Disciplina {
    // Atributos
    private Professor responsavel;
    private int grau;
    private String nome;
    private int valorAvalicao;
    public float n1;
    public float n2;
    public float n3;

     // Metodos especiais
    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public int getValorAvalicao() {
        return valorAvalicao;
    }

    public void setValorAvalicao(int valorAvalicao) {
        this.valorAvalicao = valorAvalicao;
    }
    

    public Professor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Professor responsavel) {
        this.responsavel = responsavel;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
