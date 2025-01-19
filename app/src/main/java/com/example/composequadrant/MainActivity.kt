package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrant(
                        q11 = stringResource(R.string.text_composable_title),
                        q12 = stringResource(R.string.text_composable_description),
                        q21 = stringResource(R.string.image_composable_title),
                        q22 = stringResource(R.string.image_composable_description),
                        q31 = stringResource(R.string.row_composable_title),
                        q32 = stringResource(R.string.row_composable_description),
                        q41 = stringResource(R.string.column_composable_title),
                        q42 = stringResource(R.string.column_composable_description),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(

        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = description,
            textAlign = TextAlign.Justify)
    }
}

@Composable
fun ComposeQuadrant(q11: String, q12: String, q21: String, q22: String, q31: String, q32: String, q41: String, q42: String, modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxWidth()) {
        Row(modifier = modifier.weight(1f)) {
            ComposeCard(
                title = q11,
                description = q12,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f))
            ComposeCard(
                title = q21,
                description = q22,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = modifier.weight(1f)) {
            ComposeCard(
                title = q31,
                description = q32,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposeCard(
                title = q41,
                description = q42,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant(
            q11 = stringResource(R.string.text_composable_title),
            q12 = stringResource(R.string.text_composable_description),
            q21 = stringResource(R.string.image_composable_title),
            q22 = stringResource(R.string.image_composable_description),
            q31 = stringResource(R.string.row_composable_title),
            q32 = stringResource(R.string.row_composable_description),
            q41 = stringResource(R.string.column_composable_title),
            q42 = stringResource(R.string.column_composable_description)
        )
    }
}