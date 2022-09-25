package com.yuryigonin.composetodonotesapp.ui.screens.task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.yuryigonin.composetodonotesapp.R
import com.yuryigonin.composetodonotesapp.components.PriorityDropDown
import com.yuryigonin.composetodonotesapp.data.models.Priority
import com.yuryigonin.composetodonotesapp.ui.theme.LARGE_PADDING
import com.yuryigonin.composetodonotesapp.ui.theme.MEDIUM_PADDING

@Composable
fun TaskContent(
    title: String,
    onTitleChanged: (String) -> Unit,
    description: String,
    onDescriptionChange: (String) -> Unit,
    priority: Priority,
    onPrioritySelected: (Priority) -> Unit
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
        .padding(all = LARGE_PADDING)

    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = title, 
            onValueChange = { onTitleChanged(it) },
            label = { Text(text = stringResource(id = R.string.title)) },
            textStyle = MaterialTheme.typography.body1,
            singleLine = true
        )
        Spacer(
            modifier = Modifier.height(MEDIUM_PADDING))
        PriorityDropDown(
            priority = priority,
            onPrioritySelected = onPrioritySelected
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = description,
            onValueChange = { onDescriptionChange(it) },
            label = { Text(text = stringResource(id = R.string.description)) },
            textStyle = MaterialTheme.typography.body1
        )
    }
}

@Composable
@Preview
fun TaskContentPreview() {

}
