package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwaresBasicos;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico hb1, HardwareBasico hb2, HardwareBasico hb3,
                      SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.hardwaresBasicos = new HardwareBasico[3];
        this.hardwaresBasicos[0] = hb1;
        this.hardwaresBasicos[1] = hb2;
        this.hardwaresBasicos[2] = hb3;
        this.sistemaOperacional = so;
        this.memoriaUSB = null;
    }

    public void addMemoriaUSB(MemoriaUSB mu) {
        this.memoriaUSB = mu;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        for (int i = 0; i < 3; i++) {
            System.out.println(hardwaresBasicos[i].getNome() + ": " + hardwaresBasicos[i].getCapacidade());
        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() +
                " (" + sistemaOperacional.getTipo() + " bits)");

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " +
                    memoriaUSB.getCapacidade() + "Gb");
        }
        System.out.println();
    }
}