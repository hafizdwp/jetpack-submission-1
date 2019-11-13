package me.hafizdwp.jetpack_submission_1.ui.tv_show

import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.tv_show_fragment.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseFragment
import me.hafizdwp.jetpack_submission_1.data.DummyData
import me.hafizdwp.jetpack_submission_1.data.model.TvShowModel
import me.hafizdwp.jetpack_submission_1.ui.MainActivity
import me.hafizdwp.jetpack_submission_1.ui.detail.DetailActivity
import me.hafizdwp.jetpack_submission_1.utils.obtainViewModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowFragment : BaseFragment<MainActivity, TvShowViewModel>(), TvShowActionListener {

    companion object {
        fun newInstance() = TvShowFragment()
    }

    override val layoutRes: Int
        get() = R.layout.tv_show_fragment
    override val mViewModel: TvShowViewModel
        get() = obtainViewModel()

    var mAdapter: TvShowAdapter? = null


    override fun onReady() {

        val listTvShows = mViewModel.getListTvShows()

        mAdapter = TvShowAdapter(
                items = listTvShows,
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
        DetailActivity.startActivity(
                context = mContext,
                tvShowModel = data)
    }
}
