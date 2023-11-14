package equipamentos.multifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    //CÓPIA
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    //DIGITALIZAR
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");   
    }

    //IMPRIMIR
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");    
    }
   
    
}