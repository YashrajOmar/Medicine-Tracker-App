package com.example.medical.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.medical.AuthViewModel
import com.example.medical.LoginDestination
import com.example.medical.LoginPage
import com.example.medical.SignupDestination
import com.example.medical.SignupPage
import com.example.medical.ui.home.HomeDestination
import com.example.medical.ui.home.HomeScreen
import com.example.medical.ui.item.ItemDetailsDestination
import com.example.medical.ui.item.ItemDetailsScreen
import com.example.medical.ui.item.ItemEditDestination
import com.example.medical.ui.item.ItemEditScreen
import com.example.medical.ui.item.ItemEntryDestination
import com.example.medical.ui.item.ItemEntryScreen

/**
 * Provides Navigation graph for the application.
 */
@Composable
fun MedicalNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        //startDestination = HomeDestination.route,
        startDestination = LoginDestination.route,
        modifier = modifier
    ) {
        composable(LoginDestination.route) {
            LoginPage(modifier,navController,
                authViewModel = AuthViewModel(),
                navigateToSignup = { navController.navigate(SignupDestination.route) })
        }
        composable(SignupDestination.route) {
            SignupPage(modifier,navController, authViewModel = AuthViewModel())
        }


        composable(route = HomeDestination.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(ItemEntryDestination.route) },
                navigateToItemUpdate = {
                    navController.navigate("${ItemDetailsDestination.route}/${it}")
                },
                authViewModel = AuthViewModel()
            )
        }
        composable(route = ItemEntryDestination.route) {
            ItemEntryScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() }
            )
        }
        composable(
            route = ItemDetailsDestination.routeWithArgs,
            arguments = listOf(navArgument(ItemDetailsDestination.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            ItemDetailsScreen(
                //navigateToEditItem = { navController.navigate("${ItemEditDestination.route}/$it") },
                navigateBack = { navController.navigateUp() }
            )
        }
        composable(
            route = ItemEditDestination.routeWithArgs,
            arguments = listOf(navArgument(ItemEditDestination.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            ItemEditScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() }
            )
        }
    }
}