package me.santong.mvp.presenter;


import me.santong.mvp.model.Message;
import me.santong.mvp.model.MessageRepository;

/**
 * Created by santong.
 * At 15/11/19 17:10
 */
public class Presenter implements Contact.UserListener {

    private Contact.View mView;

    private MessageRepository mdata;


    public Presenter(Contact.View view, MessageRepository messageRepository) {
        mView = view;
        mdata = messageRepository;
        onBindData();
    }

    private void onBindData() {
        Message message = mdata.getMessage(0);
        setMessage(message);
    }

    @Override
    public void setMessage(Message message) {
        mView.showMessage(message);
    }
}
