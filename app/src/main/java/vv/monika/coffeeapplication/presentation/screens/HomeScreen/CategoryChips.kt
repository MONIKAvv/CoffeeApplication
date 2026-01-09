package vv.monika.coffeeapplication.presentation.screens.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.coffeeapplication.presentation.theme.LightBrown
import vv.monika.coffeeapplication.presentation.theme.LightGray

@Composable
fun CategoryChips(
    modifier: Modifier = Modifier, text: String, isSelected: Boolean, onSelected: () -> Unit
) {
    Box(
        modifier = modifier
            .width(90.dp)
            .height(50.dp)
            .clip(RoundedCornerShape(15.dp))
            .clickable { onSelected() }

            .background(color = if (isSelected) LightBrown else LightGray.copy(alpha = 0.6f)),
        contentAlignment = Alignment.Center) {
        Text(
            text,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
        )
    }
}