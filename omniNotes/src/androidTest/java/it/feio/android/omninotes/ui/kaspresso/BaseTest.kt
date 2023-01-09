package it.feio.android.omninotes.ui.kaspresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import it.feio.android.omninotes.MainActivity
import org.junit.Rule


abstract class BaseTest: TestCase(Kaspresso.Builder.simple()) {
//    @get:Rule
//    val taskExecutorWithIdlingResourceRule = TaskExecutorWithIdlingResourceRule()

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)
}