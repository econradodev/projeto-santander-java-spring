## Projeto Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week 2023

## Diagrama de Classes
```mermaid
classDiagram
  class Usuario {
    nome: String
    dados: Dados
    features: Features
    quantidade: Quantidade
  }

  class Dados {
    matricula: String
    unidade: String
  }

  class Features {
    cargaIcon: String
    cargaDescricao: String
    descargaIcon: String
    descargaDescricao: String
  }

  class Quantidade {
    quantidadeRecebida: Number
    quantidadeRestante: Number
  }

  Usuario "1" *-- "1" Dados
  Usuario "1" *-- "1..N" Features
  Usuario "1" *-- "1" Quantidade

```
