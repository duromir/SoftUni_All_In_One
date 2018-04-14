package net.firstcolor.android.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_room_db})
    public void roomDBBtnClicked(View button){
        Toast.makeText(HomeActivity.this, "will open room database example", Toast.LENGTH_LONG).show();
    }

    @OnClick({R.id.btn_async_task})
    public void asyncTaskBtnClicked(View button){
        Toast.makeText(HomeActivity.this, "will open async task example", Toast.LENGTH_LONG).show();
    }


}
