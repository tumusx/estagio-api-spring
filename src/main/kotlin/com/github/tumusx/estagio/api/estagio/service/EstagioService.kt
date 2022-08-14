package com.github.tumusx.estagio.api.estagio.service

import com.github.tumusx.estagio.api.estagio.model.Estagio
import com.github.tumusx.estagio.api.estagio.repository.EstagioRepository
import org.springframework.stereotype.Service

@Service
class EstagioService(private val estagioRepository: EstagioRepository) {

    fun getAllEstagio(): List<Estagio> =
        estagioRepository.findAll().sortedBy { it.idEstagio }

}
