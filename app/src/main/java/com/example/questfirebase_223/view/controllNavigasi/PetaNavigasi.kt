package com.example.questfirebase_223.view.controllNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questfirebase_223.view.EntrySiswaScreen
import com.example.questfirebase_223.view.HomeScreen
import com.example.questfirebase_223.view.route.DestinasiEntry
import com.example.questfirebase_223.view.route.DestinasiHome

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                navigateToItemUpdate = { /* no-op */ }
            )
        }

        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {
                navController.popBackStack() }
            )
        }
    }
}