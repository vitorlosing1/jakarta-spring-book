package br.com.appfinance.controllers;

import br.com.appfinance.domain.Editora;
import br.com.appfinance.services.EditoraService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    List<Editora> editoraList;

    private Editora editora;

    @PostConstruct
    public List <Editora> findAll() {
        return editoraList = editoraService.findAll();

    }
}
