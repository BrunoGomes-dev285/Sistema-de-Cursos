package org.example.sistema_controle_curso.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;

@Getter
@Setter
public class Curso {
    private Long id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String nome;

    @NotBlank
    @Size(min = 3, max = 100)
    private String instrutor;

    @NotBlank
    private String descricao;

    @NotNull
    private Integer cargaHoraria;

    private NivelCurso nivel;

    private StatusCurso status;


    public Curso() {
        this.status = StatusCurso.ABERTO;
    }
    public void encerrar() {
    if(this.getStatus() == StatusCurso.ABERTO){
        this.setStatus(StatusCurso.FECHADO);
    }
    }
    public void reabrir() {
    if(this.getStatus() == StatusCurso.FECHADO){
        this.setStatus(StatusCurso.ABERTO);
    }
    }
}


