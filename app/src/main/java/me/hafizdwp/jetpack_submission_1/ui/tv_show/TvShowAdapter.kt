package me.hafizdwp.jetpack_submission_1.ui.tv_show

import android.view.View
import kotlinx.android.synthetic.main.movie_item.view.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseRecyclerAdapter

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowAdapter(val items: List<String>) : BaseRecyclerAdapter<String>() {

    override val itemLayoutRes: Int
        get() = R.layout.tv_show_item
    override val mListItem: List<String>
        get() = items

    override fun onBind(itemView: View, model: String) {
        itemView.apply {
            tes.text = model
        }
    }
}