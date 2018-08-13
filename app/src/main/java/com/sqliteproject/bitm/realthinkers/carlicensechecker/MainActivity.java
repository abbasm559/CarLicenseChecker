package com.sqliteproject.bitm.realthinkers.carlicensechecker;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText checkEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkEt=findViewById(R.id.etCheckByNo);

    }

    public void showAllActivity() {
        Intent intent = new Intent(MainActivity.this,ShowAllCarActivity.class);
        startActivity(intent);

    }

    public void enterNewCarActivity() {
        Intent intent = new Intent(MainActivity.this,NewEntryActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       /* getMenuInflater().inflate(R.menu.menu_main, menu);*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            menu.add(0,1,1, menuIconWithText(getDrawable(R.drawable.add_new),getString(R.string.adnew)));
            menu.add(0,2,2, menuIconWithText(getDrawable(R.drawable.show_all),getString(R.string.show_all)));
            menu.add(0,3,3, menuIconWithText(getDrawable(R.drawable.exit),getString(R.string.exit)));
        }
        return true;
    }



    private CharSequence menuIconWithText(Drawable r, String title) {

        r.setBounds(0, 0, r.getIntrinsicWidth(), r.getIntrinsicHeight());
        SpannableString sb = new SpannableString("    " + title);
        ImageSpan imageSpan = new ImageSpan(r, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sb;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case 1:
                enterNewCarActivity();
                break;
            case 2:
                showAllActivity();
                break;
            case 3:
                finish();
        }
                return super.onOptionsItemSelected(item);
        }
    public void intarray(){
    int i = 1;
        int j = 7;
        int k = i+j;
    }
    }
