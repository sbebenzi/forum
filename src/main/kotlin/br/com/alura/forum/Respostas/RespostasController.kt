package br.com.alura.forum.Respostas

import br.com.alura.forum.model.Respostas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/respostas/{id}")
class RespostasController(private var service:RespostasService) {
    @GetMapping
    fun getRespostaTopico(@PathVariable id:Long):List<Respostas>{
        return service.getRespostaTopico(id)
    }
}