package me.hafizdwp.jetpack_submission_1.utils

import android.content.res.Resources

/**
 * @author hafizdwp
 * 13/11/2019
 **/

val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()