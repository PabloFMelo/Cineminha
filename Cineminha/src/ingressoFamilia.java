public class ingressoFamilia extends ingresso{

    Double valorFamilia;

    int pessoas;


    public ingressoFamilia(){
        Double valorFamilia = 0.0;
    }

//Get
    public int getPessoas() {
        return pessoas;
    }

    public double getValorFamilia(){
        return valorFamilia;
    }

//Set
    public void setValorFamilia(double valorFamilia){
        this.valorFamilia = valorFamilia;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }



}

