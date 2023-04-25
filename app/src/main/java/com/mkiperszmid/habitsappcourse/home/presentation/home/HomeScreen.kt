package com.mkiperszmid.habitsappcourse.home.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mkiperszmid.habitsappcourse.R
import com.mkiperszmid.habitsappcourse.home.presentation.home.components.HomeDateSelector
import com.mkiperszmid.habitsappcourse.home.presentation.home.components.HomeQuote

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        CenterAlignedTopAppBar(title = {
            Text(text = "Home")
        }, navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings")
                }
            })
    }) {
        Column(
            modifier = Modifier.padding(it).padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(19.dp)
        ) {
            HomeQuote(
                quote = "We first make our habits, and then our habits make us.",
                author = "Anonymous",
                imageId = R.drawable.onboarding1
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Habits".uppercase(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.tertiary
                )
                Spacer(modifier = Modifier.width(16.dp))
                HomeDateSelector(
                    selectedDate = state.selectedDate,
                    mainDate = state.currentDate,
                    onDateClick = {
                        viewModel.onEvent(HomeEvent.ChangeDate(it))
                    }
                )
            }
            Text(text = "Listado de Habitos")
        }
    }
}
