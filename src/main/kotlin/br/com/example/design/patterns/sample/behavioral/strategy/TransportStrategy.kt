package br.com.example.design.patterns.sample.behavioral.strategy

import br.com.example.design.patterns.sample.behavioral.strategy.enums.TransportTypeEnum

interface TransportStrategy {
    fun selectTransport(): TransportTypeEnum
}