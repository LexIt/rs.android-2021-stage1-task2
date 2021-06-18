package subtask1

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        var result: String
        var d = LocalDate.now()

        try {
            val sss = SimpleDateFormat("yyyyMMdd")
            var test = LocalDate.parse(year.trim() +"-"+ month.trim().padStart(2, '0') +"-"+ day.trim().padStart(2, '0'))
            val dd = sss.parse(year.trim() + month.trim().padStart(2, '0') + day.trim().padStart(2, '0'))
            val sdf = SimpleDateFormat("d MMMM, EEEE")
            val dayOfTheWeek = sdf.format(dd)
            result = dayOfTheWeek.toLowerCase()

        } catch (e: Exception) {
            result= "Такого дня не существует"
        }

        return result
        //throw NotImplementedError("Not implemented")
    }
}
