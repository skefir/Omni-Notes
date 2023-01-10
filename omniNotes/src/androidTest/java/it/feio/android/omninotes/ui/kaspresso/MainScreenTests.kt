package it.feio.android.omninotes.ui.kaspresso

import androidx.compose.ui.test.isNotEnabled
import it.feio.android.omninotes.ui.kaspresso.screen.MainScreen
import org.junit.Test

class MainScreenTests: BaseTest() {

    @Test
    fun givenSuccessfulRegisterWithManGenderWhenHomeScreenIsDisplayedThenManTabIsSelected() {
        run {
            step("Navigate to account page") {
                MainScreen {
                    noteCreateButton.isDisabled()
                }
            }
        }
    }

}