package dio.santander2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "tb_quantidade")
public class Quantidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Recebe a quantidade de munições que o militar recebeu no inicio do ano;
    private Integer quantidadeRecebida;
    // Salva a quantidade de munições restantes;
    private Integer quantidadeRestante;

    public Integer getQuantidadeRestante() {
        return quantidadeRestante;
    }

    public void setQuantidadeRestante(Integer quantidadeRestante) {
        this.quantidadeRestante = quantidadeRestante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeRecebida() {
        return quantidadeRecebida;
    }

    public void setQuantidadeRecebida(Integer quantidadeRecebida) {
        this.quantidadeRecebida = quantidadeRecebida;
    }



}
