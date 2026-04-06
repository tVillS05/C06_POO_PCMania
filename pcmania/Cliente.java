package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compra;
    private int qtdCompras;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compra = new Computador[100];
        this.qtdCompras = 0;
    }

    public void comprar(Computador pc) {
        if (qtdCompras < compra.length) {
            compra[qtdCompras] = pc;
            qtdCompras++;
        }
    }

    public Computador[] getCompra() {
        return compra;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }

    public void mostraInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("PCs comprados:" + qtdCompras);
    }
}
