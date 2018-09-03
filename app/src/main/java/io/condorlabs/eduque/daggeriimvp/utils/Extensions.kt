package io.condorlabs.eduque.daggeriimvp.utils

import android.text.Editable

fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)