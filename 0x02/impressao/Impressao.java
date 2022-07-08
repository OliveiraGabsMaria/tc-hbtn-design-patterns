public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas){
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }


    public double calcularTotal(){
        if (ehFrenteVerso){
            return (this.paginasColoridas * this.valorColoridasFrenteVerso) + ((this.paginasTotais - this.paginasColoridas) * this.valorPretoBrancoFrenteVerso);
        } else {
            return (this.paginasColoridas * this.valorColoridasFrenteApenas) + ((this.paginasTotais - this.paginasColoridas) * this.valorPretoBrancoFrenteApenas);
        }
    }

    @Override
    public String toString(){

        return "total de paginas: " + paginasTotais +
        ", total coloridas: " + paginasColoridas +
        ", total preto e branco: " + (paginasTotais - paginasColoridas) +
        ", " + ((ehFrenteVerso) ? "frente e verso" : "frente apenas") +
        ". total: R$ " + String.format("%.2f", calcularTotal());
    }

}
