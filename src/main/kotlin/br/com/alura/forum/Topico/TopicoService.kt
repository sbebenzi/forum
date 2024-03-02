package br.com.alura.forum.Topico

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Respostas
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService(private var topicos:List<Topico> ) {
    init{
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
        val topico2 = Topico(
                id = 2,
                titulos = "Duvida Kotlin2",
                mensagem = "variaveis Kotlin2",
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
        val topico3 = Topico(
                id = 3,
                titulos = "Duvida Kotlin3",
                mensagem = "variaveis Kotlin3",
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
        topicos = listOf(topico,topico2,topico3)
    }

    fun getListaTopicos(): List<Topico> {
        return topicos
    }

    fun getToicosById(id: Long) :Topico{
        return topicos.stream()
                      .filter { topico -> topico.id == id }
                      .findFirst()
                      .get()
    }


}