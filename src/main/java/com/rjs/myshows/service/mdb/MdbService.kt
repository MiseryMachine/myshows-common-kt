package com.rjs.myshows.service.mdb

import com.rjs.myshows.domain.Show
import com.rjs.myshows.domain.mdb.MdbShow

interface MdbService<out S: Show> {
	fun searchShows(showTypeName: String, title: String): MutableList<MdbShow>
	fun addShow(showTypeName: String, mdbId: String): S?
	fun getGenres(showTypeName: String): MutableSet<String>
}