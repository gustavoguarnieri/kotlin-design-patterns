package br.com.example.design.patterns.sample.behavioral.strategy

import br.com.example.design.patterns.sample.behavioral.strategy.context.TransportContext
import br.com.example.design.patterns.sample.behavioral.strategy.enums.TransportTypeEnum
import br.com.example.design.patterns.sample.behavioral.strategy.implementation.BusImp
import br.com.example.design.patterns.sample.behavioral.strategy.implementation.CarImp
import br.com.example.design.patterns.sample.behavioral.strategy.implementation.TaxiImp
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TransportContextTest {

    @Test
    fun shouldChooseBusTransport() {
        val transportContext = TransportContext(BusImp())
        val transportType = transportContext.chooseTransport()

        Assertions.assertThat(transportType).isSameAs(TransportTypeEnum.BUS)
    }

    @Test
    fun shouldChooseCarTransport() {
        val transportContext = TransportContext(CarImp())
        val transportType = transportContext.chooseTransport()

        Assertions.assertThat(transportType).isSameAs(TransportTypeEnum.CAR)
    }

    @Test
    fun shouldChooseTaxiTransport() {
        val transportContext = TransportContext(TaxiImp())
        val transportType = transportContext.chooseTransport()

        Assertions.assertThat(transportType).isSameAs(TransportTypeEnum.TAXI)
    }
}
