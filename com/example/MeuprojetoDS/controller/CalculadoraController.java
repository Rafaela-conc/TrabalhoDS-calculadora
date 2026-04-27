package com.example.MeuprojetoDS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/calculo")
public class CalculadoraController {

    @GetMapping("/concreto")
    public String calcularNoNavegador(
            @RequestParam double largura,
            @RequestParam double comprimento,
            @RequestParam double alturaViga) {
        double volume= largura * comprimento * alturaViga;

        return "<h1>Resultado do Cálculo - Meu projeto de DS</h1>" +
                "<p>Largura: " + largura + "m</p>" +
                "<p>Comprimento: " + comprimento + "m</p>" +
                "<p>Altura da Viga: " + alturaViga + "m</p>" +
                "<h2>O volume de concreto necessário é: " + volume + " m³</h2>";
    }
}
