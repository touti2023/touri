package Day0603.qqcommon;

import java.io.Serializable;

//表示客户端和服务端通信时的消息对象
public class Message implements Serializable {
    private static final long serialVerionUID = 1L;//增强兼容性
    private String sender;
    private String getter;
    private String content;//信息内容
    private String sendTime;
    private String mesType;//消息类型[可以在接口定义]

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }
}
