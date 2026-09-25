package com.example.jetpackcomposelearning.ui.grid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposelearning.model.ModuleItem
import com.example.jetpackcomposelearning.modules.hello.HelloScreen
import com.example.jetpackcomposelearning.modules.helloworld.HelloWorldScreen
import com.example.jetpackcomposelearning.navigation.NavRoutes
import com.example.jetpackcomposelearning.ui.grid.components.GridModuleCard

val sampleModules = listOf(
    ModuleItem(
        id = "hello",
        title = "Hello Screen",
        description = "Go to Hello Screen",
        icon = Icons.Default.Face,
        route = NavRoutes.HELLO
    ),
    ModuleItem(
        id = "hello_world",
        title = "Hello World",
        description = "Go to Hello World",
        icon = Icons.Default.Star,
        route = NavRoutes.HELLO_WORLD
    )
)

@Composable
fun GridViewScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.GRID_VIEW
    ) {
        composable(NavRoutes.GRID_VIEW) {
            GridViewContent(
                modules = sampleModules,
                onModuleClick = { route ->
                    navController.navigate(route)
                }
            )
        }
        composable(NavRoutes.HELLO) {
            HelloScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(NavRoutes.HELLO_WORLD) {
            HelloWorldScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun GridViewContent(
    modules: List<ModuleItem>,
    onModuleClick: (String) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Modules Dashboard") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(modules, key = { it.id }) { module ->
                GridModuleCard(
                    module = module,
                    onClick = { onModuleClick(module.route) }
                )
            }
        }
    }
}
