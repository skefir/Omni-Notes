package it.feio.android.omninotes.ui.kaspresso

import it.feio.android.omninotes.ui.kaspresso.screen.MainScreen
import org.junit.Test

class MainScreenTests: BaseTest() {

    @Test
    fun givenSuccessfulRegisterWithManGenderWhenHomeScreenIsDisplayedThenManTabIsSelected() {
        run {
            step("Navigate to account page") {
                MainScreen {

                }
            }
        }

}