package org.example

class Personne {
    String nom
    int age

    void anniversaire() {
        age += 1
        println "Joyeux anniversaire, ${nom} ! Tu as maintenant ${age} ans."
    }

    String toString() {
        return "Nom: $nom, Age: $age"
    }
}

class POO {
    static void main(String[] args) {
        //creer une instance de Personne
        def personne = new Personne(nom: "Jean", age: 30)
        println(personne.toString())

        //creer une liste de personnes
        def personnes = [
                new Personne(nom: "Alice", age: 25),
                new Personne(nom: "Bob", age: 35),
                new Personne(nom: "Charlie", age: 28)
        ]
        //parcourir la liste de personnes
        personnes.each { p ->
            println(p.toString())
        }

        // KD
        // Appeler anniversaire pour chacun
        println "\n--- Après anniversaire ---"
        personnes.each {
            it.anniversaire()
        }
    }
}
