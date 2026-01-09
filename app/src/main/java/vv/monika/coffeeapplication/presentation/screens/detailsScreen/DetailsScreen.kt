package vv.monika.coffeeapplication.presentation.screens.detailsScreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vv.monika.coffeeapplication.R
import vv.monika.coffeeapplication.domain.model.Product

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DetailsScreen(

) {
    val products = listOf(
        Product(
            1,
            "Cappuccino",
            3.99,
            "Espresso with steamed milk and foam",
            R.drawable.coffee_1
        ),
        Product(
            2, "Latte", 4.49,
            "Espresso with steamed milk and foam",
            R.drawable.coffee_2
        ),
        Product(
            3, "Espresso",
            2.99, "Strong and concentrated coffee",
            R.drawable.coffee_3
        ),
        Product(
            4, "Macchiato",
            3.49, "Espresso with a small amount of hot milk",
            R.drawable.coffee_4
        ),
        Product(
            5, "Mocha",
            4.99, "Espresso with chocolate syrup and steamed milk",
            R.drawable.coffee_5
        ),
        Product(
            6, "Americano",
            3.99, "Espresso with hot water",
            R.drawable.coffee_6
        ),
        Product(
            7, "Iced Coffee",
            4.49, "Cold brew with ice cubes",
            R.drawable.coffee_1
        ),
        Product(
            8, "Cold Brew",
            3.99, "Brewed coffee with ice cubes",
            R.drawable.coffee_2
        ),
        Product(
            9, "Hot Chocolate",
            4.99, "Chocolate drink with hot milk",
            R.drawable.coffee_3
        ),
        Product(
            10, "Chai Latte",
            3.49, "Chai tea with steamed milk",
            R.drawable.coffee_4
        ),


        )

    Scaffold(
        topBar = {
            DetailsScreenTopAppBar()
        },
        bottomBar = {
            DetailsScreenBottomBar()
        }
    ) { innerPadding ->

        LazyColumn(){
            item {
                ProductDetailsContent( innerPadding )
            }
        }

    }

}