package br.com.example.design.patterns.sample.behavioral.strategy.implementation

import br.com.example.design.patterns.sample.behavioral.strategy.TransportStrategy
import br.com.example.design.patterns.sample.behavioral.strategy.enums.TransportTypeEnum
import br.com.example.design.patterns.sample.behavioral.strategy.constant.TransportConstant

class CarImp : TransportStrategy {
    override fun selectTransport(): TransportTypeEnum {
        return TransportTypeEnum.CAR.also {
            println(TransportConstant.USER_OPTED_BY_CAR)
        }
    }
}