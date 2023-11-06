package br.com.appfinance.services;

import br.com.appfinance.domain.Editora;
import br.com.appfinance.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    public List<Editora> findAll() {

        return editoraRepository.findAll();
    }
}
