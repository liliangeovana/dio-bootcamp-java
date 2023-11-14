JAVA *NÃO* PERMITE HERANÇA MÚLTIPLA (extends Classe 1 extends Classe 2..)

ENTÃO, QUANDO A MINHA CLASSE PRECISAR TER CARACTERÍSTICAS DE OUTRAS DIVERSAS CLASSES UTILIZA-SE INTERFACE!
    
INTERFACE É O NÍVEL MAIS ABSTRATO.


Minha classe EquipamentoMuntifuncional precisa ter todas as características dos equipamentos (imprimir, digitalizar e copiar)

Logo, os arquivos Impressora, Copiadora e Digitalizadora deixam de ser classes e passam a ser interfaces
    Exemplo: 
            public interface Copiadora {
                public void copiar();

                -- A interface possui um método (como se fosse uma classe abstrata) e quem quiser possuir a funcionalidade deverá implementá-lo.
            }

            
E as classes que herdam as características de cada uma das anteriores não utiliza mais o "extends", mas sim "implements"
    Exemplo:
        public class Xerox implements Copiadora {
    
        }