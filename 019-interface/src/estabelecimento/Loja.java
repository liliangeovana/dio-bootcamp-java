package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
    //Posso mudar no NEW qual a forma de impressão (Deskjet,Laserjet ou Equipamento) 
        Impressora xerox = new Deskjet();
        xerox.imprimir();

        //Aqui o equipamento realiza todos os diferentes métodos
        EquipamentoMultifuncional equipamento = new EquipamentoMultifuncional();
        Impressora impressora = equipamento;
        Digitalizadora digitalizadora = equipamento;
        Copiadora copiadora = equipamento;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
