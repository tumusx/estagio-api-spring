package com.github.tumusx.estagio.api.faculdade.repository

import com.github.tumusx.estagio.api.faculdade.model.Faculdade
import org.springframework.data.jpa.repository.JpaRepository

interface FaculdadeRepository : JpaRepository<Faculdade, Long> {
}