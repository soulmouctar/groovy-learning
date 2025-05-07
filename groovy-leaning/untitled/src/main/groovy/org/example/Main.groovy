package org.example
class Personne {
    String nom
    int age

    String toString() {
        return "Nom: $nom, Age: $age"
    }
}

static void main(String[] args) {
    String nom = "Grails"
    int age = 9
    println("Bonjour, je m'appelle $nom et j'ai $age ans.")

    //creer une liste de fruits et parcourir
    def fruits = ["Pomme", "Banane", "Orange"]
    fruits.each { fruit ->
        println("Fruit: $fruit")
    }

    //creer une map de pays et leurs capitales
    def pays = [
        "France": "Paris",
        "Espagne": "Madrid",
        "Italie": "Rome"
    ]
    pays.each { pay, capitale ->
        println("Le pays $pay a pour capitale $capitale.")
    }

    //parcourir la map
    pays.each { pay, capitale ->
        println("La capitale de $pay est $capitale.")
    }

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
}