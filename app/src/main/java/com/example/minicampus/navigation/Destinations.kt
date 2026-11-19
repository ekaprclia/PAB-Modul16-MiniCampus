package com.example.minicampus.navigation

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Courses

@Serializable
object Profile

@Serializable
data class CourseDetail(val courseId: Int)
