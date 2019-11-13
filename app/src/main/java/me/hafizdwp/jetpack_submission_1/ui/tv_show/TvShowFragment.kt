package me.hafizdwp.jetpack_submission_1.ui.tv_show

import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.tv_show_fragment.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseFragment
import me.hafizdwp.jetpack_submission_1.data.DummyData
import me.hafizdwp.jetpack_submission_1.data.model.TvShowModel
import me.hafizdwp.jetpack_submission_1.ui.MainActivity

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowFragment : BaseFragment<MainActivity>(), TvShowActionListener {

    companion object {
        fun newInstance() = TvShowFragment()
    }

    override val layoutRes: Int
        get() = R.layout.tv_show_fragment

    var mAdapter: TvShowAdapter? = null


    override fun onReady() {
        mAdapter = TvShowAdapter(
                items = DummyData.TvShows.getListTvShows(),
                listener = this@TvShowFragment)

        recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(mContext, 3)
        }
    }

    /**
     * TvShowActionListener implementation
     * ---------------------------------------------------------------------------------------------
     * */
    override fun onTvShowClick(data: TvShowModel) {

    }
}
