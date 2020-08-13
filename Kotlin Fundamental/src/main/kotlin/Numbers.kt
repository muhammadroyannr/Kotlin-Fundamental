fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    // To Do
    val p = panjang.toInt() + 2
    val l = lebar
    val t = tinggi.toInt() + 1
    println("Volume dari balok yang mempunyai panjang $p, lebar $l, tinggi $t ini adalah ${hitungVolume(p, l, t)}")

}

fun hitungVolume(p : Int, l : Double, t : Int ) : Float
{
    val v = p * l * t
    return  v.toFloat()
}