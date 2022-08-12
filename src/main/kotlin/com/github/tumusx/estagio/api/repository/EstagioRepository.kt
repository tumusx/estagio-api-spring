package com.github.tumusx.estagio.api.repository

import com.github.tumusx.estagio.api.model.Estagio
import org.springframework.data.jpa.repository.JpaRepository

interface EstagioRepository : JpaRepository<Estagio, Long> {
}