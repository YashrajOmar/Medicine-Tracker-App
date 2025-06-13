package com.example.medical

//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class WelcomeScreenActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_welcome_screen)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
class WelcomeScreen : AppCompatActivity() {
    private val binding : ActivityWelcomeScreenBinding by lazy{
        ActivityWelcomeScreenBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(this, LoginActivity:: class.java))
        finish()
    }, 3000)

        val welcomeText = "Welcome"
        val spannableString = SpannableString(welcomeText)
        spannableString.setSpan(ForegroundColorSpan(Color.parseColor("#0060F7")),0,5,0)
        spannableString.setSpan(ForegroundColorSpan(Color.parseColor("#FFFFFF")),5,welcomeText.length,0)

        binding.welcomeText.text = spannableString
        //binding.welcomeText.text = "WELCOME"
    }
}
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(modifier: Modifier, navController: NavController
             , authViewModel: AuthViewModel){
    val authState = authViewModel.authState.observeAsState()

    LaunchedEffect(authState.value) {
        when(authState.value){
            is AuthState.Unauthenticated -> navController.navigate("login")
            else -> Unit
        }
    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Page", fontSize = 32.sp)

        TextButton(onClick = {
            authViewModel.signout()
        }) {
            Text(text = "Sign out")
        }
    }
}
