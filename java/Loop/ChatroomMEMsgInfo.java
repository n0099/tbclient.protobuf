package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomMEMsgInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_FROM_NAME = "";
  
  public static final Long DEFAULT_FROM_UID;
  
  public static final Long DEFAULT_MSG_ID;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String from_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long from_uid;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long msg_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FROM_UID = long_;
    DEFAULT_MSG_ID = long_;
  }
  
  public ChatroomMEMsgInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.from_uid;
      if (long_1 == null) {
        this.from_uid = DEFAULT_FROM_UID;
      } else {
        this.from_uid = long_1;
      } 
      String str = paramBuilder.from_name;
      if (str == null) {
        this.from_name = "";
      } else {
        this.from_name = str;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      long_ = paramBuilder.msg_id;
      if (long_ == null) {
        this.msg_id = DEFAULT_MSG_ID;
      } else {
        this.msg_id = long_;
      } 
    } else {
      this.from_uid = ((Builder)long_).from_uid;
      this.from_name = ((Builder)long_).from_name;
      this.content = ((Builder)long_).content;
      this.msg_id = ((Builder)long_).msg_id;
    } 
  }
  
  public ChatroomMEMsgInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomMEMsgInfo> {
    public String content;
    
    public String from_name;
    
    public Long from_uid;
    
    public Long msg_id;
    
    public Builder() {}
    
    public Builder(ChatroomMEMsgInfo param1ChatroomMEMsgInfo) {
      super(param1ChatroomMEMsgInfo);
      if (param1ChatroomMEMsgInfo == null)
        return; 
      this.from_uid = param1ChatroomMEMsgInfo.from_uid;
      this.from_name = param1ChatroomMEMsgInfo.from_name;
      this.content = param1ChatroomMEMsgInfo.content;
      this.msg_id = param1ChatroomMEMsgInfo.msg_id;
    }
    
    public ChatroomMEMsgInfo build(boolean param1Boolean) {
      return new ChatroomMEMsgInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
