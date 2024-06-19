public class Mathlete {
    public static void main(String[] args) {

        // Se o padrão mostrado continuar, qual é a letra na 2010ª posição?
        // MATHLETE

        String palavra = "MATHLETE";
        int posicao = 2010;
        int tamanhoPalavra = palavra.length();

        int resto = (posicao - 1) % tamanhoPalavra;
        char letra = palavra.charAt(resto);
        System.out.println(letra);

    }
}
