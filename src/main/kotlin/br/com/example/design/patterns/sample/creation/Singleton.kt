package br.com.example.design.patterns.sample.creation

/**
 * Singleton is a creational design pattern that allows you to guarantee that a class has only one instance,
 * while providing a global access point for that instance.
 */

object Singleton {

    fun getDescription(description: String): Singleton =
        apply { println("The description value is $description with object: $this") }
}
