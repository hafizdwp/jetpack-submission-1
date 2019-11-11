package me.hafizdwp.jetpack_submission_1.ui.tv_show

import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.tv_show_fragment.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseFragment
import me.hafizdwp.jetpack_submission_1.ui.MainActivity
import me.hafizdwp.jetpack_submission_1.ui.movie.MovieAdapter

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowFragment : BaseFragment<MainActivity>() {

    companion object {
        fun newInstance() = TvShowFragment()
    }

    override val layoutRes: Int
        get() = R.layout.tv_show_fragment

    var mAdapter: MovieAdapter? = null


    override fun onReady() {
        mAdapter = MovieAdapter(listOf("aku", "aku2"))
        recyclerView.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(mContext)
        }
    }
}
