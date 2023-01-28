package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomInfoBasic extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_UNREAD_NUM = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String unread_num;
  
  public ChatroomInfoBasic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.unread_num;
      if (str == null) {
        this.unread_num = "";
      } else {
        this.unread_num = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
      this.name = ((Builder)str).name;
      this.unread_num = ((Builder)str).unread_num;
    } 
  }
  
  public ChatroomInfoBasic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomInfoBasic> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String name;
    
    public String unread_num;
    
    public Builder() {}
    
    public Builder(ChatroomInfoBasic param1ChatroomInfoBasic) {
      super(param1ChatroomInfoBasic);
      if (param1ChatroomInfoBasic == null)
        return; 
      this.forum_id = param1ChatroomInfoBasic.forum_id;
      this.forum_name = param1ChatroomInfoBasic.forum_name;
      this.avatar = param1ChatroomInfoBasic.avatar;
      this.name = param1ChatroomInfoBasic.name;
      this.unread_num = param1ChatroomInfoBasic.unread_num;
    }
    
    public ChatroomInfoBasic build(boolean param1Boolean) {
      return new ChatroomInfoBasic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
