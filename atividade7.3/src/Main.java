import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String primeiroHorario = JOptionPane.showInputDialog(null,"Digite o primeiro horario no formato (HH:MM:SS): ");
        String[] juntarHora1 = primeiroHorario.split(":");
        Integer segundos1 = Integer.parseInt(juntarHora1[0]);
        Integer minutos1 = Integer.parseInt(juntarHora1[1]);
        Integer horas1 = Integer.parseInt(juntarHora1[2]);

        String segundoHorario = JOptionPane.showInputDialog(null,"Digite o segundo horario no formato (HH:MM:SS): ");
        String[] juntarHora2 = segundoHorario.split(":");
        Integer segundos2 = Integer.parseInt(juntarHora2[0]);
        Integer minutos2 = Integer.parseInt(juntarHora2[1]);
        Integer horas2 = Integer.parseInt(juntarHora2[2]);

        Hora hora1 = new Hora(segundos1, minutos1, horas1);
        Hora hora2 = new Hora(segundos2, minutos2, horas2);

        Integer resultado = hora1.compararHoras(hora2);
        if (resultado == 0) {
            JOptionPane.showMessageDialog(null,"Os horário digitadas são iguais.");
        } else if (resultado == 1) {
            JOptionPane.showMessageDialog(null,"O primeiro horário é maior que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null,"O segundo horário é maior que o primeiro.");
        }

        JOptionPane.showMessageDialog(null, "Hora 1: " + hora1.getHoras() + ":" + hora1.getMinutos() + ":" + hora1.getSegundos()
                + "\nHora 2: " + hora2.getHoras() + ":" + hora2.getMinutos() + ":" + hora2.getSegundos());


    }
}