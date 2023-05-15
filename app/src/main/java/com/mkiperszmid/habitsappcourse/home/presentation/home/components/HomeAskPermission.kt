package com.mkiperszmid.habitsappcourse.home.presentation.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.permissions.*
import com.mkiperszmid.habitsappcourse.core.presentation.HabitButton

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun HomeAskPermission(
    permission: String,
    modifier: Modifier = Modifier
) {
    var showDialog by remember {
        mutableStateOf(false)
    }

    var showErrorDialog by remember {
        mutableStateOf(false)
    }

    val permissionState =
        rememberPermissionState(permission = permission)
    LaunchedEffect(key1 = Unit) {
        permissionState.launchPermissionRequest()
    }

    if (permissionState.status.shouldShowRationale) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            modifier = modifier,
            confirmButton = {
                HabitButton(text = "Accept", modifier = Modifier.fillMaxWidth()) {
                    showDialog = false
                    permissionState.launchPermissionRequest()
                }
            },
            title = {
                Text(text = "Permission Required")
            },
            text = {
                Text(text = "We need this permission for the app to work correctly")
            }
        )
    } else if (showErrorDialog) {
        AlertDialog(
            onDismissRequest = { showErrorDialog = false },
            modifier = modifier,
            confirmButton = {
                HabitButton(text = "I Understand", modifier = Modifier.fillMaxWidth()) {
                    permissionState.launchPermissionRequest()
                }
            },
            title = {
                Text(text = "Warning")
            },
            text = {
                Text(text = "The application won't work correctly since the permission was disabled")
            }
        )
    }
}
