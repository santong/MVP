package me.santong.mvp.model;

import android.support.annotation.NonNull;

import java.util.Map;

/**
 * Created by santong.
 * At 15/11/21 15:44
 */
public interface MessageRepository {
    Map<Integer, Message> getMessages();

    Message getMessage(int id);

    void saveMessage(@NonNull Message message);
}
