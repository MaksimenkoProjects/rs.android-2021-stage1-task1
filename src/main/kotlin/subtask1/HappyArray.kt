package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val list = sadArray.toMutableList()
        var index = 1
        while (index < list.size - 1){
            if (list[index] > list[index - 1] + list[index + 1]){
                list.removeAt(index)
                if (index > 1) index--
            }else index++
        }
        return list.toIntArray()
    }
}