package me.dio.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.matches_simulator_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private fun setupMatchesList() {
//TODO Listars as partidas consumindo nossa API.
    }

    private fun setupMatchesRefresh() {
        //TODO : atualizar as partidas na acao swipe
    }

    private fun setupFloatingActionButton() {
        //TODO : criar evento de Click e simulacao de partidas

    }
}