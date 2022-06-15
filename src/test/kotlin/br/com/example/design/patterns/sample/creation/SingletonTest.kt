package br.com.example.design.patterns.sample.creation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun singleton() {
        val firstDescription = Singleton.getDescription("First Kotlin Singleton Description")
        val secondDescription = Singleton.getDescription("Second Kotlin Singleton Description")

        assertThat(firstDescription).isSameAs(Singleton)
        assertThat(secondDescription).isSameAs(Singleton)
    }
}
