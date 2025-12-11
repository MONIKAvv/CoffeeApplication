package vv.monika.coffeeapplication.screens.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import vv.monika.coffeeapplication.R
import vv.monika.coffeeapplication.ui.theme.LightBrown

@Composable
fun MyBottomNavBar(modifier: Modifier = Modifier) {

//    Bottom nav Item
    val navItems = listOf(
        NavItem(title = "Home", icon = R.drawable.regular_outline_home),
        NavItem(title = "Cart", icon = R.drawable.regular_outline_bag),
        NavItem(title = "Favorites", icon = R.drawable.regular_outline_heart),
        NavItem(title = "Profile", icon = R.drawable.outline_account_circle_24),
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {

        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == 0,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) },
                modifier = Modifier.size(30.dp),
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.3f)
                )
            )
        }

    }
}

data class NavItem(
    val title: String,
    val icon: Int
)