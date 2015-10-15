package yuricfurusho.testedatabinding103;


import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import yuricfurusho.testedatabinding103.databinding.AdapterUserBinding;


/**
 * Created by live on 15/10/15.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> listUsers;

    public UserAdapter(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterUserBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adapter_user, parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserViewHolder userViewHolder, int position) {
        User user = listUsers.get(position);
        userViewHolder.bindTo(user);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        private AdapterUserBinding mBinding;

        public UserViewHolder(AdapterUserBinding binding) {
            super(binding.getRoot());
        }

        public void bindTo(User user) {
            mBinding.setUser(user);
            mBinding.executePendingBindings();
        }

//        public UserViewHolder(View itemView) {
//            super(itemView);
//        }
    }

}
