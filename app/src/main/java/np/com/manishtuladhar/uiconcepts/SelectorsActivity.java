package np.com.manishtuladhar.uiconcepts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class SelectorsActivity extends AppCompatActivity implements SelectorItemsAdapter.ListItemClickListener{

    RecyclerView mRecyclerView;
    SelectorItemsAdapter mAdapter;

    private static final String TAG = "SelectorsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectors);

        mRecyclerView = findViewById(R.id.mainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new SelectorItemsAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Log.e(TAG, "onListItemClick: "+clickedItemIndex );
    }
}