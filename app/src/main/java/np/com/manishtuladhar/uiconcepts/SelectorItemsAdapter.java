package np.com.manishtuladhar.uiconcepts;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SelectorItemsAdapter  extends RecyclerView.Adapter<SelectorItemsAdapter.SelectorViewHolder> {

    private static final String TAG = "SelectorItemsAdapter";

    final private ListItemClickListener mOnClickListener;

    public SelectorItemsAdapter(ListItemClickListener mOnClickListener) {
        this.mOnClickListener = mOnClickListener;
    }

    public interface ListItemClickListener{
        void onListItemClick(int clickedItemIndex);
    }

    @NonNull
    @Override
    public SelectorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.selector_list_item,parent,false);
        SelectorViewHolder viewHolder = new SelectorViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectorViewHolder holder, int position) {
        Log.e(TAG, "onBindViewHolder: #" + position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class SelectorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView firstName,lastName;
        ImageView icon;

        public SelectorViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.personIcon);
            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }
}
