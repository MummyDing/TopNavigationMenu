package com.demo.mummyding.topnavigationmenu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.mummyding.topnavigationmenu.R;

/**
 * Created by mummyding on 15-11-8.
 */
public class BlankFragment extends Fragment {
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View parentView = View.inflate(getActivity(),R.layout.layout_fragment,null);
        textView = (TextView) parentView.findViewById(R.id.text);
        textView.setText(getArguments() == null? "error":getArguments().getString("pos"));
        return parentView;
    }
}
