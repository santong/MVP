package me.santong.mvp.presenter;

import me.santong.mvp.model.Message;

/**
 * Created by santong.
 * At 15/11/19 17:09
 */
public interface Contact {

    interface View{
        void showMessage(Message message);
    }

    interface UserListener{
        void setMessage(Message message);
    }

}
