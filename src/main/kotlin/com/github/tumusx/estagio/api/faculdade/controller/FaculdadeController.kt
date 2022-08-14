package com.github.tumusx.estagio.api.faculdade.controller

import com.github.tumusx.estagio.api.faculdade.service.FaculdadeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/faculdade")
@RestController
class FaculdadeController(private val faculdadeService: FaculdadeService) {
}