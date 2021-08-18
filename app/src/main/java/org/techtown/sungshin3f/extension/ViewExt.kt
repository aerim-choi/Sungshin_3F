package org.techtown.sungshin3f.extension

import android.view.View
import androidx.annotation.Px
import org.techtown.sungshin3f.extension.dip

@Px
fun View.dip(dipValue: Float) = context.dip(dipValue)

fun View.toVisible() {
    visibility = View.VISIBLE
}

fun View.toGone() {
    visibility = View.GONE
}
