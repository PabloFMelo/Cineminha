public class ingresso {

//Atributos
    Double valor;
    int filme;
    int ingresso;
    int subtitles;



    //Construtores
public ingresso() {
    double valor = 0.0;
    int filme = 0;
    int ingressos = 0;
    int subtitles = 0;
}


//metodos
    //get
    public int getFilme(){
    return  filme;
    }

    public int getIngresso() {
        return ingresso;
    }


    public double getValor(double valor) {
        return valor;
    }


    public int getSubtitles(int next) {
        return subtitles;
    }


//set
    public void setFilme (int filme){
    this.filme = filme;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public void setSubtitles(int subtitles) {
        this.subtitles = subtitles;
    }
}
