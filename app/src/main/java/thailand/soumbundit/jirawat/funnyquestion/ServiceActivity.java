package thailand.soumbundit.jirawat.funnyquestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ServiceActivity extends AppCompatActivity {

    private String nameUserString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

//        Find User
        findUser();


//        Create Toolbar
        createToolbar();

    }  //Mian Method


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.itemExit) {
            myExit();
        }
        return super.onOptionsItemSelected(item);
    }

    private void myExit() {
//        Sign Out
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signOut();

//        Exit_App
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_service, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void findUser() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        nameUserString = firebaseUser.getDisplayName();
    }

    private void createToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbarService);
        setSupportActionBar(toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setSubtitle("Welcome "+ nameUserString);

    }
} // Main Class
