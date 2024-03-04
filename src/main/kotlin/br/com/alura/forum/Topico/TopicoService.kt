package br.com.alura.forum.Topico

import br.com.alura.forum.Curso.CursoService
import br.com.alura.forum.Autor.AutorService
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
        private var topicos:List<Topico> = listOf(),
        private val cursoService :CursoService,
        private val usuarioService: AutorService
) {

    fun getListaTopicos(): List<Topico> {
        return topicos
    }

    fun getToicosById(id: Long) :Topico{
        return topicos.stream()
                      .filter { topico -> topico.id == id }
                      .findFirst()
                      .get()
    }

    fun criaTopico(novoTopico: NovoTopico){
        val topico = Topico(
                id = topicos.size.toLong(),
                titulos = novoTopico.titulo,
                mensagem = novoTopico.mensagem,
                curso = cursoService.getCursoById(novoTopico.idCurso),
                autor = usuarioService.getUsuarioById(novoTopico.idAutor)
        )

        topicos.plus(topico)
    }
}