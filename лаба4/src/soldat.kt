/**
 * класс солдат
 * @property famil - Фамилия
 * @property rost - Рост
 * @property ves- Вес
 *
 * @author Сотников Юрий, Изотов Влададимир
 */
open class soldat(_famil:String,_rost:Double,_ves:Double) {
    private var famil: String
    private var rost: Double
    private var ves: Double
    init {
        famil=_famil
        rost=_rost
        ves=_ves
    }

    /**
     * Расчет качества обьекта
     * @return - качество обьекта рассчитанное по формуле .....[Double]
     * @author - Сотников Юрий, Изотов Влададимир
     */
    open fun Qua():Double{
     return (rost*ves)
    }

    /**
     * Вывод информации на экран
     * @author - строка с информацией [String]
     * @author - Сотников Юрий, Изотов Влададимир
     */
    open fun V():String{
        return "Фамилия- $famil, Рост- $rost , Вес- $ves, Q- ${Qua()}"
    }
}