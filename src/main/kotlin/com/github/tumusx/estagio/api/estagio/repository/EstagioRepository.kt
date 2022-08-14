package com.github.tumusx.estagio.api.estagio.repository

import com.github.tumusx.estagio.api.estagio.model.Estagio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EstagioRepository : JpaRepository<Estagio, Long> {
}