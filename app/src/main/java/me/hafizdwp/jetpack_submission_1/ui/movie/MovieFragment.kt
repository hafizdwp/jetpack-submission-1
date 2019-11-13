package me.hafizdwp.jetpack_submission_1.ui.movie

import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.movie_fragment.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseFragment
import me.hafizdwp.jetpack_submission_1.data.DummyData
import me.hafizdwp.jetpack_submission_1.data.model.MovieModel
import me.hafizdwp.jetpack_submission_1.ui.MainActivity

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MovieFragment : BaseFragment<MainActivity>(), MovieActionListener {

    companion object {
        fun newInstance() = MovieFragment()
    }

    override val layoutRes: Int
        get() = R.layout.movie_fragment

    var mAdapter: MovieAdapter? = null


    override fun onReady() {
        mAdapter = MovieAdapter(
            items = DummyData.Movies.getListMovies(),
            listener = this@MovieFragment
        )
        recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(mContext, 6).apply {
                spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                    override fun getSpanSize(position: Int): Int {
                        return when (position) {
                            0, 1, 2 -> 2
                            3, 4 -> 3
                            else -> 2
                        }
                    }
                }
            }
        }
    }

    /**
     * MovieActionListener implementations
     * ---------------------------------------------------------------------------------------------
     * */
    override fun onMovieClick(data: MovieModel) {

    }
}
