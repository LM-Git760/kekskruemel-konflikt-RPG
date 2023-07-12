package RPGV2

import kotlin.random.Random

class NormalerAngriff(var schaden:Int = Random.nextInt(12, 71)) : Aktion("Normaler Angriff"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        ziel.hp -= schaden
        Thread.sleep(500)
    }
}
