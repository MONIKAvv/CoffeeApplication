package vv.monika.coffeeapplication.screens.WelcomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.coffeeapplication.R
import vv.monika.coffeeapplication.ui.theme.LightBrown

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Black)
    ) {
        Image(painter = painterResource(R.drawable.image_splash),
            "Welcome Image")

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp, vertical = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text("Fall in Love with Coffee in Blissful Delight",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(16.dp))
            Text("Welcome to our cozy coffee corner, where every cup is a delight for you.",
                color = Color.LightGray,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(50.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBrown,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Get Started",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }

}