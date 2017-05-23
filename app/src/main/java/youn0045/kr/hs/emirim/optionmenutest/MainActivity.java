package youn0045.kr.hs.emirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout linear;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear=(LinearLayout) findViewById(R.id.linear);
        but=(Button)findViewById(R.id.but_ok);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item_blue: //id가 파랑색인 경우
                linear.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.item_red:
                linear.setBackgroundColor(Color.RED);
                return true;

            case R.id.item_yellow:
                linear.setBackgroundColor(Color.YELLOW);
                return true;

            case R.id.item_but_rotate: //버튼 (회전)
                but.setRotation(but.getRotation()+45);
                return true;

            case R.id.item_but_size:
                but.setScaleX(but.getScaleX()*1.5f); //(확대)가로 방향 으로 2배의 사이즈
                return true;

        }
        return false; //switch 문에서 하나라도 실행되었으면 return true 실행된게 없으면 return false


    }
}
