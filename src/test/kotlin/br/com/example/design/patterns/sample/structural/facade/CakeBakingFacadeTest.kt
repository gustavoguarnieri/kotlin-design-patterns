package br.com.example.design.patterns.sample.structural.facade

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CakeBakingFacadeTest {

    private lateinit var cakeBakingFacade: CakeBakingFacade

    @MockK
    private lateinit var ingredients: Ingredients

    @MockK
    private lateinit var cook: Cook

    @MockK
    private lateinit var oven: Oven

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        cakeBakingFacade = CakeBakingFacade(ingredients, cook, oven)
    }

    @Test
    fun cookCake() {
        every { ingredients.getIngredients(any()) } returns Unit
        every { cook.mixIngredients() } returns Unit
        every { cook.shapeCake() } returns Unit
        every { oven.bakeCake(any()) } returns Unit

        CakeBakingFacade(ingredients, cook, oven).cookCake()

        verify(exactly = 1) {
            ingredients.getIngredients(any())
            cook.mixIngredients()
            cook.shapeCake()
            oven.bakeCake(any())
        }
    }
}