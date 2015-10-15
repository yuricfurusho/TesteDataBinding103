package yuricfurusho.testedatabinding103;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yuricfurusho.testedatabinding103.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public RecyclerView mRecyclerView;
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;
    public List<User> listUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        listUsers = new ArrayList<User>();
        for (int i=0; i < 100; i++) {
            User user = new User("Yuri " + i, "Furusho " + i);
            listUsers.add(user);
        }


        mAdapter = new UserAdapter(listUsers);
        mRecyclerView.setAdapter(mAdapter);

    }
}
