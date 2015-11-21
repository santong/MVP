package me.santong.mvp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.santong.mvp.model.ImpMessageData;
import me.santong.mvp.presenter.Contact;
import me.santong.mvp.R;
import me.santong.mvp.model.Message;
import me.santong.mvp.presenter.Presenter;

/**
 * Created by santong.
 * At 15/11/19 18:53
 */
public class MessageFragment extends Fragment implements Contact.View  {

    private Contact.UserListener userListener;

    private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);

        userListener = new Presenter(this, new ImpMessageData());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_message, container, false);
        tv = (TextView) root.findViewById(R.id.tv_show);

        return root;
    }

    @Override
    public void showMessage(Message message) {
        tv.setText(message.getText());
    }
}
