## Projeto Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week 2023

## Diagrama de Classes
```mermaid
classDiagram
  class Usuario {
    nome: String
    dados: Dados
    dadosPessoais: DadosPessoais
    features: Features
    quantidade: Quantidade
    armamento: Armamento
    icone: Icone
  }

  class Dados {
    matricula: String
    unidade: String
  }

  class DadosPessoais {
    email: String
    telefone: String
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

  class Armamento {
    armaNumero: String
    armaModelo: String
    armaMarca: String
  }

  class Icone {
    pmbaIcon: String
    pmbaDescricao: String
  }

  Usuario "1" *-- "1" Dados
  Usuario "1" *-- "1" DadosPessoais
  Usuario "1" *-- "1..N" Features
  Usuario "1" *-- "1" Quantidade
  Usuario "1" *-- "1..N" Armamento
  Usuario "1" *-- "1" Icone
```
