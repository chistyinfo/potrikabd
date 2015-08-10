package pigi.example.pigi;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.rzlts.appinbox.model.Gender;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


import com.rzlts.appinbox.AppInbox;
import com.rzlts.appinbox.views.InboxView;


public class WelActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;

    FloatingActionButton fabBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);


        AppInbox.startInbox(this, "RIOIfLocGGQo7JW5ryQWBwd6Nxcyr_Xagxtiml9HAG4", "1040951390909", null, null, null, "Mainuddin", "Chisty", "chistyinfo@gmail.com", Gender.MALE, 0);

        FrameLayout rlLayout = (FrameLayout) this.findViewById(R.id.rlLayout);
        final InboxView inbox = new InboxView(this);
        rlLayout.addView(inbox);






        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);


        FloatingActionButton fabBtn = (FloatingActionButton) findViewById(R.id.fabBtn);
        fabBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public void onDrawerItemSelected(View view, int position) {

    }
}