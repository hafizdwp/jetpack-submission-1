package me.hafizdwp.jetpack_submission_1.ui.movie

import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.movie_fragment.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseFragment
import me.hafizdwp.jetpack_submission_1.ui.MainActivity

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MovieFragment : BaseFragment<MainActivity>() {

    companion object {
        fun newInstance() = MovieFragment()
    }

    override val layoutRes: Int
        get() = R.layout.movie_fragment

    var mAdapter: MovieAdapter? = null


    override fun onReady() {
        mAdapter = MovieAdapter(listOf("aku", "aku2"))
        recyclerView.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(mContext)
        }
    }
}
