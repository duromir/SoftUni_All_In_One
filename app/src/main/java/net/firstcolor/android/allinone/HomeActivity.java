package net.firstcolor.android.allinone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.firstcolor.android.allinone.data.AppDatabase;
import net.firstcolor.android.allinone.data.Article;
import net.firstcolor.android.allinone.data.DatabaseFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    @OnClick({R.id.btn_recycler_view})
    public void btnRecyclerViewClicked(View Button){
        Toast.makeText(HomeActivity.this, "will open recycler view example", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    @OnClick({R.id.btn_room_db})
    public void roomDBBtnClicked(View button){
        Toast.makeText(HomeActivity.this, "will open room database example", Toast.LENGTH_LONG).show();
        //TODO: Open activity
    }

    @OnClick({R.id.btn_async_task})
    public void asyncTaskBtnClicked(View button){
        Toast.makeText(HomeActivity.this, "will open async task example", Toast.LENGTH_LONG).show();
    }
}
