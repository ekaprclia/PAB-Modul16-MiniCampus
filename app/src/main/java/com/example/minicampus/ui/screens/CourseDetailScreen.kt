package com.example.minicampus.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.minicampus.model.Course

@Composable
fun CourseDetailScreen(
    course: Course?,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (course == null) {
            Text(text = "Course not found", style = MaterialTheme.typography.titleMedium)
        } else {
            Text(text = course.title, style = MaterialTheme.typography.headlineMedium)
            Text(text = course.description)
        }
        Button(onClick = onBack) {
            Text(text = "Back")
        }
    }
}
