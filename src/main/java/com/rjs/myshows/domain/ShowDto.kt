package com.rjs.myshows.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDate

@JsonIgnoreProperties(ignoreUnknown = true)
class ShowDto: Show, BaseDto() {
	override var mdbId = ""
	override var imdbId: String? = null
	override var title = ""
	override var showRating = ""
	override var contentsArray: Array<String> = emptyArray()
	override var tagline = ""
	override var description = ""
	override var releaseDate: LocalDate? = null
	override var releaseDateText = ""
	override var runtime = 0
	override var showType = ""
	override var genres: MutableSet<String> = mutableSetOf()
	override var mediaFormat = ""
	override var myNotes = ""
	override var starRating = 0
}