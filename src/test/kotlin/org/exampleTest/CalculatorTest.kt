package org.exampleTest

import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    // Membuat instance (objek) dari kelas Calculator untuk digunakan dalam pengujian
    val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        // Nilai yang diharapkan (expected) setelah menjalankan metode add(40, 2) adalah 42
        val result = 42
        // Memanggil metode add(40, 2) dari kelas Calculator dan membandingkannya dengan nilai result
        // Jika hasilnya sama dengan result, maka pengujian akan berhasil
        // setelah saya beberapa kali coba ternyata commit yang sebelumnya hanya menguji fungsi add
        // oleh sebab itu saya menambahkan assert equals agar ketika fungsi add tidak menjumlahkan sesuai dengan result
        // akan mengalami eror ketika yang dijumlahkan pada fungsi add benar maka tidak akan terjadi eror
        assertEquals(result, calculator.add(40, 2))
    }
}