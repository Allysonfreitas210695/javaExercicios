package Questao_35;
public class EntradaEmAgenda {
    private  String assunto;
    private int dia, mes, ano, hora;

    EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
        this.setHora(hora >= 1 && hora <= 24 ? hora : 0);
        this.setDia(dia >= 1 && dia <= 31 ? dia : 0);
        this.setMes(mes >= 1 && mes <= 12 ? mes : 0);
        this.setAno(ano);
        this.setAssunto(assunto == null ? "Sem assunto" : assunto);
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.getDia() == dia && this.getMes() == mes && this.getAno() == ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setAssunto(String assunto){
        this.assunto = assunto;
    }

    public String getAssunto(){
        return this.assunto;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public int getHora(){
        return this.hora;
    }

    @Override
    public String toString() {
        String linha = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        String msg = linha+"\n";
        msg += "Data: "+this.getDia()+"/"+this.getMes()+"/"+this.getAno()+"\n";
        msg += "As: " + this.getHora()+"\n";
        msg += "Assunto: "+ this.getAssunto()+"\n";
        msg += linha+"\n";
        return msg;
    }

}
