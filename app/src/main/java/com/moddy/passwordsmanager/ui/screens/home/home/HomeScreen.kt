package com.moddy.passwordsmanager.ui.screens.home.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.moddy.passwordsmanager.R

@Composable
fun HomeScreen() {
    Column {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(4.dp),
            label = {
                Text(text = stringResource(id = R.string.h_search))
            },
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}