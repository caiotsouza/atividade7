import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Alunos alunos = new Alunos();

        alunos.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        alunos.setMatricula(Integer.valueOf(JOptionPane.showInputDialog(null, "\nDigite sua matrícula: ")));
        alunos.setProva1(Float.parseFloat(JOptionPane.showInputDialog(null, "\nDigite a nota do aluno na primeira prova de valor 3.0: ")));
        alunos.setProva2(Float.parseFloat(JOptionPane.showInputDialog(null, "\nDigite a nota do aluno na segunda prova de valor 3.0: ")));
        alunos.setTrabalho(Float.parseFloat(JOptionPane.showInputDialog(null, "\nDigite a nota do aluno no trabalho de valor 4.: ")));

        JOptionPane.showMessageDialog(null, "Nome do aluno: " + alunos.getNome() + "\nMatrícula: " + alunos.getMatricula()
        + "\nNota na primeira prova: " + alunos.getProva1() + "\nNota na segunda prova: " + alunos.getProva2() + "\nNota no trabalho: " + alunos.getTrabalho()
        + "\nSituação: " + alunos.isAprovado());
    }
}