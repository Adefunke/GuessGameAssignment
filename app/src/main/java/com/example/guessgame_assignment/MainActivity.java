package com.example.guessgame_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //todo 1: create an string array for a category e.g an array for cars in the world.

    //todo 2: put the name of the array you want users to guess into the message that shows in the page.
    // i.e change We have an array of ????. to We have an array of cars.

    //todo 3: the max sent to getRandomNumber should be the length of the array.

    //todo 4: create a condition in clickFunction method to check if the correct word was guessed"

    // todo 5: create a condition to show a toast if the correct was not guessed.
    // todo hint: where you see  3 backslashes, they are meant to be removed and the code corrected.

    // advanced todo 6: add a condition to allow people guess only 10 times, else a new word from the
    //  array is randomly picked and the player has to guess again.

    // create array here
    String result;

    // this is the method that randomly guesses the value between -100 and 500.
    static int getRandomNumber(int max, int min) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // toast is a method that shows pop up for a while. Therefore, the string it takes in
    // will determine the message you see.
    public void makeToast(int str) {
        Toast.makeText(MainActivity.this, getText(str), Toast.LENGTH_SHORT).show();
    }

    public void clickFunction(View view) {
        EditText variable = findViewById(R.id.editId);
        String wordGuessing = variable.getText().toString();
        //// code for the conditions go here. the word the player typed is stored in wordGuessing
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min = 1;
        /// int max = 100;

        /// result = <Array_name>[getRandomNumber(min, max)];
    }
}
