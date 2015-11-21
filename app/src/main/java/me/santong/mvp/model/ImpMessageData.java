package me.santong.mvp.model;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by santong.
 * At 15/11/21 15:49
 */
public class ImpMessageData implements MessageRepository {

    private final static Message MESSAGE = new Message(0, "Hello world!");  // 模拟一条信息

    private static Map<Integer, Message> messageMap = new HashMap<>();

    public ImpMessageData() {
        messageMap.put(MESSAGE.getId(), MESSAGE);
    }

    @Override
    public Map<Integer, Message> getMessages() {
        return messageMap;
    }

    @Override
    public Message getMessage(int id) {
        return messageMap.get(id);
    }

    @Override
    public void saveMessage(@NonNull Message message) {
        messageMap.put(message.getId(), message);
    }
}
