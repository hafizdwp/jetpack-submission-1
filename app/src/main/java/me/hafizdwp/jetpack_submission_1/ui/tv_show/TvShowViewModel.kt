package me.hafizdwp.jetpack_submission_1.ui.tv_show

import me.hafizdwp.jetpack_submission_1.base.BaseViewModel
import me.hafizdwp.jetpack_submission_1.data.DummyData

/**
 * @author hafizdwp
 * 13/11/2019
 **/
class TvShowViewModel : BaseViewModel() {

    fun getListTvShows() = DummyData.TvShows.getListTvShows()
}