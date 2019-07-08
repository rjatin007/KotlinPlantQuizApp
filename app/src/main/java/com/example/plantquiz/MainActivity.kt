package com.example.plantquiz

import android.os.AsyncTask
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Toast.makeText(this,"The OnCreate method called!",Toast.LENGTH_SHORT).show();

        val myPlant:Plant = Plant("","","","","","",0,0)
        myPlant.plantName= "Rose";
    }
    fun button1Clicked(buttonView: View){
        Toast.makeText(this,"Button 1 clicked!",Toast.LENGTH_SHORT).show();

    }
    fun button2Clicked(buttonView: View){
        Toast.makeText(this,"Button 2 clicked!",Toast.LENGTH_SHORT).show();

    }
    fun button3Clicked(buttonView: View){
        Toast.makeText(this,"Button 3 clicked!",Toast.LENGTH_SHORT).show();

    }
    fun button4Clicked(buttonView: View){
        Toast.makeText(this,"Button 4 clicked!",Toast.LENGTH_SHORT).show();

    }

    inner class DownloadingPlantQuestins : AsyncTask<String,Int, List<Plant>>(){
        override fun doInBackground(vararg params: String?): List<Plant>? {
            // this method can't access UI, should be used for the same
            return null;
        }

        override fun onPostExecute(result: List<Plant>?) {
            // this method can access UI, should be used for the same.
            super.onPostExecute(result);
        }
    }

}
