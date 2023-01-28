package tbclient.SearchFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class userInfo extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public userInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.portrait = ((Builder)long_).portrait;
      this.user_name = ((Builder)long_).user_name;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
  
  public userInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<userInfo> {
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(userInfo param1userInfo) {
      super(param1userInfo);
      if (param1userInfo == null)
        return; 
      this.portrait = param1userInfo.portrait;
      this.user_name = param1userInfo.user_name;
      this.user_id = param1userInfo.user_id;
    }
    
    public userInfo build(boolean param1Boolean) {
      return new userInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
