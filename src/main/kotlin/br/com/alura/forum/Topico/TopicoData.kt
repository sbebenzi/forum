package br.com.alura.forum.Topico

data class NovoTopico(
        val titulo:String,
        val mensagem:String,
        val idCurso:Long,
        val idAutor:Long
)