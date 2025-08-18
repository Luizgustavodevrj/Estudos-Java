package poo.exclasses.dois.funcionalidades;

public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public void imprime(){
        System.out.println(getData());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDia(){
        String[] dia = getData().split("/");
        String data = dia[0];
        return Integer.parseInt(dia[0]);
    }

    public int getMes(){
        String[] dia = getData().split("/");
        String data = dia[0];
        data = dia[1];
        return Integer.parseInt(dia[1]);
    }

    public int getAno(){
        String[] dia = getData().split("/");
        String data = dia[0];
        data = dia[1];
        data = dia[2];
        return Integer.parseInt(dia[2]);
    }

    public void isBissexto() {
        if((getAno() % 4 == 0) && (getAno() % 100 != 0 || getAno() % 400 == 0)) {
            System.out.println("Bissexto!");
        } else{
            System.out.println("Não bissexto");
        }
    }

}
