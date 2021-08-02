package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class StatisticsUtilsTest {
    //Descriptive testing name: subjectUnderTest_actionOrInput_resultState
    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
        // Create an active task (the false makes this active)
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false)
        )
        // Call your function
        val result = getActiveAndCompletedStats(tasks)

        //Check the result: This uses JUnit asserts
//        assertEquals(result.completedTasksPercent, 0f)
//        assertEquals(result.activeTasksPercent, 100f)

        //Check the result: This uses Hamcrest asserts that is more human readable
        // than the commented out code above
        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }
}