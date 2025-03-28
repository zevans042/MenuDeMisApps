package com.zevans.menudemisapps.todoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.androidmaster.todoapp.TasksAdapter
import com.zevans.androidmaster.todoapp.Task
import com.zevans.menudemisapps.R

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Other
    )

    private val tasks = mutableListOf(
        Task("Business",TaskCategory.Business)
        Task("", TaskCategory.Business)
        Task("Business", TaskCategory.Business)

    )







     private lateinit var rvCategories: RecyclerView
     private lateinit var categoriesAdapter: CategoriesAdapter

     private lateinit var rvTasks:RecyclerView
     private lateinit var tasksAdapter: TasksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_todo)
         initComponent()
         initUI()

    }

    private fun initComponent() {
     rvCategories = findViewById(R.id.rvCategories)
     rvTasks = findViewById(R.id.rvTasks)
    }

    private fun initUI() {
     categoriesAdapter = CategoriesAdapter(categories)
     rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
     rvCategories.adapter = categoriesAdapter
     tasksAdapter = TasksAdapter()

    }
}