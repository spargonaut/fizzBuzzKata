package org.spargonaut

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KizzKuzzTest {

    @Test
    fun `should have a working test environment`() {
        assertThat(true, `is`(true))
    }

//    @Test
//    fun `should generate a list of increasing numbers`() {
//
//        val kizzKuzzer = KizzKuzzer()
//
//        val kizzKuzzSeries = kizzKuzzer.generateTo(10)
//
//        assertThat(kizzKuzzSeries.get(0), `is`("1"))
//        assertThat(kizzKuzzSeries.get(1), `is`("2"))
//
//        assertThat(kizzKuzzSeries.get(3), `is`("4"))
//
//        assertThat(kizzKuzzSeries.get(6), `is`("7"))
//        assertThat(kizzKuzzSeries.get(7), `is`("8"))
//    }
//
//    @Test
//    fun `should make all numbers divisible by 3 be kizz`() {
//        val kizzKuzzer = KizzKuzzer()
//
//        val kizzKuzzSeries = kizzKuzzer.generateTo(20)
//
//        assertThat(kizzKuzzSeries.get(2), `is`("kizz"))
//        assertThat(kizzKuzzSeries.get(5), `is`("kizz"))
//        assertThat(kizzKuzzSeries.get(8), `is`("kizz"))
//        assertThat(kizzKuzzSeries.get(11), `is`("kizz"))
//    }
//
//    @Test
//    fun `should make all numbers divisible by 5 be kuzz`() {
//        val kizzKuzzer = KizzKuzzer()
//
//        val kizzKuzzSeries = kizzKuzzer.generateTo(20)
//
//        assertThat(kizzKuzzSeries.get(4), `is`("kuzz"))
//        assertThat(kizzKuzzSeries.get(9), `is`("kuzz"))
//    }
//
//    @Test
//    fun `should make all numbers divisible by 15 be kizzkuzz`() {
//
//        val kizzKuzzer = KizzKuzzer()
//
//        val kizzKuzzSeries = kizzKuzzer.generateTo(30)
//
//        assertThat(kizzKuzzSeries[14], `is`("kizzkuzz"))
//        assertThat(kizzKuzzSeries[29], `is`("kizzkuzz"))
//    }
}