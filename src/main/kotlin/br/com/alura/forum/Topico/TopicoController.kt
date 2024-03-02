package br.com.alura.forum.Topico

import br.com.alura.forum.model.Topico
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service:TopicoService) {
    @GetMapping
    fun listar():List<Topico>{
        return service.getListaTopicos()
    }
}