package br.com.hello.demo.service;

import br.com.hello.demo.model.Contato;
import br.com.hello.demo.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    private FormRepository formRepository;

    public void salvar(Contato contato){
        formRepository.save(contato);
    }

    public List<Contato> listar(){
       return formRepository.findAll();
    }


}
