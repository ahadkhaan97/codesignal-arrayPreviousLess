fun main() {
    print(solution(mutableListOf(3, 5, 2, 4, 5)))
}

fun solution(items: MutableList<Int>): MutableList<Int> {
    val answer = IntArray(items.size) { -1 }
    for (i in 1 until items.size) {
        for (j in i - 1 downTo 0) {
            if (items[j] < items[i]) {
                answer[i] = items[j]
                break
            }
        }
    }
    return answer.toMutableList()
}
