package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result = 0
        bill.forEach {
            if (it != bill[k]) result += it
        }
        return if (result / 2 == b) "Bon Appetit" else (b - (result / 2)).toString()
    }
}
