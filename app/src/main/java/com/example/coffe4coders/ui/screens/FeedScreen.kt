package com.example.coffe4coders.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.coffe4coders.ui.components.*
import com.example.coffe4coders.ui.theme.Coffe4CodersTheme
import com.example.coffe4coders.utilities.MockDataProvider

@Composable
fun FeedScreen(navController: NavController) {
    val listProduct = MockDataProvider.listOfProducts()

    Scaffold(
        topBar = {
            CustomAppBar(navigationIcon = Icons.Filled.Home){}
        },
        content = {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                item {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TitleText(title = "Bienvenido")
                        BodyText(body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla mattis ac elit non pretium. Aenean vitae sodales ligula. Mauris in pretium magna, eu molestie quam. Etiam in libero tortor. Nam quis vulputate lectus. Proin dictum velit et nisl venenatis vulputate. Vestibulum hendrerit eget nulla id aliquam. Cras non maximus nibh. Duis convallis nunc sed mollis pulvinar. Phasellus commodo tempus egestas. Curabitur volutpat viverra augue, semper facilisis augue congue id.")
                    }
                }
                items(listProduct) { product ->
                    ProductCard(
                        product
                    )
                    {
                        navController.navigate("detail/${product.id}"){
                            launchSingleTop = true
                        }
                    }
                }
            }
        }
    )
}

@Preview(
    showBackground = true
)
@Composable
fun FeedScreenPreview() {
    val navController = rememberNavController()
    FeedScreen(navController)
}