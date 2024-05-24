package me.tbsten.toryumon.hackathon.template.home

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lightspark.composeqr.QrCodeView
import me.tbsten.toryumon.hackathon.template.R
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun XButton(
    modifier: Modifier = Modifier,
    xUrl: String,
) {
    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }

    Button(
        modifier = modifier,
        onClick = { showDialog = true },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary,
        ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.x_icon),
            contentDescription = "x",
            modifier = Modifier.size(18.dp),
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Xはこちら")
    }

    if (showDialog) {
        XDialog(
            onOpen = { openUrl(context, xUrl) },
            onDismissRequest = { showDialog = false },
        )
    }
}

@Composable
private fun XDialog(
    modifier: Modifier = Modifier,
    onOpen: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        title = { Text("てべすてんのX") },
        text = {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .padding(16.dp)
                    .size(300.dp)
            ) {
                QrCodeView(
                    data = "https://x.com/tbs__ten",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                )
            }
        },
        confirmButton = {
            Button(onClick = onOpen) {
                Text("Xを見る")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismissRequest) {
                Text("閉じる")
            }
        },
    )
}

private fun openUrl(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
        .apply {
            data = Uri.parse(url)
        }
    context.startActivity(intent)
}

@Preview
@Composable
private fun XButtonPreview() {
    SelfIntroduceAppTheme {
        XButton(xUrl = "https://x.com/tbs__ten")
    }
}
