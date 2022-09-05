/**
 * Вывод информации на экран
 * @author - строка с информацией [println]
 * @author - Сотников Юрий, Изотов Влададимир
 */
fun main(){
    println("Солдат")
    println("Введите образование, Фамиию, Рост и Вес")
    val b =obrz(_P = readLine().toString(),_famil = readLine().toString(), _rost = readLine().toString().toDouble() , _ves = readLine().toString().toDouble())
    println(b.V())
}

