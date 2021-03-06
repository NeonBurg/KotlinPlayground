package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    val TAG = "ScoreViewModel"

    // The final score
    var score = finalScore

    init {
        Log.i(TAG, "Final score is $finalScore")
    }

}