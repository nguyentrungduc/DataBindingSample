package com.example.sony.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.sony.databindingsample.data.model.Movie;
import com.example.sony.databindingsample.data.model.User;
import com.example.sony.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();

    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        binding.setUser1(user);
        user.setFirstName("abc");
        binding.setMain(this);
        binding.setPresenter(new MPresenter());
        binding.setHandlers(new MyHandler());
        mAdapter = new Adapter(this, Movie.createListMovie());
    }

    public Adapter getAdapter() {
        return mAdapter;
    }


}
