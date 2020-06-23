package com.ptit.koinexample.test

import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {

    single { SchoolCourse() }

    factory { Friend() }

    factory { Student(get(), get()) }
}
