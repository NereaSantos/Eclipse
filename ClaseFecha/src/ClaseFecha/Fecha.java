package ClaseFecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }

    public boolean fechaCorrecta() {
        boolean fechaCorrecta = true;
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else {
            if (esBisiesto() && mes == 2) {
                if (dia < 1 || dia > 29) {
                    fechaCorrecta = false;
                }
            } else {
                if (dia < 1 || dia > diasMes[mes-1]) {
                    fechaCorrecta = false;
                }
            }
        }
        return fechaCorrecta;
    }

    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                anio++;
            }
        }
    }

    public String toString() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }
}
