package org.example

class list_numbers {
    static void main(String[] args) {
        // Création de la liste
        def nombres = [1, 2, 3, 4, 5, 6]

        // Filtrer les nombres pairs
        def nombresPairs = nombres.findAll { it % 2 == 0 }
        def nombresImpairs = nombres.findAll { it % 2 != 0 }
        // Afficher le résultat
        println "Nombres pairs : ${nombresPairs}"
        println "Nombres impairs : ${nombresImpairs}"

    }
}
