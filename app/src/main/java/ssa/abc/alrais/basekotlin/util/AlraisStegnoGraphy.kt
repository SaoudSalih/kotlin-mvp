package ssa.abc.alrais.basekotlin.util


/**
 * Created by saoud on 12/6/17.
 */
abstract class AlraisStegnoGraphy{


    /**
     * here steganographed is true the custructor allow class to convert steganographed text to original text
     * @param text
     * *
     * @param steganographed
     * *
     * @param steganoPattern
     */

    constructor(text: String, steganographed: Boolean, steganoPattern: String) {
        if (steganographed) {

            deCoding(text, steganoPattern)
        } else {
            enCoding(text, steganoPattern)
        }
    }

    protected abstract fun getSteganoWord(stegano: String)
    protected abstract fun getText(stegano: String)
    private var BINARY_NUMBER: ArrayList<String>? = null
    private var NIBBLE: ArrayList<String>? = null
    private var LOWER_NIBBLE = ""
    private var HIGHER_NIBBLE = ""
    private var ALPHABETS: ArrayList<String>? = null
    private var hmap_d_ALPHABET: HashMap<String, Int>? = null
    var hmap_e_ALPHABET: HashMap<Int, String>? = null
    private var en_hmap_BINARY: HashMap<String, Int>? = null
    private var dec_hmap_BINARY: HashMap<Int, String>? = null
    private var DECIMAL_FOR_NIBBLE: ArrayList<Int>? = null
    private var DECIMALVALUES: ArrayList<Int>? = null
    private var hmap_BINRYASCII: HashMap<String, Int>? = null
    private var ASCII_VALUES: ArrayList<Int>? = null
    private var hmap_ASCII_CHAR: HashMap<Int, String>? = null

    private fun enCoding(PASSWORD: String, steganoPattern: String) {
        var PASSWORD = PASSWORD

        PASSWORD = PASSWORD.toUpperCase()
        val ASCII = IntArray(PASSWORD.length)

        for (i in 0..PASSWORD.length - 1) {
            ASCII[i] = CharToASCII(PASSWORD[i])
        }

        BINARY_NUMBER = ArrayList<String>()

        for (i in ASCII.indices) {
            BINARY_NUMBER?.add(printBinaryFormat(ASCII[i]))
        }

        NIBBLE = ArrayList<String>()

        for (i in 0..BINARY_NUMBER!!.size - 1) {
            for (j in 0..BINARY_NUMBER!!.get(i).length - 1) if (j <= 3) {
                LOWER_NIBBLE = LOWER_NIBBLE + BINARY_NUMBER?.get(i)?.charAt(j)
            } else {
                HIGHER_NIBBLE = HIGHER_NIBBLE + BINARY_NUMBER?.get(i)?.charAt(j)
            }

            NIBBLE?.add(LOWER_NIBBLE)
            NIBBLE?.add(HIGHER_NIBBLE)

            LOWER_NIBBLE = ""
            HIGHER_NIBBLE = ""

        }

        en_hmap_BINARY = HashMap<String, Int>()
        en_hmap_BINARY?.put("0000", 0)
        en_hmap_BINARY?.put("0001", 1)
        en_hmap_BINARY?.put("0010", 2)
        en_hmap_BINARY?.put("0011", 3)
        en_hmap_BINARY?.put("0100", 4)
        en_hmap_BINARY?.put("0101", 5)
        en_hmap_BINARY?.put("0110", 6)
        en_hmap_BINARY?.put("0111", 7)
        en_hmap_BINARY?.put("1000", 8)
        en_hmap_BINARY?.put("1001", 9)
        en_hmap_BINARY?.put("1010", 10)
        en_hmap_BINARY?.put("1011", 11)
        en_hmap_BINARY?.put("1100", 12)
        en_hmap_BINARY?.put("1101", 13)
        en_hmap_BINARY?.put("1110", 14)
        en_hmap_BINARY?.put("1111", 15)

        DECIMAL_FOR_NIBBLE = ArrayList<Int>()

        for (i in 0..NIBBLE!!.size - 1) {
            en_hmap_BINARY!!.get(NIBBLE!!.get(i))?.let { DECIMAL_FOR_NIBBLE!!.add(it) }
        }

        hmap_e_ALPHABET = HashMap<Int, String>()

        hmap_e_ALPHABET?.put(0, "Q")
        hmap_e_ALPHABET?.put(1, "J")
        hmap_e_ALPHABET?.put(2, "Z")
        hmap_e_ALPHABET?.put(3, "V")
        hmap_e_ALPHABET?.put(4, "Y")
        hmap_e_ALPHABET?.put(5, "B")
        hmap_e_ALPHABET?.put(6, "G")
        hmap_e_ALPHABET?.put(7, "H")
        hmap_e_ALPHABET?.put(8, "D")
        hmap_e_ALPHABET?.put(9, "C")
        hmap_e_ALPHABET?.put(10, "L")
        hmap_e_ALPHABET?.put(11, "N")
        hmap_e_ALPHABET?.put(12, "O")
        hmap_e_ALPHABET?.put(13, "I")
        hmap_e_ALPHABET?.put(14, "A")
        hmap_e_ALPHABET?.put(15, "E")

        ALPHABETS = ArrayList<String>()

        for (i in 0..DECIMAL_FOR_NIBBLE!!.size - 1) {
            ALPHABETS!!.add(hmap_e_ALPHABET!!.get(DECIMAL_FOR_NIBBLE!!.get(i))!!)
        }
        val WORDS = arrayOf("amazone", "bodhiinfo", "cloud", "diversion", "earthline", "facebook", "goalinfo", "helpline", "in", "jack", "kingfra", "line", "menubar", "network", "or", "plane", "quest", "reorder", "sing", "to", "under", "veeble", "wins", "xray", "yet", "zoo")

        var SECRET_SENTENCE = ""

        for (i in 0..ALPHABETS!!.size - 1) {
            for (j in WORDS.indices) {
                if (WORDS[j].startsWith(ALPHABETS!!.get(i).toLowerCase())) {
                    SECRET_SENTENCE = SECRET_SENTENCE + steganoPattern + WORDS[j]
                }

            }
        }

        getSteganoWord(SECRET_SENTENCE)

    }

    private fun deCoding(SECRET_SENTNCE: String, steganoPattern: String) {

        val WORDS = SECRET_SENTNCE.split(steganoPattern.toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        ALPHABETS = ArrayList<String>()
        for (word in WORDS) {
            if (word.length > 0)
                ALPHABETS?.add("" + word.toUpperCase()[0])
        }

        hmap_d_ALPHABET = HashMap<String, Int>()
        hmap_d_ALPHABET?.put("Q", 0)
        hmap_d_ALPHABET?.put("J", 1)
        hmap_d_ALPHABET?.put("Z", 2)
        hmap_d_ALPHABET?.put("V", 3)
        hmap_d_ALPHABET?.put("Y", 4)
        hmap_d_ALPHABET?.put("B", 5)
        hmap_d_ALPHABET?.put("G", 6)
        hmap_d_ALPHABET?.put("H", 7)
        hmap_d_ALPHABET?.put("D", 8)
        hmap_d_ALPHABET?.put("C", 9)
        hmap_d_ALPHABET?.put("L", 10)
        hmap_d_ALPHABET?.put("N", 11)
        hmap_d_ALPHABET?.put("O", 12)
        hmap_d_ALPHABET?.put("I", 13)
        hmap_d_ALPHABET?.put("A", 14)
        hmap_d_ALPHABET?.put("E", 15)

        DECIMALVALUES = ArrayList<Int>()

        for (i in 0..ALPHABETS!!.size - 1) {
            DECIMALVALUES?.add(hmap_d_ALPHABET?.get(ALPHABETS?.get(i))!!)
        }
        dec_hmap_BINARY = HashMap<Int, String>()
        dec_hmap_BINARY?.put(0, "0000")
        dec_hmap_BINARY?.put(1, "0001")
        dec_hmap_BINARY?.put(2, "0010")
        dec_hmap_BINARY?.put(3, "0011")
        dec_hmap_BINARY?.put(4, "0100")
        dec_hmap_BINARY?.put(5, "0101")
        dec_hmap_BINARY?.put(6, "0110")
        dec_hmap_BINARY?.put(7, "0111")
        dec_hmap_BINARY?.put(8, "1000")
        dec_hmap_BINARY?.put(9, "1001")
        dec_hmap_BINARY?.put(10, "1010")
        dec_hmap_BINARY?.put(11, "1011")
        dec_hmap_BINARY?.put(12, "1100")
        dec_hmap_BINARY?.put(13, "1101")
        dec_hmap_BINARY?.put(14, "1110")
        dec_hmap_BINARY?.put(15, "1111")

        NIBBLE = ArrayList<String>()

        for (i in 0..DECIMALVALUES!!.size - 1) {
            NIBBLE!!.add(dec_hmap_BINARY!!.get(DECIMALVALUES!!.get(i))!!)
        }
        val BINARY_VALUES = ArrayList<String>()

        var LOWER = ""
        var HIGHER = ""

        run {
            var i = 0
            while (i < NIBBLE!!.size) {
                LOWER = NIBBLE!!.get(i)
                HIGHER = NIBBLE!!.get(++i)
                BINARY_VALUES.add(LOWER + HIGHER)
                i++
            }
        }
        hmap_BINRYASCII = HashMap<String, Int>()

        hmap_BINRYASCII?.put("01000001", 65)
        hmap_BINRYASCII?.put("01000010", 66)
        hmap_BINRYASCII?.put("01000011", 67)
        hmap_BINRYASCII?.put("01000100", 68)
        hmap_BINRYASCII?.put("01000101", 69)
        hmap_BINRYASCII?.put("01000110", 70)
        hmap_BINRYASCII?.put("01000111", 71)
        hmap_BINRYASCII?.put("01001000", 72)
        hmap_BINRYASCII?.put("01001001", 73)
        hmap_BINRYASCII?.put("01001010", 74)
        hmap_BINRYASCII?.put("01001011", 75)
        hmap_BINRYASCII?.put("01001100", 76)
        hmap_BINRYASCII?.put("01001101", 77)
        hmap_BINRYASCII?.put("01001110", 78)
        hmap_BINRYASCII?.put("01001111", 79)
        hmap_BINRYASCII?.put("01010000", 80)
        hmap_BINRYASCII?.put("01010001", 81)
        hmap_BINRYASCII?.put("01010010", 82)
        hmap_BINRYASCII?.put("01010011", 83)
        hmap_BINRYASCII?.put("01010100", 84)
        hmap_BINRYASCII?.put("01010101", 85)
        hmap_BINRYASCII?.put("01010110", 86)
        hmap_BINRYASCII?.put("01010111", 87)
        hmap_BINRYASCII?.put("01011000", 88)
        hmap_BINRYASCII?.put("01011001", 89)
        hmap_BINRYASCII?.put("01011010", 90)

        ASCII_VALUES = ArrayList<Int>()

        for (i in 0..BINARY_VALUES.size - 1) {
            ASCII_VALUES?.add(hmap_BINRYASCII?.get(BINARY_VALUES[i])!!)
        }

        hmap_ASCII_CHAR = HashMap<Int, String>()
        hmap_ASCII_CHAR?.put(65, "A")
        hmap_ASCII_CHAR?.put(66, "B")
        hmap_ASCII_CHAR?.put(67, "C")
        hmap_ASCII_CHAR?.put(68, "D")
        hmap_ASCII_CHAR?.put(69, "E")
        hmap_ASCII_CHAR?.put(70, "F")
        hmap_ASCII_CHAR?.put(71, "G")
        hmap_ASCII_CHAR?.put(72, "H")
        hmap_ASCII_CHAR?.put(73, "I")
        hmap_ASCII_CHAR?.put(74, "J")
        hmap_ASCII_CHAR?.put(75, "K")
        hmap_ASCII_CHAR?.put(76, "L")
        hmap_ASCII_CHAR?.put(77, "M")
        hmap_ASCII_CHAR?.put(78, "N")
        hmap_ASCII_CHAR?.put(79, "O")
        hmap_ASCII_CHAR?.put(80, "P")
        hmap_ASCII_CHAR?.put(81, "Q")
        hmap_ASCII_CHAR?.put(82, "R")
        hmap_ASCII_CHAR?.put(83, "S")
        hmap_ASCII_CHAR?.put(84, "T")
        hmap_ASCII_CHAR?.put(85, "U")
        hmap_ASCII_CHAR?.put(86, "V")
        hmap_ASCII_CHAR?.put(87, "W")
        hmap_ASCII_CHAR?.put(88, "X")
        hmap_ASCII_CHAR?.put(89, "Y")
        hmap_ASCII_CHAR?.put(90, "Z")

        var SECRET_PASSWORD = ""

        for (i in 0..ASCII_VALUES!!.size - 1) {
            SECRET_PASSWORD = SECRET_PASSWORD + hmap_ASCII_CHAR!![ASCII_VALUES!!.get(i)]
        }
        getText(SECRET_PASSWORD.toLowerCase())
    }

    fun CharToASCII(character: Char): Int {
        return character.toInt()
    }

    private fun printBinaryFormat(number: Int): String {
        var number = number
        var binaryNumber = "0"

        val binary = IntArray(25)
        var index = 0
        while (number > 0) {
            binary[index++] = number % 2
            number = number / 2
        }
        for (i in index - 1 downTo 0) {
            binaryNumber = binaryNumber + binary[i]

        }
        return binaryNumber
    }
}

private fun  CharSequence.charAt(j: Int) {

}
