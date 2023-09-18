package com.example.dasini;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;


public class OnboardActivity extends AppCompatActivity {

    private OnboardingAdapter onboardingAdapter;
    private LinearLayout layoutOnboardingIndicators;
    private MaterialButton buttonOnboardingAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        layoutOnboardingIndicators = findViewById(R.id.layoutOnboardingIndicator);
        buttonOnboardingAction = findViewById(R.id.buttonOnboardingAction);

        setupOnboardingItems();
        ViewPager2 onboardingViewPager = findViewById(R.id.onboardingViewPager);
        onboardingViewPager.setAdapter(onboardingAdapter);

        setupOnboardingIndicators();
        setCurrentOnboardingIndicators(0);
        onboardingViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentOnboardingIndicators(position);
            }
        });

        buttonOnboardingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onboardingViewPager.getCurrentItem() + 1 < onboardingAdapter.getItemCount()) {
                    onboardingViewPager.setCurrentItem(onboardingViewPager.getCurrentItem()+1);
                } else {
                    startActivity(new Intent(getApplicationContext(), Mainmenu_activity.class));
                    finish();
                }
            }
        });
    }


    private void setupOnboardingItems() {

        List<OnboardingItem> onboardingItems = new ArrayList<>();

        OnboardingItem itemQurban = new OnboardingItem();
        itemQurban.setTitle("Danisi");
        itemQurban.setDescription("Aplikasi wikipedia untuk kesenian tari di Indonesia");
        itemQurban.setImage(R.drawable.logosquare);

        OnboardingItem itemOnTheWay = new OnboardingItem();
        itemOnTheWay.setTitle("Tentang Aplikasi");
        itemOnTheWay.setDescription("merupakan aplikasi yang dapat dijalankan pada device yang menggunakan sistem android yang bertujuan untuk memberikan informasi pada pengguna android tentang kumpulan kesenian tari.");
        itemOnTheWay.setImage(R.drawable.img3);

        OnboardingItem itemEatTogether = new OnboardingItem();
        itemEatTogether.setTitle("Tentang Aplikasi");
        itemEatTogether.setDescription("Aplikasi Katalog Tari Indonesia ini dibuat dengan tujuan mempermudah pemakai aplikasi dalam mencari informasi tentang kebudayaan dan kesenian khususnya seni tari yang ada di Indonesia.");
        itemEatTogether.setImage(R.drawable.img3);


        onboardingItems.add(itemQurban);
        onboardingItems.add(itemOnTheWay);
        onboardingItems.add(itemEatTogether);

        onboardingAdapter = new OnboardingAdapter(onboardingItems);
    }

    private void setupOnboardingIndicators() {
        ImageView[] indicators = new ImageView[onboardingAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8, 0, 8, 0);
        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layoutOnboardingIndicators.addView(indicators[i]);
        }
    }

    private void setCurrentOnboardingIndicators(int index) {
        int childCount = layoutOnboardingIndicators.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView) layoutOnboardingIndicators.getChildAt(i);
            if (i == index) {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active)
                );
            } else {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive)
                );
            }
        }
        if(index == onboardingAdapter.getItemCount()-1){
            buttonOnboardingAction.setText("Mulai");
        }else{
            buttonOnboardingAction.setText("Next");
        }
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
