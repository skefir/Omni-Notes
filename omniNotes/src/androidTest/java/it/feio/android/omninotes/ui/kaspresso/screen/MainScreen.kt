package it.feio.android.omninotes.ui.kaspresso.screen

import com.kaspersky.kaspresso.screens.KScreen
import it.feio.android.omninotes.R

import it.feio.android.omninotes.models.holders.NoteViewHolder


class MainScreen: KScreen<MainScreen>() {
    override val layoutId: Int? = R.id.content
    override val viewClass: Class<*>? = NoteViewHolder::class.java




}