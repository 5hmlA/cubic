package osp.sparkj.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import osp.sparkj.cubic.FoldFlip
import osp.sparkj.demo.ui.theme.CubicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CubicTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//                    PreviewTouch3D()
                    MiFloldflip()
                }
            }
        }
    }
}

@Composable
private fun MiFloldflip(
) {

    FoldFlip(expanded = {
        Image(
            painter = painterResource(id = R.mipmap.img),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }, head = {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color.Black,
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            androidx.compose.material3.Text(text = "头部")
        }
    }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 111.dp)
                .background(
                    color = Color.Cyan,
                    shape = RoundedCornerShape(16.dp)
                )
        )
    }
}