package br.com.alura.forum.Curso

import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private var cursos:List<Curso>) {

    init {
        val curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
        )

        cursos = listOf(curso)
    }

    fun getCursoById(id:Long):Curso{
        return cursos.stream()
                     .filter{curso -> curso.id == id}
                     .findFirst()
                     .get()
    }
}