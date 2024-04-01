package org.d3if3009.catatanharian.navigation

import org.d3if3009.catatanharian.ui.screen.KEY_ID_CATATAN

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object HitungLuasKeliling: Screen("hitungluaskelilingScreen")
    data object About: Screen("aboutScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_CATATAN}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}