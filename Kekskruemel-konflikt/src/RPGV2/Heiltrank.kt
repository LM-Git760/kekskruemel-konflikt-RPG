package RPGV2

class Heiltrank:Gegenstand("Heiltrank") {
    override fun benutzen(held: Held) {
        val maxHp = 200
        held.hp += maxHp / 2
        if (held.hp > maxHp){
            held.hp = maxHp
        }
    }
}