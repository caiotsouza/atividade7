public class Hora {
        private Integer horas;
        private Integer minutos;
        private Integer segundos;

        public Hora(Integer horas, Integer minutos, Integer segundos){
            if (horaCorreta(horas, minutos, segundos)){
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
            } else {
                this.horas = 0;
                this.minutos = 0;
                this.segundos = 0;
            }
        }

        public boolean horaCorreta(Integer horas, Integer minutos, Integer segundos){
            if (horas <= 24 && minutos <= 60 && segundos <= 60){
                return true;
            } else {
                return false;
            }
        }

        public Integer compararHoras(Hora Hora2){
            if (this.horas == Hora2.horas){
                if (this.minutos == Hora2.minutos){
                    if (this.segundos == Hora2.segundos){
                        return 0;
                    } else if (this.segundos > Hora2.segundos) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (this.minutos > Hora2.minutos){
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.horas > Hora2.horas){
                return 1;
            } else {
                return -1;
            }
        }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
}
