package com.furkandemirci.donemodevi_191030050

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import com.furkandemirci.donemodevi_191030050.fragment.details
import com.furkandemirci.donemodevi_191030050.fragment.lists
import com.furkandemirci.donemodevi_191030050.ToolbarAbout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun onCreateOptionsMenu(menu: Menu?): Boolean {
            //Inflater
            val menuInflater = menuInflater
            menuInflater.inflate(R.menu.about_menu,menu)
            return super.onCreateOptionsMenu(menu)

        }

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId == R.id.about) {
                //AboutActivity
                val intent = Intent(applicationContext, ToolbarAbout::class.java)
                startActivity(intent)
            }

            return super.onOptionsItemSelected(item)
        }


        if (checkConnection(context)){
            Toast.makeText(this, "Internet is Connected",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Internet is not Connected", Toast.LENGTH_LONG).show()
        }
    }

    private fun checkConnection(context: Context): Boolean {
        val connectivityManager = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo:NetworkInfo? = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected

    }
}