package me.hafizdwp.jetpack_submission_1.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author hafizdwp
 * 11/11/2019
 **/
@Parcelize
class TvShowModel (
        var title: String,
        var shortDesc: String,
        var desc: String,
        var rating: String,
        var photoResource: Int
) : Parcelable