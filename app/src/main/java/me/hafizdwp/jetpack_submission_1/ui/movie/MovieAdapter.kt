package me.hafizdwp.jetpack_submission_1.ui.movie

import android.view.View
import kotlinx.android.synthetic.main.movie_item.view.*
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.base.BaseRecyclerAdapter

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MovieAdapter(val items: List<String>) : BaseRecyclerAdapter<String>() {

    override val itemLayoutRes: Int
        get() = R.layout.movie_item
    override val mListItem: List<String>
        get() = items

    override fun onBind(itemView: View, model: String) {
        itemView.apply {
            tes.text = model
        }
    }
}