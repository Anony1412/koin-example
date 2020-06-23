package com.ptit.koinexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ptit.koinexample.test.Friend
import com.ptit.koinexample.test.SchoolCourse
import com.ptit.koinexample.test.Student
import com.ptit.koinexample.test1.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val myViewModel: MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        withoutKoin()

        withKoin()
    }

    private fun test1() {
        textHello.text = myViewModel.sayHello()
    }

    private fun withKoin() {
        val student: Student = get()
        student.beSmart()
    }

    private fun withoutKoin() {
        val course = SchoolCourse()
        val friend = Friend()
        val student = Student(course, friend)
        student.beSmart()
    }
}
