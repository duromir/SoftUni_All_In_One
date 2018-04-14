package net.firstcolor.android.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.btn_room_db)
    Button btnRoomDB;
    @BindView(R.id.btn_async_task)
    Button btnAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        btnRoomDB.setOnClickListener(btnRoomDBListener());
        btnAsyncTask.setOnClickListener(btnAsyncTaskListener());
    }

    private View.OnClickListener btnRoomDBListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "will open room database example", Toast.LENGTH_LONG).show();
            }
        };
    }

    private View.OnClickListener btnAsyncTaskListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "will open async task example", Toast.LENGTH_LONG).show();
            }
        };
    }

}
