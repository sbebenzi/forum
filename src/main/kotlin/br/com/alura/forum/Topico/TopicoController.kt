package br.com.alura.forum.Topico

import br.com.alura.forum.model.Respostas
import br.com.alura.forum.model.Topico
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service:TopicoService) {
    @GetMapping
    fun listar():List<Topico>{
        return service.getListaTopicos()
    }

    @GetMapping("/{id}")
    fun getToicosById(@PathVariable id:Long):Topico{
         return service.getToicosById(id)
    }

    @PostMapping
    fun criaTopico(@RequestBody topico:NovoTopico){
        service.criaTopico(topico)
    }
}