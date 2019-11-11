package me.hafizdwp.jetpack_submission_1.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * @author hafizdwp
 * 11/11/2019
 **/
abstract class BaseActivity : AppCompatActivity() {

    @get:LayoutRes
    abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)

        onReady()
    }

    abstract fun onReady()
}