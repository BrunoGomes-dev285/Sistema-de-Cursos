package org.example.sistema_controle_curso.controller;

import org.example.sistema_controle_curso.model.NivelCurso;
import org.springframework.ui.Model;
import jakarta.validation.Valid;
import org.example.sistema_controle_curso.model.Curso;
import org.example.sistema_controle_curso.repository.CursoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
    private final CursoRepository repository;

    public CursoController(CursoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cursos", repository.listarTodos());
        return "lista";
    }
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("cursos", new Curso());
        model.addAttribute("nivel", NivelCurso.values());
        return "formulario";
    }
    @PostMapping
    public String salvar(@Valid @ModelAttribute("curso") Curso curso,
                         BindingResult result, Model model) {
        if(result.hasErrors()){
            model.addAttribute("nivel", NivelCurso.values());
            return "formulario";
        }
        return "redirect:/lista";
    }
}
