import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String primeiraData = JOptionPane.showInputDialog(null,"Digite a primeira data no formato dd/mm/aaaa: ");
        String[] juntarData1 = primeiraData.split("/");
        Integer dia1 = Integer.parseInt(juntarData1[0]);
        Integer mes1 = Integer.parseInt(juntarData1[1]);
        Integer ano1 = Integer.parseInt(juntarData1[2]);

        String segundaData = JOptionPane.showInputDialog(null,"Digite a segunda data no formato dd/mm/aaaa: ");
        String[] juntarData2 = segundaData.split("/");
        Integer dia2 = Integer.parseInt(juntarData2[0]);
        Integer mes2 = Integer.parseInt(juntarData2[1]);
        Integer ano2 = Integer.parseInt(juntarData2[2]);

        Data data1 = new Data(dia1, mes1, ano1);
        Data data2 = new Data(dia2, mes2, ano2);

        Integer resultado = data1.compararDatas(data2);
        if (resultado == 0) {
            JOptionPane.showMessageDialog(null,"As datas digitadas são iguais.");
        } else if (resultado == 1) {
            JOptionPane.showMessageDialog(null,"A primeira data é maior que a segunda data.");
        } else {
            JOptionPane.showMessageDialog(null,"A segunda data é maior que a primeira data.");
        }

        JOptionPane.showMessageDialog(null,"Mês da data corrente por extenso: " + data1.getMesExtenso() + "\nData 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno()
                + "\nData 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

    }
}

