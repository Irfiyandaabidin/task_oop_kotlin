import Player

fun main(args: Array<String>) {
    println("Hello World!")
    val hitter = Hitter(hp=100, atk= 40)
    val magician = Magician(hp=70, atk= 80)
    val tanker = Tanker(hp=400, atk= 20)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    magician.status();
    hitter.status();
    tanker.status();
    tanker.getHit(hit = 20);
    magician.attack(hitter)
    magician.attack(hitter)
    magician.attack(hitter)
    magician.attack(hitter)
    tanker.attack(magician)
    hitter.attack(tanker)
}