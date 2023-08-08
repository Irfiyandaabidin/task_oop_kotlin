open class Player(
    var nama: String = "",
    var hp: Int = 0,
    var atk: Int = 0
) {
    fun getNamaPlayer(): String{
        return nama;
    }
    fun setNamaPlayer(value: String){
        this.nama = value
    }
    fun getHpPlayer(): Int{
        return hp;
    }
    fun setHpPlayer(value: Int){
        this.hp = value
    }
    fun getAtkPlayer(): Int{
        return atk;
    }
    fun setAtkPlayer(value: Int){
        this.atk = value
    }
    fun status() {
        println("Class  : " + this.nama)
        println("HP     : " + this.hp)
        println("Attack : " + this.atk)
        println("")
    }
    fun attack(player: Player) {
        if(player.hp == 0){
            println("Bang udah bang, jangan diserang mulu dah mati playernya")
        } else {
            player.hp -= this.atk
            if(player.hp < 0){
                println("${this.nama} menyerang ${player.nama}, sisa hp ${player.nama} 0")
                player.hp = 0
            } else {
                println("${this.nama} menyerang ${player.nama}, sisa hp ${player.nama} ${player.hp}")
            }
        }
    }
    fun getHit(hit : Int) {
        println("Get hit $hit")
    }
}