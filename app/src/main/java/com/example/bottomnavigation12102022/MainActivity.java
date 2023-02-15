package com.example.bottomnavigation12102022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddHomeFragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddHomeFragment = findViewById(R.id.button_add_home_fragment);

        fragmentManager = getSupportFragmentManager();

        btnAddHomeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();
                bundle.putFloat("rating", 2.5f);
                fragmentTransaction.add(R.id.linear_container, HomeFragment.class, bundle);
                fragmentTransaction.commit();
            }
        });
    }
}
