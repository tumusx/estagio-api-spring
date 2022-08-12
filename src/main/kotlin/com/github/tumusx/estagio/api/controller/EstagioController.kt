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

    @PutMapping("/atualizarEstagio/{id}")
    fun atualizarEstagio(){

    }
}