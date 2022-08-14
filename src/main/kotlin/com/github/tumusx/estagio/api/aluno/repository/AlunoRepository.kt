package com.github.tumusx.estagio.api.aluno.repository

import com.github.tumusx.estagio.api.aluno.model.Aluno
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlunoRepository : JpaRepository<Aluno, Long> {
}