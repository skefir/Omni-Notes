package it.feio.android.omninotes.ui.kaspresso.screen

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import it.feio.android.omninotes.MainActivity
import it.feio.android.omninotes.R

import it.feio.android.omninotes.models.holders.NoteViewHolder


object MainScreen: KScreen<MainScreen>() {
    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val noteCreateButton = KButton { withId(R.id.fab_note) }




}