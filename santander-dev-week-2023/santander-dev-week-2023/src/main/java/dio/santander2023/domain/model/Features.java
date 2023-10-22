package dio.santander2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity (name = "tb_feature")
public class Features {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Descreve o que foi cargueado pelo militar;
    private String cargaDescricao;
    //Descreve o que foi descargueado pelo militar;
    private String descargaDescricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargaDescricao() {
        return cargaDescricao;
    }

    public void setCargaDescricao(String cargaDescricao) {
        this.cargaDescricao = cargaDescricao;
    }

    public String getDescargaDescricao() {
        return descargaDescricao;
    }

    public void setDescargaDescricao(String descargaDescricao) {
        this.descargaDescricao = descargaDescricao;
    }
}
