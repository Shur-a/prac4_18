/**
 * класс образование
 * @property P - Образование
 * @author Сотников Юрий, Изотов Влададимир
 */
class obrz(_famil:String,_rost:Double,_ves:Double,_P: String,):soldat(_famil,_rost,_ves) {
    private var P: String

    init {
        P=_P

    }
    /**
     * Расчет качества обьекта
     * @return - качество обьекта рассчитанное по формуле .....[Double]
     * @author - Сотников Юрий, Изотов Влададимир
     */
    override fun Qua(): Double {
        if (P == "высшее") {
            return super.Qua()*2
        }
        else{
            if (P=="начальное"){
                return super.Qua() * 0.5
            }
            else{
                if (P=="среднее"){
                return super.Qua()
                }
                else{
                    return super.Qua()
                }
            }
        }
    }
    /**
     * Вывод информации на экран
     * @author - строка с информацией [String]
     * @author - Сотников Юрий, Изотов Влададимир
     */
    override fun V(): String {
        return super.V()+ " Образование- $P, QP- ${Qua()}"
    }
}