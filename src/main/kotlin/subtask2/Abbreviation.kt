package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val c = a.toUpperCase()
        var i =0
        var resultString = ""

        for(d in b){
            if(i>=c.length){
                break;}

            while(i < c.length){
                if(d == c[i]){
                    //Если нашли нужную букву-прерываем цикл, сдвигая предварительно счетчик на следующую позицию
                    // Найденную букву записываем в результирующую строку
                    i++
                    resultString += d
                    break
                }
                i++
            }
        }

        if(resultString == b){
            return "YES"
        }
        else{
            return "NO"
        }

        //throw NotImplementedError("Not implemented")
    }
}
