package zhufengfm.jmxgrobby.com.zhufengfm.fragment.discover;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhufengfm.jmxgrobby.com.zhufengfm.R;
import zhufengfm.jmxgrobby.com.zhufengfm.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverRatingFragment extends BaseFragment {


    public DiscoverRatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover_rating, container, false);
    }


    @Override
    public String getFragmentTitle() {
        return "榜单";
    }
}
