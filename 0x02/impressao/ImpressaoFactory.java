public class ImpressaoFactory {

    private static double valorColoridasFrenteVerso;
    private static double valorPretoBrancoFrenteVerso;
    private static double valorColoridasFrenteApenas;
    private static double valorPretoBrancoFrenteApenas;

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int qtdPaginasColoridas, boolean ehFrenteVerso){

        if (tamanhoImpressao == TamanhoImpressao.A2){
            if (ehFrenteVerso){
                valorColoridasFrenteVerso = 0.28;
                valorPretoBrancoFrenteVerso = 0.18;
            } else {
                valorColoridasFrenteApenas = 0.22;
                valorPretoBrancoFrenteApenas = 0.32;
            }
        } else if (tamanhoImpressao == TamanhoImpressao.A3) {
            if (ehFrenteVerso){
                valorColoridasFrenteVerso = 0.25;
                valorPretoBrancoFrenteVerso = 0.15;
            } else {
                valorColoridasFrenteApenas = 0.20;
                valorPretoBrancoFrenteApenas = 0.30;
            }
        } else if (tamanhoImpressao == TamanhoImpressao.A4) {
            if (ehFrenteVerso){
                valorColoridasFrenteVerso =  0.20;
                valorPretoBrancoFrenteVerso = 0.10;
            } else {
                valorColoridasFrenteApenas = 0.25;
                valorPretoBrancoFrenteApenas = 0.15;
            }
            
        }

        return new Impressao(totalPaginas, qtdPaginasColoridas, ehFrenteVerso, valorColoridasFrenteVerso, valorPretoBrancoFrenteVerso, valorColoridasFrenteApenas, valorPretoBrancoFrenteApenas);
    }
}
