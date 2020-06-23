package com.ptit.koinexample.test

class Student (private val course: SchoolCourse, private val friend: Friend) {

    fun beSmart() {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse() {
    fun study() {
        println("I am studying")
    }
}

class Friend() {
    fun hangout() {
        println("We're hanging out")
    }
}
