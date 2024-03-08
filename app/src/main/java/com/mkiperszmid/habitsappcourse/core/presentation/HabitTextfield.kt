package com.mkiperszmid.habitsappcourse.core.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HabitPasswordTextfield(
    value: String,
    onValueChange: (String) -> Unit,
    contentDescription: String,
    modifier: Modifier = Modifier,
    placeholder: String = "Password",
    errorMessage: String? = null,
    leadingIcon: ImageVector? = Icons.Outlined.Lock,
    isEnabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions(),
    backgroundColor: Color = MaterialTheme.colorScheme.background
) {
    HabitTextfield(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        modifier = modifier,
        errorMessage = errorMessage,
        leadingIcon = leadingIcon,
        isPassword = true,
        isEnabled = isEnabled,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        backgroundColor = backgroundColor,
        contentDescription = contentDescription
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HabitTextfield(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    contentDescription: String,
    modifier: Modifier = Modifier,
    errorMessage: String? = null,
    leadingIcon: ImageVector? = null,
    isPassword: Boolean = false,
    isEnabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions(),
    backgroundColor: Color = MaterialTheme.colorScheme.background
) {
    var hidePassword by remember {
        mutableStateOf(true)
    }
    Column(modifier = modifier) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .semantics { this.contentDescription = contentDescription },
            leadingIcon = if (leadingIcon == null) null else {
                {
                    Icon(
                        imageVector = leadingIcon,
                        contentDescription = null
                    )
                }
            },
            enabled = isEnabled,
            isError = errorMessage != null,
            trailingIcon = {
                if (isPassword) {
                    TextButton(
                        onClick = { hidePassword = !hidePassword },
                        enabled = isEnabled
                    ) {
                        Text(
                            text = if (hidePassword) "Show" else "Hide",
                            color = MaterialTheme.colorScheme.tertiary,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
            },
            placeholder = { Text(text = placeholder) },
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = MaterialTheme.colorScheme.primary,
                unfocusedTextColor = MaterialTheme.colorScheme.primary,
                focusedContainerColor = backgroundColor,
                unfocusedContainerColor = backgroundColor,
                focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                unfocusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                unfocusedPlaceholderColor = MaterialTheme.colorScheme.tertiary.copy(
                    alpha = 0.5f
                ),
                focusedPlaceholderColor = MaterialTheme.colorScheme.tertiary.copy(
                    alpha = 0.5f
                ),
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent

            ),
            visualTransformation = if (isPassword && hidePassword) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions
        )
        if (errorMessage != null) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = errorMessage, color = MaterialTheme.colorScheme.error)
        }
    }
}

@Preview
@Composable
fun HabitTextfieldPreview() {
    HabitTextfield(
        value = "",
        onValueChange = {},
        leadingIcon = Icons.Outlined.Lock,
        placeholder = "Password",
        isPassword = true,
        contentDescription = ""
    )
}

@Preview
@Composable
fun HabitTextfieldErrorPreview() {
    HabitTextfield(
        value = "",
        onValueChange = {},
        leadingIcon = Icons.Outlined.Lock,
        placeholder = "Password",
        isPassword = true,
        errorMessage = "Invalid Password",
        contentDescription = ""
    )
}
