package fr.quizzonepiece

import android.content.Intent

class Data {

    val question = arrayListOf( "Quel personnage n'est pas un grand corsaire ?",
        "Qui est le premier membres des Mugiwara à être arrivé sur Sabondy après l'élipse des 2 ans ?",
        "Quel forme du Gear Fourth de Luffy existe ?",
        "Qui est mort durant la grande guerrre ?",
        "Quel est l'insect favori de Monkey D Luffy ?",
        "Quell est le surnom de nico robin ?",
        "Quelle est le reve de sanji ?",
        "Comment se nomme le sabre favoris de zoro ?",

    )
    val answerPossible = arrayListOf(
        arrayListOf("Jimbe", "Boa Hancock", "Barbe Blanche", "Mihawk"),
        arrayListOf("Sanji", "Nami", "Chopper", "Zoro"),
        arrayListOf("Tiger Man", "Snake Man", "Monkey Man", "Lion Man"),
        arrayListOf("Ace", "Akainu", "Sabo", "Squardo"),
        arrayListOf("fourmi", "abeille", "mille patte", "Scarabée"),
        arrayListOf("L'enfant tragique", "la miskina", "L'enfant demoniaque", "la divine"),
        arrayListOf("All blue", "devenir le meilleur cuisinier", "ouvrir son restaurant", "se marier a la plus belle femme"),
        arrayListOf("Shusui", "Yubashiri", "Sandai Kitetsu", "Wadô Ichimonji", "Enma"),
    )
    val answer = arrayListOf("Barbe Blanche", "Zoro", "Snake Man", "Ace", "Scarabée", "L'enfant demoniaque", "All blue", "Wadô Ichimonji")
}