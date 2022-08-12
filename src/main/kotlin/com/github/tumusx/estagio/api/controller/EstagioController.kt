package com.github.tumusx.estagio.api.controller

import com.github.tumusx.estagio.api.model.Estagio
import com.github.tumusx.estagio.api.repository.EstagioRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/estagio")
class EstagioController(private val estagioRepository: EstagioRepository) {

    @PostMapping
    fun cadastrarEstagio(@RequestBody estagio: Estagio): Estagio = estagioRepository.save(estagio)

    @GetMapping("/listarEstagio")
    fun listarEstagio(): List<Estagio> = estagioRepository.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Estagio> {
        return estagioRepository.findById(id).map { ResponseEntity.ok(it) }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/deletarEstagio/{id}")
    fun deletarEstagio(@PathVariable id: Long) = estagioRepository.deleteById(id)

    @PutMapping("atualizar/{id}")
    fun atualizarEstagio(@PathVariable id: Long, @RequestBody estagio: Estagio): ResponseEntity<Estagio> =
        estagioRepository.findById(id).map { estagio ->
            val estagiotoUpdate = estagio.copy(
                cargoEstagio = estagio.cargoEstagio,
                nomeEstagiario = estagio.nomeEstagiario,
                empresaEstagio = estagio.empresaEstagio,
                periodoEstagio = estagio.periodoEstagio
            )
            ResponseEntity.ok(estagioRepository.save(estagiotoUpdate))
        }.orElse(ResponseEntity.notFound().build())
}