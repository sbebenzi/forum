package br.com.alura.forum.Autor

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class AutorService(private var usuarios:List<Usuario>) {
    init{
        val usuario = Usuario(
                id = 1,
                nome = "sarah",
                email = "sarah@algumacoisa"
        )

        usuarios = listOf(usuario)
    }

    fun getUsuarioById(id:Long):Usuario{
        return usuarios.stream().filter{usuario -> usuario.id == id}.findFirst().get()
    }
}