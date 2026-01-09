package vv.monika.coffeeapplication.presentation.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.coffeeapplication.R
import vv.monika.coffeeapplication.domain.model.Product
import vv.monika.coffeeapplication.presentation.ui_components.MyBottomNavBar

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun HomeScreen(modifier: Modifier = Modifier) {

    val location = "Janatha Rd, Palarivattom"

    Scaffold(
        bottomBar = { MyBottomNavBar() },


        ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030), Color(0xFF1F1F1F), Color(0xFF121212)
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ) {
//            displaying products
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
                Product(3, "Espresso",
                    2.99, "Strong and concentrated coffee",
                    R.drawable.coffee_3),
                Product(4, "Macchiato",
                    3.49, "Espresso with a small amount of hot milk",
                    R.drawable.coffee_4),
                Product(5, "Mocha",
                    4.99, "Espresso with chocolate syrup and steamed milk",
                    R.drawable.coffee_5),
                Product(6, "Americano",
                    3.99, "Espresso with hot water",
                    R.drawable.coffee_6),
                Product(7, "Iced Coffee",
                    4.49, "Cold brew with ice cubes",
                    R.drawable.coffee_1),
                Product(8, "Cold Brew",
                    3.99, "Brewed coffee with ice cubes",
                    R.drawable.coffee_2),
                Product(9, "Hot Chocolate",
                    4.99, "Chocolate drink with hot milk",
                    R.drawable.coffee_3),
                Product(10, "Chai Latte",
                    3.49, "Chai tea with steamed milk",
                    R.drawable.coffee_4),



                )

            ProductsGrid(products = products) {
                Text(
                    "Location", color = Color.Gray, fontSize = 14.sp
                )
                Spacer(Modifier.height(4.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        location,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Change Location",
                        tint = Color.White
                    )
                }
                Spacer(Modifier.height(40.dp))
                MySearchBar()
                Spacer(Modifier.height(40.dp))

                Image(
                    painter = painterResource(R.drawable.banner_1), contentDescription = "Home Banner"
                )
                Spacer(Modifier.height(16.dp))
                HomeScreenCategories()


            }
        }
    }

}