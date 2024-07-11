package com.tiny.habit_tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform