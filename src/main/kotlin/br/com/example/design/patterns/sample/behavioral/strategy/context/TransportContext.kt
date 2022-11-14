package br.com.example.design.patterns.sample.behavioral.strategy.context

import br.com.example.design.patterns.sample.behavioral.strategy.TransportStrategy
import br.com.example.design.patterns.sample.behavioral.strategy.enums.TransportTypeEnum

class TransportContext(
    private val transportStrategy: TransportStrategy
) {
    fun chooseTransport(): TransportTypeEnum {
        return transportStrategy.selectTransport()
    }
}