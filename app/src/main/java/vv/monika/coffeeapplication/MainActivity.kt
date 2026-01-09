package vv.monika.coffeeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import vv.monika.coffeeapplication.presentation.screens.WelcomeScreen.WelcomeScreen
import vv.monika.coffeeapplication.presentation.screens.detailsScreen.DetailsScreen
import vv.monika.coffeeapplication.presentation.theme.CoffeeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeeApplicationTheme {
                DetailsScreen()
            }
        }
    }
}
