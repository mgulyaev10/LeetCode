class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) return listOf(1)
        val currentRow = arrayListOf(1)
        for (i in 1..rowIndex) {
            val prevRow = arrayListOf<Int>()
            for (j in 0 until currentRow.size) {
                prevRow.add(currentRow[j])
            }
            for (j in 1..currentRow.size) {
                if (j == currentRow.size) {
                    currentRow.add(1)
                    continue
                }
                currentRow[j] = prevRow[j - 1] + prevRow[j]
            }
        }
        return currentRow
    }
}