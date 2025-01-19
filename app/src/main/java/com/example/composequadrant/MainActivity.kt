package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
fun ComposeQuadrant(q11: String, q12: String, q21: String, q22: String, q31: String, q32: String, q41: String, q42: String, modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(0.5f)) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .weight(0.5f)
                    .fillMaxHeight()
                    ) {
                Text(text = q11,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = q12,
                textAlign = TextAlign.Justify)
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .weight(0.5f)
                    .fillMaxHeight()) {
                Text(text = q21,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = q22,
                textAlign = TextAlign.Justify)
            }
        }

        Row(modifier = Modifier.weight(0.5f)) {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .weight(0.5f)
                    .fillMaxHeight()) {
                Text(text = q31,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = q32,
                    textAlign = TextAlign.Justify)
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .weight(0.5f)
                    .fillMaxHeight()) {
                Text(text = q41,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = q42,
                    textAlign = TextAlign.Justify)
            }
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