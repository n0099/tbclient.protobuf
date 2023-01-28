package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class friendInfo extends Message {
  public static final String DEFAULT_KEY = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_QUANPIN = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String quanpin;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public friendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.quanpin;
      if (str1 == null) {
        this.quanpin = "";
      } else {
        this.quanpin = str1;
      } 
      str = paramBuilder.key;
      if (str == null) {
        this.key = "";
      } else {
        this.key = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.quanpin = ((Builder)str).quanpin;
      this.key = ((Builder)str).key;
    } 
  }
  
  public friendInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<friendInfo> {
    public String key;
    
    public String portrait;
    
    public String quanpin;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(friendInfo param1friendInfo) {
      super(param1friendInfo);
      if (param1friendInfo == null)
        return; 
      this.portrait = param1friendInfo.portrait;
      this.user_name = param1friendInfo.user_name;
      this.user_id = param1friendInfo.user_id;
      this.quanpin = param1friendInfo.quanpin;
      this.key = param1friendInfo.key;
    }
    
    public friendInfo build(boolean param1Boolean) {
      return new friendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
