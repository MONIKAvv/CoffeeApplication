package vv.monika.coffeeapplication.screens.HomeScreen

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.coffeeapplication.ui.theme.CreamBeige
import vv.monika.coffeeapplication.ui.theme.LightBrown
import vv.monika.coffeeapplication.ui.theme.LightGray

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
            .padding(vertical = 8.dp, horizontal = 4.dp)
            .background(color = if (isSelected) LightBrown else CreamBeige.copy(alpha = 0.3f)),
        contentAlignment = Alignment.Center) {
        Text(
            text,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
        )
    }
}