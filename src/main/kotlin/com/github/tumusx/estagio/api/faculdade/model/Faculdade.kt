package com.github.tumusx.estagio.api.faculdade.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "faculdade")
data class Faculdade(
    @Id @GeneratedValue
    var idFaculdade: Long? = null,
    val nomeFaculdade: String = "",
)