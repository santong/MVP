package me.santong.mvp.model;

/**
 * Created by santong.
 * At 15/11/19 17:17
 */
public class Message {
    private int id;         // 信息ID
    private String text;    // 信息内容

    public Message() {
    }

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
