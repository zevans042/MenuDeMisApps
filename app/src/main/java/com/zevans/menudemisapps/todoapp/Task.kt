package com.zevans.androidmaster.todoapp

import com.zevans.menudemisapps.todoapp.TaskCategory

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)