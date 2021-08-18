package org.techtown.sungshin3f.extension

import java.text.DecimalFormat

fun Float.toDecimalFormatString(format: String): String = DecimalFormat(format).format(this)
