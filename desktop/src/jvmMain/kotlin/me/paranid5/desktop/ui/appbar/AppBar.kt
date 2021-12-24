package me.paranid5.desktop.me.paranid5.desktop.ui.appbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
private fun ColumnScope.Account() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                      // TODO: Account screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/human.png"), // TODO: User's avatar
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .height(50.dp)
                            .clip(CircleShape)
                            .border(
                                width = 2.dp,
                                color = Colors.backgroundColor,
                                shape = CircleShape
                            ),
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.account,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.Projects() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                      // TODO: Projects screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/project_icon.png"),
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier.align(Alignment.TopCenter).height(50.dp)
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.projects,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.Blog() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                      // TODO: Blog screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/blog_icon.png"),
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier.align(Alignment.TopCenter).height(50.dp)
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.blog,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.Settings() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                      // TODO: Settings screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/settings.png"),
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier.align(Alignment.TopCenter).height(50.dp)
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.settings,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.AboutApp() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                      // TODO: About app screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/about_app.png"),
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier.align(Alignment.TopCenter).height(50.dp)
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.aboutApp,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

@Composable
fun AppBar() {
    Box(
        Modifier
            .fillMaxHeight()
            .wrapContentWidth()
            .background(Colors.primaryColor)
    ) {
        Column {
            Account()
            Projects()
            Blog()
            Settings()
            AboutApp()
        }
    }
}