package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel



@Composable



fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
    val tasks = viewModel.task.value

    Column {
        // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn
        tasks.forEach {
                tasks -> val navController = null
        TaskRow(
                task = tasks,
                viewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
                navController = NavController
            )
            
        }
        
    }
}

@Composable


fun TaskRow(task: Task, navController: NavController.Companion, viewModel: Any) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title
            NavController.equals("taskDetail/${task.title}")
        Checkbox(
            checked = task.isCompleted,
            onCheckedChange = { TaskViewModel.toggleTask(task.id) }
        )

}
    )
}

// toggleTask hata verdiği için böyle bir ekleme önerdi ide hocam. TaskViewModel den çekmesi gerekiyor ama bir türlü yapamadım
fun TaskViewModel.Companion.toggleTask(id: Int) {}

