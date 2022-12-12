package com.example.assessment2

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    val dropdownlist1= arrayOf("3", "b3")
    val dropdownlist2= arrayOf("5", "b5","5#")
    val dropdownlist3= arrayOf("none", "7","b7")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, "NOTE: Always press 'STOP' before pressing 'PLAY'.", Toast.LENGTH_LONG)
        toast.setMargin(50f, 50f)
        toast.show()

        val toast2 = Toast.makeText(applicationContext, "Select notes as triads to form a chord.", Toast.LENGTH_LONG)
        toast2.setMargin(50f, 50f)
        toast2.show()

        supportActionBar?.hide()

        var mp=MediaPlayer()

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)
        val adapter3=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist3)

        var b1=findViewById(R.id.button) as Button
        var b2=findViewById(R.id.button2) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int, id: Long)
            {
                if(spinner.selectedItemPosition==0)
                {
                    textView1.setText(" " + spinner.selectedItem)

                }
                if(spinner.selectedItemPosition==1)
                {
                    textView1.setText(" " + spinner.selectedItem)

                }
            }
        }

        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int, id: Long)
            {
                if(spinner2.selectedItemPosition==0)
                {
                    textView2.setText(" " + spinner2.selectedItem)

                }
                if(spinner2.selectedItemPosition==1)
                {
                    textView2.setText(" " + spinner2.selectedItem)

                }
            }
        }

        spinner3.adapter=adapter3
        spinner3.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int, id: Long)
            {
                if(spinner3.selectedItemPosition==0)
                {
                    textView6.setText(" " + spinner3.selectedItem)

                }
                if(spinner3.selectedItemPosition==1)
                {
                    textView6.setText(" " + spinner3.selectedItem)

                }
            }
        }

        b1.setOnClickListener{
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Major Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio1))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Minor Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.loo))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==2)
            {
            textView3.setText("7th Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.oos))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==2)
            {
            textView3.setText("Minor 7th Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.los))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Major 7th Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.ool))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==2)
            {
                textView3.setText("Minor 7th Flat 5th Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lls))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==2)
            {
                textView3.setText("7th Flat 5th Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.ols))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Diminished Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.llo))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Major Diminished 5 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.olo))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Minor Maj7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lol))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Augmented Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.oso))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Augmented Maj7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.osl))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==2)
            {
                textView3.setText("Augmented Dim7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.oss))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==2)
            {
                textView3.setText("Minor Augmented Dim7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lss))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Minor Augmented Maj7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lsl))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==0)
            {
                textView3.setText("Minor Augmented Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lso))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Major Dim5 Maj7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.oll))
                mp.prepare()
                mp.start()
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==1)
            {
                textView3.setText("Minor Dim5 Maj7 Chord")
                mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.lll))
                mp.prepare()
                mp.start()
            }


        }
        b2.setOnClickListener {
            mp.stop()
            mp.release()
            mp= MediaPlayer()
        }
    }


}