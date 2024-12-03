package com.shabeer.chatapp.signup.presantation.ui

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shabeer.chatapp.R

@Preview(showBackground = true)
@Composable
fun SignUpScreen() {

    val signUpButtonColor = Brush.linearGradient(
        listOf(
            Color(0xFF238CDD),
            Color(0xFF004873)
        )
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.login_blur),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.oig4__rndcloiljdx4hxpn),
                contentDescription = null
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "ChatConnect",
                style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.ExtraBold)
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "ChatConnect is a sleek and intuitive app for seamless, real-time messaging and conversations.",
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 100.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                modifier = Modifier
                    .background(brush = signUpButtonColor, shape = CircleShape)
                    .fillMaxWidth(.7f)
                    .height(60.dp)
            ) {
                Text(
                    text = "Continue With Google",
                    modifier = Modifier.padding(end = 20.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Image(
                    painter = painterResource(R.drawable.goog_0ed88f7c),
                    contentDescription = null,
                    modifier = Modifier.scale(1.2f)
                )
            }
        }
    }
}