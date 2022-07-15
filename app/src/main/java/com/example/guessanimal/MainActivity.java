package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView animalImage;
    boolean isDog, isCat, isGiraffe;
    Button resultBtn;
    String animal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalImage = findViewById(R.id.animalImage);
        resultBtn =findViewById(R.id.resultBtn);

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("key", animal);
                startActivity(intent);
            }
        });
    }

    public void changeImage(View view) {
        switch(view.getId()){
            case R.id.dogBtn:
                animalImage.setImageResource(R.drawable.dog_cute);
                isDog = true;
                isCat = false;
                isGiraffe = false;
                animal = "dog";
                break;

            case R.id.catBtn:
                animalImage.setImageResource(R.drawable.cat);
                isDog = false;
                isCat = true;
                isGiraffe = false;
                animal = "cat";
                break;

            case R.id.giraffeBtn:
                animalImage.setImageResource(R.drawable.giraffe);
                isDog = false;
                isCat = false;
                isGiraffe = true;
                animal = "giraffe";
                break;

        }
    }
    public void answer(View view) {
        switch(view.getId()){
            case R.id.thisDodBtn:
                if(isDog){
                Toast.makeText(this,"Верно", Toast.LENGTH_SHORT).show();
        }else {
                Toast.makeText(this,"Не верно", Toast.LENGTH_SHORT).show();
        }
        break;
            case R.id.thisCatBtn:
                if(isCat){
                    Toast.makeText(this,"Верно", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"Не верно", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.thisGiraffeBtn:
                if(isGiraffe){
                    Toast.makeText(this,"Верно", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"Не верно", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}