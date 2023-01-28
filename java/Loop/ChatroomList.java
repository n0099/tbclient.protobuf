package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomList extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Long DEFAULT_ROOM_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 5)
  public final ChatRoomAtInfo at_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 3)
  public final ChatroomMEMsgInfo msg_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long room_id;
  
  @ProtoField(tag = 2)
  public final ChatroomInfoBasic room_info;
  
  public ChatroomList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.room_id;
      if (long_ == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_;
      } 
      this.room_info = paramBuilder.room_info;
      this.msg_info = paramBuilder.msg_info;
      String str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
      this.at_info = paramBuilder.at_info;
    } else {
      this.room_id = paramBuilder.room_id;
      this.room_info = paramBuilder.room_info;
      this.msg_info = paramBuilder.msg_info;
      this.jump_url = paramBuilder.jump_url;
      this.at_info = paramBuilder.at_info;
    } 
  }
  
  public ChatroomList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomList> {
    public ChatRoomAtInfo at_info;
    
    public String jump_url;
    
    public ChatroomMEMsgInfo msg_info;
    
    public Long room_id;
    
    public ChatroomInfoBasic room_info;
    
    public Builder() {}
    
    public Builder(ChatroomList param1ChatroomList) {
      super(param1ChatroomList);
      if (param1ChatroomList == null)
        return; 
      this.room_id = param1ChatroomList.room_id;
      this.room_info = param1ChatroomList.room_info;
      this.msg_info = param1ChatroomList.msg_info;
      this.jump_url = param1ChatroomList.jump_url;
      this.at_info = param1ChatroomList.at_info;
    }
    
    public ChatroomList build(boolean param1Boolean) {
      return new ChatroomList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
