public class Alunos {
    private Integer matricula;
    private String nome;
    private Float prova1;
    private Float prova2;
    private Float trabalho;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getProva1() {
        return prova1;
    }

    public void setProva1(Float prova1) {
        this.prova1 = prova1;
    }

    public Float getProva2() {
        return prova2;
    }

    public void setProva2(Float prova2) {
        this.prova2 = prova2;
    }

    public Float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Float trabalho) {
        this.trabalho = trabalho;
    }

    public Float notaTotal() {
        return  prova1 + prova2 + trabalho;
    }

    public String isAprovado() {
        if (notaTotal() >= 6){
            return "Aluno aprovado!";
        } else {
        return "Aluno reprovado.";
        }
    }
}
