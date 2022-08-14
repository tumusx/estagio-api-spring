package com.github.tumusx.estagio.api.aluno.controller

import com.github.tumusx.estagio.api.aluno.model.Aluno
import com.github.tumusx.estagio.api.aluno.service.AlunoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/aluno")
@RestController
class AlunoController(private val alunoService: AlunoService) {
    @PostMapping
    fun insertAluno(@RequestBody aluno: Aluno) = alunoService.cadastrarAluno(aluno)

    @GetMapping("/listarAluno")
    fun findAllAluno() = alunoService.listarAluno()

    @DeleteMapping("/deletar/{id}")
    fun deleteAluno(@PathVariable id: Long) = alunoService.deletAluno(id)

    @GetMapping("{idAluno}")
    fun getAlunoById(@PathVariable idAluno: Long): ResponseEntity<Aluno> = alunoService.getAlunoById(idAluno)
}