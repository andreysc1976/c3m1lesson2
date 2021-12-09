package ru.a_party.c3m1lesson2

import android.app.Application
import com.github.terrakok.cicerone.Cicerone

class MyApp: Application() {

    companion object Navigation {

        private val cicerone: Cicerone<CustomRouter> by lazy {
            Cicerone.create(CustomRouter())
        }
        val navigatorHolder = cicerone.getNavigatorHolder()
        val router = cicerone.router
    }
}