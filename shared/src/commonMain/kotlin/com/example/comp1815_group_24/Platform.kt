package com.example.comp1815_group_24

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform