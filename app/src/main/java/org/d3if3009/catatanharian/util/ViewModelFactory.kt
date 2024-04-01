package org.d3if3009.catatanharian.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if3009.catatanharian.database.CatatanDao
import org.d3if3009.catatanharian.ui.screen.DetailViewModel
import org.d3if3009.catatanharian.ui.screen.MainViewModel

class ViewModelFactory(private val dao: CatatanDao) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}