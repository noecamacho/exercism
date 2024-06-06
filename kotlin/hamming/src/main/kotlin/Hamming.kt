object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }

        val zippedStrand = leftStrand.zip(rightStrand)
        val count = zippedStrand.count { it.first != it.second }

        return count
    }
}
