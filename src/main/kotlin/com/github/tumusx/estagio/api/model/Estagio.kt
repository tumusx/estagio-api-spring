package com.github.tumusx.estagio.api.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "estagio")
data class Estagio(
    @Id @GeneratedValue
    val idEstagio: Long? = null,
    val nomeEstagiario: String? = "",
    val cargoEstagio: String? = "",
    val periodoEstagio: String? = "",
    val empresaEstagio: String? = ""
)
