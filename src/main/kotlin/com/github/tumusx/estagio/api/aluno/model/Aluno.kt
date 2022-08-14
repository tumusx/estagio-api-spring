package com.github.tumusx.estagio.api.aluno.model

import com.github.tumusx.estagio.api.faculdade.model.Faculdade
import javax.persistence.*

@Entity(name = "aluno")
data class Aluno(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idAluno: Long? = null,
    val nomeAluno: String = "",
    val cursoAluno: String = "",
    @OneToOne(cascade = [CascadeType.PERSIST])
    val faculdade: Faculdade
)