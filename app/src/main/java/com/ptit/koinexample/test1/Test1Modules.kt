package com.ptit.koinexample.test1

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val test1Module = module {

    single<HelloRepository>{ HelloRepositoryImpl() }

    viewModel { MyViewModel(get()) }
}
