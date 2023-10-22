package dio.santander2023.domain.model;

import jakarta.persistence.*;

@Entity (name = "tb_dados")
public class Dados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Matricula do militar;
    @Column(unique = true)
    private String matricula;
    //Unidade na qual o militar trabalha;
    private String unidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

}
