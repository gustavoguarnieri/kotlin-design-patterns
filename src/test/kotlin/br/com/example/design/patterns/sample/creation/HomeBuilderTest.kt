package br.com.example.design.patterns.sample.creation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class HomeBuilderTest {

    @Test
    fun builder() {
        val homeBuilder = HomeBuilder.Builder()
            .setWall(true)
            .setRoof(true)
            .setDoor(true)

        Assertions.assertThat(homeBuilder.getWall()).isTrue
        Assertions.assertThat(homeBuilder.getRoof()).isTrue
        Assertions.assertThat(homeBuilder.getDoor()).isNull()
        Assertions.assertThat(homeBuilder.getPool()).isNull()
        Assertions.assertThat(homeBuilder.getBackyard()).isNull()
    }
}