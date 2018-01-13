package com.tashfia.myrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgFood;
    TextView txtRecipeName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgFood=(ImageView)findViewById(R.id.img_food);
        txtRecipeName=(TextView)findViewById(R.id.txt_recipename);
        txtDescription=(TextView)findViewById(R.id.txt_description);

        //received data
        String getRecipeNo=getIntent().getExtras().getString("recipe_no");


        if(getRecipeNo.equals("one"))
        {
            imgFood.setImageResource(R.drawable.falafel_burgers);
            txtRecipeName.setText(R.string.recipie1);//for replace text
            txtDescription.setText(R.string.des_recipe1);//for replace text
        }
        else if(getRecipeNo.equals("two"))
        {
            imgFood.setImageResource(R.drawable.chicken_biriyani);
            txtRecipeName.setText(R.string.recipie2);//for replace text
            txtDescription.setText(R.string.des_recipe2);//for replace text
        }
        else if(getRecipeNo.equals("three"))
        {
            imgFood.setImageResource(R.drawable.cake);
            txtRecipeName.setText(R.string.recipie3);//for replace text
            txtDescription.setText(R.string.des_recipe3);//for replace text
        }
        else if(getRecipeNo.equals("four"))
        {
            imgFood.setImageResource(R.drawable.pizza);
            txtRecipeName.setText(R.string.recipie4);//for replace text
            txtDescription.setText(R.string.des_recipe4);//for replace text
        }
    }
}
