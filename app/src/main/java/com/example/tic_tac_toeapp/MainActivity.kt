package com.example.tic_tac_toeapp

import android.annotation.SuppressLint
import android.net.sip.SipAudioCall
import android.net.sip.SipSession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.Intents.UI
import android.renderscript.ScriptGroup.Builder2
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.animation.AnimatableView.Listener

private lateinit var A1: Button
private lateinit var A2 : Button
private lateinit var A3: Button
private lateinit var B1: Button
private lateinit var B2: Button
private lateinit var B3: Button
private lateinit var C1: Button
private lateinit var C2: Button
private lateinit var C3: Button



private lateinit var tvturn : TextView
private lateinit var ImageButton : ImageButton
private lateinit var game : ConstraintLayout

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initComponents()
        listeners()
        ui()

    }


    private fun initComponents() {
        A1 = findViewById(R.id.A1)
        A2= findViewById(R.id.A2)
        A3= findViewById(R.id.A3)
        B1= findViewById(R.id.B1)
        B2 = findViewById(R.id.B2)
        B3 = findViewById(R.id.B3)
        C1 = findViewById(R.id.C1)
        C2 = findViewById(R.id.C2)
        C3 = findViewById(R.id.C3)

        tvturn = findViewById(R.id.textView)
        ImageButton = findViewById(R.id.ImageButton)

    }

    private fun listeners() {
        A1.setOnClickListener {
            val play = false
            if(A1.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    A1.text = "X"
                    currentTurn
                    ui()
                }else{
                    A1.text = "O"
                    currentTurn
                    ui()}}}

        A2.setOnClickListener {
            val play = false
            if(A2.text == "" && play){

                val currentTurn = null
                if(currentTurn == 0) {
                    A2.text = "X"
                    currentTurn
                    ui()
                }else{
                    A2.text = "O"
                    currentTurn
                    ui()}}}

        A3.setOnClickListener {
            var play = false
            if(A3.text == "" && play){
                val currentTurn = null
                if(currentTurn == 0) {
                    A3.text = "X"
                    currentTurn
                    ui()
                }else{
                    A3.text = "O"
                    currentTurn
                    ui()}}}

        B1.setOnClickListener {
            var play = false
            if(B1.text == "" && play){
                val currentTurn = null
                if(currentTurn == 0) {
                    B1.text = "X"
                    currentTurn
                    ui()
                }else{
                    B1.text = "O"
                    currentTurn
                    ui()}}}

        B2.setOnClickListener {
            var play = false
            if(B2.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    B2.text = "X"
                    currentTurn
                    ui()
                }else{
                    B2.text = "O"
                    currentTurn
                    ui()}}}

        B3.setOnClickListener {
            var play = false
            if(B3.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    B3.text = "X"
                    currentTurn
                    ui()
                }else{
                    B3.text = "O"
                    currentTurn
                    ui()}}}

        C1.setOnClickListener {
            var play = false
            if(C1.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    C1.text = "X"
                    currentTurn
                    ui()
                }else{
                    C1.text = "O"
                    currentTurn
                    ui()}}}

        C2.setOnClickListener {
            var play = false
            if(C2.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    C2.text = "X"
                    currentTurn
                    ui()
                }else{
                    C2.text = "O"
                    currentTurn
                    ui()}}}

        C3.setOnClickListener {
            var play = false
            if(C3.text == "" && play){
                var currentTurn = null
                if(currentTurn == 0) {
                    C3.text = "X"
                    currentTurn
                    ui()
                }else{
                    C3.text = "O"
                    currentTurn
                    ui()}}}

        ImageButton.setOnClickListener {
            A1.text = ""
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            A2.text = ""
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            A3.text = ""
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B1.text = ""
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B2.text = ""
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B3.text = ""
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C1.text = ""
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C2.text = ""
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C3.text = ""
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            window.statusBarColor = getColor(R.color.bg)
            var currentTurn = 0
            var play = true
            ui()
        }

    }

    private fun ui(){
        val currentTurn = null
        if(currentTurn == 0){
            tvturn.text = "X"
        }else{
            tvturn.text = "O"}

        if((A1.text == A2.text && A2.text == A3.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((B1.text == B2.text && B2.text == B3.text) && B1.text != ""){
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((C1.text == C2.text && C2.text == C3.text) && C1.text != ""){
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((A1.text == B1.text && B1.text == C1.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((A2.text == B2.text && B2.text == C2.text) && A2.text != ""){
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((A3.text == B3.text && B3.text == C3.text) && A3.text != ""){
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((A1.text == B2.text && B2.text == C3.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        if((A3.text == B2.text && B2.text == C1.text) && A3.text != ""){
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            var play = false
        }

        val play = false
        if(currentTurn == 9 && play){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
        }

    }
}


