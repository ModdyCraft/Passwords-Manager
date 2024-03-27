package com.moddy.passwordsmanager.ui.screens.auth.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.moddy.passwordsmanager.R
import com.moddy.passwordsmanager.ui.theme.StylesAndShapes

@Composable
fun LoginScreen() {

    val textEmail = remember { mutableStateOf("") }
    val textPassword = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textEmail.value,
            onValueChange = { newValue ->
                textEmail.value = newValue
            },
            modifier = Modifier.fillMaxWidth(),
            shape = StylesAndShapes.Shapes.Rounded8,
            placeholder = {
                Text(stringResource(id = R.string.a_email))
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = textPassword.value,
            onValueChange = { newValue ->
                textPassword.value = newValue
            },
            modifier = Modifier.fillMaxWidth(),
            shape = StylesAndShapes.Shapes.Rounded8,
            placeholder = {
                Text(stringResource(id = R.string.a_password))
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(id = R.string.ls_forgot_your_password),
            modifier = Modifier
                .align(Alignment.Start)
                .clickable { },
            style = StylesAndShapes.Styles.TextLink
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ },
            shape = StylesAndShapes.Shapes.Rounded8
        ) {
            Text(
                text = stringResource(id = R.string.ls_login),
                style = StylesAndShapes.Styles.BtFont
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = stringResource(id = R.string.ls_you_are_new),
            modifier = Modifier
                .clickable { },
            style = StylesAndShapes.Styles.TextLink
        )
    }
}