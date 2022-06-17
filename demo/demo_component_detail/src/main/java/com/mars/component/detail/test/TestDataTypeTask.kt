package com.mars.component.detail.test

import android.content.Context
import com.mars.component.detail.value.TestNullableBean
import com.rubik.annotations.route.RResult
import com.rubik.annotations.route.RRoute

class TestDataTypeTask {
    @RRoute(path = "doTestDataType1", forResult = true)
    fun doTestDataType1(data: Context?): Context? {
        println(" AP DBG doTestDataType1 Context !!!")
        return data
    }

    @RRoute(path = "doTestDataType2", forResult = true)
    fun doTestDataType2(data: Int?): Int? {
        println(" AP DBG doTestDataType2 Int !!!")
        return data
    }

    @RRoute(path = "doTestDataType3", forResult = true)
    fun doTestDataType3(data: String?): String? {
        println(" AP DBG doTestDataType3 String !!!")
        return data
    }

    @RRoute(path = "doTestDataType4", forResult = true)
    fun doTestDataType4(data: TestNullableBean?): TestNullableBean? {
        println(" AP DBG doTestDataType4 A1Bean!!!")
        return data
    }

    @RRoute(path = "doTestDataType5", forResult = true)
    fun doTestDataType5(data: List<String>?): List<String>? {
        println(" AP DBG doTestDataType5 List<String>!!!")
        return data
    }

    @RRoute(path = "doTestDataType6", forResult = true)
    fun doTestDataType6(data: Array<Long>?): Array<Long>? {
        println(" AP DBG doTestDataType7 Array<Long> !!!")
        return data
    }

    @RRoute(path = "doTestDataType7", forResult = true)
    fun doTestDataType7(data: LongArray?): LongArray? {
        println(" AP DBG doTestDataType6 LongArray !!!")
        return data
    }

    @RRoute(path = "doTestDataType8", forResult = true)
    fun doTestDataType8(data: IntArray?): IntArray? {
        println(" AP DBG doTestDataType8 IntArray !!!")
        return data
    }

    @RRoute(path = "doTestDataType9", forResult = true)
    fun doTestDataType9(data: BooleanArray?): BooleanArray? {
        println(" AP DBG doTestDataType9 BooleanArray !!!")
        return data
    }

    @RRoute(path = "doTestDataType10")
    fun doTestDataType10(resultSuccess: (Int) -> Unit, resultSuccess2: (String) -> Unit) {
        println(" AP DBG HOF doTestDataType10 C1Bean HOF !!")
        resultSuccess.invoke(300)
        resultSuccess2.invoke("res-sus-10")
    }

    @RRoute(path = "doTestDataType11")
    fun doTestDataType11(
        @RResult resultSuccess: (Int, TestNullableBean) -> Unit,
        @RResult resultSuccess2: (TestNullableBean?) -> Unit
    ) {
        println(" AP DBG HOF doTestDataType11 C1Bean HOF !!")
        resultSuccess.invoke(400, TestNullableBean(null, "res-sus-11"))
        Thread().run {
            Thread.sleep(500)
            resultSuccess2.invoke(null)
        }
    }

    @RRoute(path = "doTestDataType13", forResult = true)
    fun doTestDataType13(data: List<Int?>): List<Int?> {
        println(" AP DBG doTestDataType13 List<Int?>!!!")
        return data
    }

    @RRoute(path = "doTestDataType14", forResult = true)
    fun doTestDataType14(data: ArrayList<Int?>): ArrayList<Int?> {
        println(" AP DBG doTestDataType14 ArrayList<Int?>!!!")
        return data
    }

    @RRoute(path = "doTestDataType15", forResult = true)
    fun doTestDataType15(data: List<TestNullableBean?>): List<TestNullableBean?> {
        println(" AP DBG doTestDataType15 List<C1Bean?>!!!")
        return data
    }

    @RRoute(path = "doTestDataType16", forResult = true)
    fun doTestDataType16(data: ArrayList<TestNullableBean?>): ArrayList<TestNullableBean?> {
        println(" AP DBG doTestDataType16 ArrayList<C1Bean?>!!!")
        return data
    }

    @RRoute(path = "doTestDataType17", forResult = true)
    fun doTestDataType17(data: List<String?>): List<String?> {
        println(" AP DBG doTestDataType17 List<String?>!!!")
        return data
    }

    @RRoute(path = "doTestDataType18", forResult = true)
    fun doTestDataType18(data: ArrayList<String?>): ArrayList<String?> {
        println(" AP DBG doTestDataType18 ArrayList<String?>!!!")
        return data
    }
}