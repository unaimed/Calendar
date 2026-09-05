package org.fossify.calendar.models

import android.util.Range

data class EventWeeklyView(
    val range: Range<Int>,
    var slot: Int = 0,
    var slotMax: Int = 0,
    var collisions: ArrayList<Long> = ArrayList(),
    // cascade layout only: how many earlier-starting events this one sits on,
    // and its lane among the events that start too close to cascade over
    var cascadeDepth: Int = 0,
    var lane: Int = 0,
    var laneCount: Int = 1,
    // minutes from this event's start until a later event is drawn over it
    var uncoveredMinutes: Int = Int.MAX_VALUE,
)
