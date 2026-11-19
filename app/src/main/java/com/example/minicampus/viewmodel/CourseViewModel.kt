package com.example.minicampus.viewmodel

import androidx.lifecycle.ViewModel
import com.example.minicampus.model.Course
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CourseViewModel : ViewModel() {
    private val _courses = MutableStateFlow(
        listOf(
            Course(1, "Mobile App Development", "Learning Android with Jetpack Compose."),
            Course(2, "Data Science", "Introduction to data analysis.")
        )
    )
    val courses: StateFlow<List<Course>> = _courses.asStateFlow()

    fun getCourseById(id: Int): Course? =
        courses.value.find { it.id == id }
}
