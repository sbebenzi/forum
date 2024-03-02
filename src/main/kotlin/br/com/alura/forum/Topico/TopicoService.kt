package br.com.alura.forum.Topico

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService {
    fun getListaTopicos(): List<Topico> {
        val topico = Topico(
                id = 1,
                titulos = "Duvida Kotlin",
                mensagem = "variaveis Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Sarah Benzi",
                        email = "sarah@email.com"
                )
        )

        return listOf(topico,topico,topico)
    }

}