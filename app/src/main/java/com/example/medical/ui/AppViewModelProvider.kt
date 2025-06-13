package com.example.medical.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.medical.MedicalApplication
import com.example.medical.ui.home.HomeViewModel
import com.example.medical.ui.item.ItemDetailsViewModel
import com.example.medical.ui.item.ItemEditViewModel
import com.example.medical.ui.item.ItemEntryViewModel

/**
 * Provides Factory to create instance of ViewModel for the entire Inventory app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for ItemEditViewModel
        initializer {
            ItemEditViewModel(
                this.createSavedStateHandle(),
                medicalApplication().container.itemsRepository
            )
        }
        // Initializer for ItemEntryViewModel
        initializer {
            ItemEntryViewModel(medicalApplication().container.itemsRepository)
        }

        // Initializer for ItemDetailsViewModel
        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle(),
                medicalApplication().container.itemsRepository
            )
        }

        // Initializer for HomeViewModel
        initializer {
            HomeViewModel(medicalApplication().container.itemsRepository)
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [MedicalApplication].
 */
fun CreationExtras.medicalApplication(): MedicalApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as MedicalApplication)