package com.github.tumusx.estagio.api.estagio.controller

import com.github.tumusx.estagio.api.estagio.model.Estagio
import com.github.tumusx.estagio.api.estagio.repository.EstagioRepository
import com.github.tumusx.estagio.api.estagio.service.EstagioService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.http.HttpResponse

@RestController
@RequestMapping("/estagio")
class EstagioController(private val estagioRepository: EstagioRepository, private val estagioService: EstagioService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrarEstagio(@RequestBody estagio: Estagio): Estagio = estagioRepository.save(estagio)

    @GetMapping("/listarEstagio")
    fun listarEstagio(): List<Estagio> = estagioService.getAllEstagio()

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
                empresaEstagio = estagio.empresaEstagio,
                periodoEstagio = estagio.periodoEstagio
            )
            ResponseEntity.ok(estagioRepository.save(estagiotoUpdate))
        }.orElse(ResponseEntity.notFound().build())
}