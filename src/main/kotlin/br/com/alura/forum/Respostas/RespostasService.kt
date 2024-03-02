package br.com.alura.forum.Respostas

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Respostas
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class RespostasService( private var respostas:List<Respostas>) {

    init{
        val resposta = Respostas(
                id= 3 ,
                mensagem= "resposta 2",
                autor = Usuario(
                        id = 1,
                        nome = "Sarah Benzi",
                        email = "sarah@email.com"
                ),
                topico = Topico(
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
                ),
                solucao = true
        )
        val resposta2 = Respostas(
                id= 2 ,
                mensagem= "resposta 2",
                autor = Usuario(
                        id = 1,
                        nome = "Sarah Benzi",
                        email = "sarah@email.com"
                ),
                topico = Topico(
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
                ),
                solucao = true
        )
        val respossta3  = Respostas(
                id= 3 ,
                mensagem= "resposta 3",
                autor = Usuario(
                        id = 1,
                        nome = "Sarah Benzi",
                        email = "sarah@email.com"
                ),
                topico = Topico(
                        id = 3,
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
                ),
                solucao = true
        )
        respostas = listOf(resposta,resposta2,respossta3)
    }


    fun getRespostaTopico(id: Long): List<Respostas> {
        return respostas.filter{resposta -> resposta.topico.id == id}
    }

}