package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var result: Any = ""
        when(blockB){
            Int::class -> {
                result=0
                for(a in blockA){
                    var c = a as? Int
                    if(c != null){
                        result += c
                    }
                }
            }
            String::class -> {
                result=""
                for(a in blockA){
                    var c: String? = a as? String
                    if(c != null){
                        result += c
                    }
                }
            }
            LocalDate::class -> {
                result = ""
                val maxDate = blockA.filter { it!!::class == LocalDate::class }.maxBy { it as LocalDate } as LocalDate
                result = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(maxDate)
            }
        }
        return result
    }
}
