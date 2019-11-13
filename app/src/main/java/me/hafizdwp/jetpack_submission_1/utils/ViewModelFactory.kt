package me.hafizdwp.jetpack_submission_1.utils

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import me.hafizdwp.jetpack_submission_1.ui.movie.MovieViewModel
import me.hafizdwp.jetpack_submission_1.ui.tv_show.TvShowViewModel

/**
 * @author hafizdwp
 * 10/07/19
 **/
class ViewModelFactory private constructor() : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>) =
            with(modelClass) {
                when {

                    isAssignableFrom(MovieViewModel::class.java) ->
                        MovieViewModel()
                    isAssignableFrom(TvShowViewModel::class.java) ->
                        TvShowViewModel()

                    else ->
                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            } as T

    companion object {

        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        @JvmStatic
        fun getInstance() =
                INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                    INSTANCE ?: ViewModelFactory()
                            .also { INSTANCE = it }
                }
    }
}