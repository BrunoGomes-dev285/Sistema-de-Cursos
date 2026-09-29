package org.example.sistema_controle_curso.repository;

import org.example.sistema_controle_curso.model.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CursoRepository {
    private final List<Curso> cursos = new ArrayList<>();
    private Long contador = 1L;
    public List<Curso> listarTodos() {
// implementar
    }
    public void salvar(Curso curso) {
// implementar
    }
    public Optional<Curso> buscarPorId(Long id) {
// stream + filter + findFirst
    }
    public List<Curso> listarAbertos() {
// stream + filter + toList
    }
}
