package me.hafizdwp.jetpack_submission_1.ui.movie

import me.hafizdwp.jetpack_submission_1.base.BaseViewModel
import me.hafizdwp.jetpack_submission_1.data.DummyData

/**
 * @author hafizdwp
 * 13/11/2019
 **/
class MovieViewModel : BaseViewModel() {

    fun getListMovie() = DummyData.Movies.getListMovies()
}