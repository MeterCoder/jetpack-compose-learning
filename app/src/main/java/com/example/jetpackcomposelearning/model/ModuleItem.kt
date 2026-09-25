package com.example.jetpackcomposelearning.model

import androidx.compose.ui.graphics.vector.ImageVector

data class ModuleItem(
    val id: String,
    val title: String,
    val description: String,
    val icon: ImageVector,
    val route: String
)
