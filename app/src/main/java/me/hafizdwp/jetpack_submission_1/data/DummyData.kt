package me.hafizdwp.jetpack_submission_1.data

import me.hafizdwp.jetpack_submission_1.MyApp
import me.hafizdwp.jetpack_submission_1.R
import me.hafizdwp.jetpack_submission_1.data.model.MovieModel
import me.hafizdwp.jetpack_submission_1.data.model.TvShowModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
object DummyData {

    private val resources = MyApp.getContext().resources

    object Movies {

        private fun getListTitle() = resources.getStringArray(R.array.list_title_movies).toList()
        private fun getListShortDesc() = resources.getStringArray(R.array.list_shortdesc_movies).toList()
        private fun getListDesc() = resources.getStringArray(R.array.list_desc_movies).toList()
        private fun getListRating() = resources.getStringArray(R.array.list_rating_movies).toList()

        private fun getListPhoto() = listOf(
                R.drawable.poster_avengerinfinity,
                R.drawable.poster_spiderman,
                R.drawable.poster_venom,
                R.drawable.poster_bohemian,
                R.drawable.poster_robinhood,
                R.drawable.poster_bumblebee,
                R.drawable.poster_aquaman,
                R.drawable.poster_a_star,
                R.drawable.poster_mortalengine,
                R.drawable.poster_deadpool
        )

        fun getListMovies(): List<MovieModel> {
            val list = arrayListOf<MovieModel>()

            val title = getListTitle()
            val shortDesc = getListShortDesc()
            val desc = getListDesc()
            val listRating = getListRating()

            getListPhoto().forEachIndexed { index, photoResource ->
                list.add(MovieModel(
                        title = title[index],
                        shortDesc = shortDesc[index],
                        desc = desc[index],
                        rating = listRating[index],
                        photoResource = photoResource))
            }

            return list
        }
    }

    object TvShows {

        private fun getListTitle() = resources.getStringArray(R.array.list_title_tvshow).toList()
        private fun getListShortDesc() = resources.getStringArray(R.array.list_shortdesc_tvshow).toList()
        private fun getListDesc() = resources.getStringArray(R.array.list_desc_tvshow).toList()
        private fun getListRating() = resources.getStringArray(R.array.list_rating_tvshow).toList()

        private fun getListPhoto() = listOf(
                R.drawable.poster_flash,
                R.drawable.poster_arrow,
                R.drawable.poster_grey_anatomy,
                R.drawable.poster_dragon_ball,
                R.drawable.poster_gotham,
                R.drawable.poster_naruto_shipudden,
                R.drawable.poster_family_guy,
                R.drawable.poster_doom_patrol,
                R.drawable.poster_the_simpson,
                R.drawable.poster_the_walking_dead
        )

        fun getListTvShows(): List<TvShowModel> {
            val list = arrayListOf<TvShowModel>()

            val title = getListTitle()
            val shortDesc = getListShortDesc()
            val desc = getListDesc()
            val listRating = getListRating()

            getListPhoto().forEachIndexed { index, photoResource ->
                list.add(TvShowModel(
                        title = title[index],
                        shortDesc = shortDesc[index],
                        desc = desc[index],
                        rating = listRating[index],
                        photoResource = photoResource))
            }

            return list
        }
    }
}