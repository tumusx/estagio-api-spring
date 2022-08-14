package com.github.tumusx.estagio.api.estagio.model

import com.github.tumusx.estagio.api.aluno.model.Aluno
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name = "estagio")
data class Estagio(
    @Id @GeneratedValue
    val idEstagio: Long? = null,
    val periodoEstagio: String? = "",
    val empresaEstagio: String? = "",
    @OneToMany(cascade = [CascadeType.PERSIST])
    val aluno: List<Aluno> = emptyList()
)
