package com.github.tumusx.estagio.api.aluno.service

import com.github.tumusx.estagio.api.aluno.model.Aluno
import com.github.tumusx.estagio.api.aluno.repository.AlunoRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class AlunoService(private val alunoRepository: AlunoRepository) {
    fun cadastrarAluno(aluno: Aluno): Aluno = alunoRepository.save(aluno)
    fun listarAluno() = alunoRepository.findAll()

    fun deletAluno(id: Long) = alunoRepository.deleteById(id)

    fun getAlunoById(idAluno: Long) =
        alunoRepository.findById(idAluno).map { ResponseEntity.ok(it) }.orElse(ResponseEntity.notFound().build())
}