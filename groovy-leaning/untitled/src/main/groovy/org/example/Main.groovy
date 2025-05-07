package org.example


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


}