public enum EstadoBrasileiro {

    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro",12),
    PIAUI ("PI", "Piauí",13),
    MARANHAO ("MA", "Maranhão",15),
    CEARA("CE", "Ceará",16)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    
}

