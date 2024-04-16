public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano){
        if (dataCorreta(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean dataCorreta(Integer dia, Integer mes, Integer ano){
        if (mes >= 1 && mes <=12 && ano >= 1){
            Integer dias = numeroDiasMes(mes, ano);
            return dia >= 1 && dia <= dias;
        } else {
            return false;
        }
    }

    private Integer numeroDiasMes(Integer mes, Integer ano){
        if (mes == 2){
            if (ano/4 == 0){
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        } else {
            return 31;
        }
    }

    public Integer compararDatas(Data Data2){
        if (this.ano == Data2.ano) {
            if (this.mes == Data2.mes) {
                if (this.dia == Data2.dia) {
                    return 0;
                } else if (this.dia > Data2.dia) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.mes > Data2.mes) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.ano > Data2.ano){
            return 1;
        }  else {
            return -1;
        }
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMesExtenso(){
        if (mes == 1){
            return "Janeiro";
        } else if (mes == 2){
            return "Fevereiro";
        } else if (mes == 3){
            return "Março";
        } else if (mes == 4){
            return "Abril";
        } else if (mes == 5){
            return "Maio";
        } else if (mes == 6){
            return "Junho";
        } else if (mes == 7){
            return "Julho";
        } else if (mes == 8){
            return "Agosto";
        } else if (mes == 9){
            return "Setembro";
        } else if (mes == 10){
            return "Outubro";
        } else if (mes == 11){
            return "Novembro";
        } else if (mes == 12){
            return "Dezembro";
        } else {
            return "O mês digitado não existe";
        }
    }
}

