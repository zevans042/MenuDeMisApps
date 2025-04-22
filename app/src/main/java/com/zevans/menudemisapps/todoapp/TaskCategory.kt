package com.zevans.androidmaster.todoapp
import com.zevans.androidmaster.todoapp.TaskCategory


sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object Other : TaskCategory()
}