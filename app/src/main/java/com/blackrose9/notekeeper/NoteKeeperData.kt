package com.blackrose9.notekeeper

class CourseInfo(val courseId: String, val courseTitle: String)

class NoteInfo(var course: CourseInfo, var title: String, var text: String)