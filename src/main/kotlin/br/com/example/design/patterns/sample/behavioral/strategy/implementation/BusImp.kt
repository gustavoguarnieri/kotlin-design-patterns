package br.com.example.design.patterns.sample.behavioral.strategy.implementation

import br.com.example.design.patterns.sample.behavioral.strategy.TransportStrategy
import br.com.example.design.patterns.sample.behavioral.strategy.enums.TransportTypeEnum
import br.com.example.design.patterns.sample.behavioral.strategy.constant.TransportConstant

class BusImp : TransportStrategy {
    override fun selectTransport(): TransportTypeEnum {
        return TransportTypeEnum.BUS.also {
            println(TransportConstant.USER_OPTED_BY_BUS)
        }
    }
}