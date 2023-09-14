package questao1;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;


    public Estoque() {
        this.nome = "";
        this.qtdAtual = 0;
        this.qtdMinima = 0;
    }


    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }


    public void darBaixa(int qtde) {
        if (qtde >= 0 && (qtdAtual - qtde) >= 0) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }


    public String mostra() {
        return "Nome: " + nome + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual;
    }


    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Produto A", 100, 20);

        System.out.println("Informações do estoque inicial:");
        System.out.println(estoque.mostra());


        estoque.darBaixa(30);
        System.out.println("\nApós dar baixa de 30 unidades:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(50);
        System.out.println("\nApós dar baixa de 50 unidades:");
        System.out.println(estoque.mostra());


        if (estoque.precisaRepor()) {
            System.out.println("\nÉ necessário repor o estoque.");
        } else {
            System.out.println("\nNão é necessário repor o estoque.");
        }
    }
}
