package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /** пальто - 70 серебряных монет ( + скидка 77%)
     o  шляпа - 25 серебряных монет ( + скидка 37%)
     o  деловой̆костюм - 53 серебряных монет ( + скидка 44%
     o  сорочка - 19 серебряных монет (нет скидки);
     o  туфли - 41 серебряная монета ( + скидка 32%)
     На счету имеется 312 серебряных монет
     Необходимо рассчитать, хватит ли имеющихся средств для покупки делового
     гардероба
     **/
     private int cash = 312;

     private int coat =70;
     private int coatDiscount = 77;

     private int hat = 41;
     private int hatDiscount = 37;

     private int suit = 53;
     private int suitDiscount = 44;

     private int shirt = 19;

     private int shoes = 41;
     private int shoesDiscount = 32;

     public boolean canBuyClothes() {
         //45% От 100 == 100 * 0,45
         float result;

         result = (coat * coatDiscount + hat * hatDiscount + suit * suitDiscount + shirt + shoes * shoesDiscount) / 100;

         result = cash - result;

         if (result < 0) return false;
         else return true;
     }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

       boolean flag = canBuyClothes();
       if (flag) {
           txt.setText("We can buy clothes");
       }else{
           txt.setText("Not enough money!");
       }
    }
}