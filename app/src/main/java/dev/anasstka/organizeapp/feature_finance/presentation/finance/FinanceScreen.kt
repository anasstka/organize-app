package dev.anasstka.organizeapp.feature_finance.presentation.finance

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.anasstka.organizeapp.R
import dev.anasstka.organizeapp.ui.theme.GreenColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FinanceScreen() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.size(width = 64.dp, height = 44.dp),
                backgroundColor = MaterialTheme.colors.primary,
                onClick = {
                },
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_add),
                    contentDescription = "",
                    tint = MaterialTheme.colors.onPrimary
                )
            }
        },
        scaffoldState = scaffoldState
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 20.dp))
                    .background(color = GreenColor)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 44.dp)
                ) {
//                Spacer(modifier = Modifier.height(44.dp))
                    Row {
                        Text(
                            modifier = Modifier
                                .weight(1f)
                                .align(Alignment.CenterVertically),
                            text = "Бюджет",
                            style = MaterialTheme.typography.h6,
                            color = MaterialTheme.colors.onPrimary
                        )
                        IconButton(modifier = Modifier.size(28.dp), onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(R.drawable.ic_union),
                                contentDescription = "",
                                tint = MaterialTheme.colors.onPrimary
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Column {
                        Text(
                            style = MaterialTheme.typography.h6,
                            color = MaterialTheme.colors.onPrimary,
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = MaterialTheme.colors.onPrimary.copy(
                                            alpha = 0.5f
                                        )
                                    )
                                ) {
                                    append("Доступно ")
                                }
                                append("сегодня")
                            },
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "–185.12 ₽",
                            style = MaterialTheme.typography.h5,
                            color = MaterialTheme.colors.onPrimary
                        )
                        Text(
                            text = "из 2450.00 ₽",
                            style = MaterialTheme.typography.subtitle1,
                            color = MaterialTheme.colors.onPrimary
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 16.dp)
            ) {
                Text(
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onBackground,
                    text = buildAnnotatedString {
                        append("Траты за ")
                        withStyle(
                            style = SpanStyle(color = MaterialTheme.colors.primary)
                        ) {
                            append("июнь")
                        }
                    },
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onBackground,
                    text = "История"
                )
//                LazyColumn() {
//                    category.forEach {c ->
//                        stickyHeader {
//
//                        }
//                    }
//                    items(2) { item ->
//
//                    }
//                }
            }
        }
    }
}

@Preview
@Composable
fun FinanceScreenPreview() {
    FinanceScreenPreview()
}