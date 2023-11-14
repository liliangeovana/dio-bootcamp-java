## Hierarquia do Collection -> Framework API Java

### Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade.
    > Ou seja, em uma variável consigo colocar vários elementos dentro. (Elementos precisarão ser Objetos).
    -Uma coleção parece um Array.

- **Não aceita tipos primitivos**, apenas Objetos.
- Pode ter coleções homogêneas e heterogêneas, normalmente utilizada as homogêneas de um tipo específico.

- Há 4 grandes tipos de coleções: 
    1. List (lista)
    2. Set (conjunto)
    3. Queue (fila)
    4. Map (mapa)

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