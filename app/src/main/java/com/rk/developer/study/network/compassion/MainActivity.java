package com.rk.developer.study.network.compassion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    TextView expandTextView;
    TextView moreInfo;
    CardView cardView;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        expandTextView = findViewById(R.id.expandView);
        moreInfo = findViewById(R.id.moreInfo);
        cardView = findViewById(R.id.cardView);
        recyclerView = findViewById(R.id.rvGrid);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));


        List<Models> modelsList = new ArrayList<>();
        modelsList.add(new Models("New Sponsorship","Reagle",R.drawable.girl,"",""));
        modelsList.add(new Models("Johanna","Give a gift",R.drawable.girl,"Birthday in 2 months",""));
        modelsList.add(new Models("Weather","My community",R.drawable.weather,"",""));
        modelsList.add(new Models("New Sponsorship","Reagle",R.drawable.lady,"","How to use Amazon Smile and give as you live"));
        modelsList.add(new Models("New Photo","Reagle",R.drawable.man,"","Sergio"));
        modelsList.add(new Models("Thank You","My children",R.drawable.girl,"5 gifts given this year",""));
        modelsList.add(new Models("Thank You","My children",R.drawable.girl,"5 gifts given this year",""));
        modelsList.add(new Models("Sergio","Pay Now",R.drawable.girl,"Give thanks that sergio recieves regular home visit from caring staff",""));


        MyAdapter adapter = new MyAdapter(modelsList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandTextView.getVisibility()==View.GONE){
                    moreInfo.setText("Show less");
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandTextView.setVisibility(View.VISIBLE);
                }
                else {
                    moreInfo.setText("Tell me more");
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandTextView.setVisibility(View.GONE);
                }
            }
        });



        nav = findViewById(R.id.nav_menu);
        drawerLayout = findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.Home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.about:
                        Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                    case R.id.contact:
                        Toast.makeText(MainActivity.this, "Contact", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                    case R.id.privacy:
                        Toast.makeText(MainActivity.this, "Privacy", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.condition:
                        Toast.makeText(MainActivity.this, "Terms And Condition", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }


                return true;
            }
        });

        

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        
        switch (item.getItemId()){
            case R.id.notification:
                Toast.makeText(MainActivity.this, "Notification Icon Clicked", Toast.LENGTH_SHORT).show();
                break;
                
                
            default:
                Toast.makeText(MainActivity.this, "Something is error", Toast.LENGTH_SHORT).show();
        }
        
        return super.onOptionsItemSelected(item);
    }
}