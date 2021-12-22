package com.example.coffe4coders.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffe4coders.ui.theme.Coffe4CodersTheme

typealias NavigationAction = () -> Unit

@Composable
fun CustomAppBar(
    title: String? = null,
    navigationIcon: ImageVector? = null,
    navigationAction: NavigationAction? = null
) {
    val titleText = title ?: "Coffee4Coders"
    if(navigationIcon != null && navigationAction != null){
        TopAppBar(
            title = { Text(text = titleText)},
            navigationIcon = {
                IconButton(onClick = {
                    navigationAction()
                }) {
                    Icon(navigationIcon, "")
                }
            },
            backgroundColor = MaterialTheme.colors.primary
        )
    }else{

    }
}

@Preview(
    showBackground = true
)
@Composable
fun CustomAppBarPreview() {
    Coffe4CodersTheme {
        CustomAppBar("Coffe4Coders")
    }
}