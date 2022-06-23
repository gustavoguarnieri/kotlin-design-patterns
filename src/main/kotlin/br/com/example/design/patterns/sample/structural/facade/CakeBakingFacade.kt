package br.com.example.design.patterns.sample.structural.facade

/**
 * Facade is a structural design pattern that provides a simplified interface to a library,
 * framework, or any complex set of classes.
 */

class CakeBakingFacade(
    private val ingredients: Ingredients,
    private val cook: Cook,
    private val oven: Oven
) {
    fun cookCake() {
        ingredients.getIngredients(revenue = REVENUE)
        cook.mixIngredients()
        cook.shapeCake()
        oven.bakeCake(TEMPERATURE_IN_DEGREES)
    }

    companion object {
        const val REVENUE = "CAKE"
        const val TEMPERATURE_IN_DEGREES = 180
    }
}