package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_CHATROOM_ID;
  
  public static final String DEFAULT_CHATROOM_NEW_MSG = "";
  
  public static final String DEFAULT_DATA_TYPE = "";
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_UNIQ_ID = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long chatroom_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String chatroom_new_msg;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String data_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String uniq_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    DEFAULT_CHATROOM_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.data_type;
      if (str2 == null) {
        this.data_type = "";
      } else {
        this.data_type = str2;
      } 
      str2 = paramBuilder.chatroom_new_msg;
      if (str2 == null) {
        this.chatroom_new_msg = "";
      } else {
        this.chatroom_new_msg = str2;
      } 
      Long long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      long_ = paramBuilder.chatroom_id;
      if (long_ == null) {
        this.chatroom_id = DEFAULT_CHATROOM_ID;
      } else {
        this.chatroom_id = long_;
      } 
      String str1 = paramBuilder.uniq_id;
      if (str1 == null) {
        this.uniq_id = "";
      } else {
        this.uniq_id = str1;
      } 
      str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.data_type = ((Builder)str).data_type;
      this.chatroom_new_msg = ((Builder)str).chatroom_new_msg;
      this.fid = ((Builder)str).fid;
      this.chatroom_id = ((Builder)str).chatroom_id;
      this.uniq_id = ((Builder)str).uniq_id;
      this.forum_name = ((Builder)str).forum_name;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long chatroom_id;
    
    public String chatroom_new_msg;
    
    public CommonReq common;
    
    public String data_type;
    
    public Long fid;
    
    public String forum_name;
    
    public String uniq_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.data_type = param1DataReq.data_type;
      this.chatroom_new_msg = param1DataReq.chatroom_new_msg;
      this.fid = param1DataReq.fid;
      this.chatroom_id = param1DataReq.chatroom_id;
      this.uniq_id = param1DataReq.uniq_id;
      this.forum_name = param1DataReq.forum_name;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
