public class CabecalhoDinamico {
        public static void main(String[] args) {
            exibirCabecalho20("Bem-vindo ao Comex");
            exibirCabecalho40("Bem vindo ao Comex");
        }

        public static void exibirCabecalho20(String titulo) {
            int largura = 20;
            int espacosAntes = (largura - titulo.length()) / 2;

            // Imprime a linha de  cima do cabeçalho
            for (int i = 0; i < largura; i++) {
                System.out.print("-");
            }
            System.out.println();

            // Imprime o título
            System.out.println(titulo);

            // Imprime  a linha debaixo do cabeçalho
            for (int i = 0; i < largura; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    public static void exibirCabecalho40(String titulo) {
        int largura = 40;
        int espacosAntes = (largura - titulo.length()) / 2;

        // Imprime a linha de cima do cabeçalho
        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Imprime o título
        System.out.println(titulo);

        // Imprime a linha de baixo do cabeçalho
        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}


