package com.salsa.affirmations

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
// Digunakan untuk berinstrumen yang akan dijalankan pada perangkat Android.
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Digunakan untuk Konteks aplikasi yang sedang diuji.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.salsa.affirmations", appContext.packageName)
    }
}