package com.example.coffe4coders.utilities

import com.example.coffe4coders.models.Product

class MockDataProvider {
    companion object {
        fun listOfProducts(): List<Product> {
            return listOf(
                Product(
                    0,
                    "Café de Colombia",
                    "Nuestro esfuerzo y trabajo en conjunto representa el sueño  de amor por las montañas de nuestro pais.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et viverra dolor. In vehicula tortor a ex accumsan tempor quis at eros. Mauris quis elementum diam. Sed vestibulum dui leo, vitae posuere odio sodales a.",
                    50.0,
                    "USD",
                    "COL"
                ),
                Product(
                    1,
                    "Café de Costa Rica",
                    "Nuestro esfuerzo y trabajo en conjunto representa el sueño  de amor por las montañas de nuestro pais.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et viverra dolor. In vehicula tortor a ex accumsan tempor quis at eros. Mauris quis elementum diam. Sed vestibulum dui leo, vitae posuere odio sodales a.",
                    35.0,
                    "USD",
                    "CRI"
                ),
                Product(
                    2,
                    "Café de Nicaragua",
                    "Nuestro esfuerzo y trabajo en conjunto representa el sueño  de amor por las montañas de nuestro pais.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et viverra dolor. In vehicula tortor a ex accumsan tempor quis at eros. Mauris quis elementum diam. Sed vestibulum dui leo, vitae posuere odio sodales a.",
                    40.0,
                    "USD",
                    "NIC"
                ),Product(
                    3,
                    "Café de Brasil",
                    "Nuestro esfuerzo y trabajo en conjunto representa el sueño  de amor por las montañas de nuestro pais.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et viverra dolor. In vehicula tortor a ex accumsan tempor quis at eros. Mauris quis elementum diam. Sed vestibulum dui leo, vitae posuere odio sodales a.",
                    42.5,
                    "USD",
                    "BRA"
                ),
            )
        }

        fun getProductById(id: Int): Product? {
            val list = this.listOfProducts()
            return list.find { it.id == id }
        }
        fun listOfCities(): List<String> {
            return listOf(
                "Mexico City, Mexico",
                "The Habana, Cuba",
                "Cancun, Mexico",
                "Medellin, Colombia",
                "Buenos Aires, Argentina",
                "Sao Paulo, Brasil",
                "Lima, Peru",
                "Montevideo, Uruguay",
                "Panama City, Panama"
            )
        }
    }
}