## Hierarquia do Collection -> Framework API Java

### Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade.
    > Em uma variável consigo colocar vários elementos dentro.
    > Estes elementos precisarão ser Objetos
    > Uma coleção parece um Array.

- **Não aceita tipos primitivos**, apenas Objetos.
- Pode ter coleções homogêneas e heterogêneas, normalmente utilizada as homogêneas de um tipo específico.

- Há 4 grandes tipos de coleções: 
    > List (lista)
    > Set (conjunto)
    > Queue (fila)
    > Map (mapa)

## Generics Type

- Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.

- Exemplo:
    ```
        public class Box { 
            private Objeto objeto;

            public void set (Objeto objeto){
                 this.objeto = objeto;
            }

            public Objeto get(){
                return objeto;
            }

        }
      
    ```