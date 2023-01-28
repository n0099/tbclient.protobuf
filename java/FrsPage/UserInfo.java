package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfo extends Message {
  public static final Integer DEFAULT_GENDER;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 7)
  public final ShowIcon tshow_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_GENDER = Integer.valueOf(0);
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
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
      Integer integer = paramBuilder.gender;
      if (integer == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer;
      } 
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      this.tshow_icon = paramBuilder.tshow_icon;
    } else {
      this.user_id = paramBuilder.user_id;
      this.portrait = paramBuilder.portrait;
      this.user_name = paramBuilder.user_name;
      this.gender = paramBuilder.gender;
      this.intro = paramBuilder.intro;
      this.tshow_icon = paramBuilder.tshow_icon;
    } 
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserInfo> {
    public Integer gender;
    
    public String intro;
    
    public String portrait;
    
    public ShowIcon tshow_icon;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(UserInfo param1UserInfo) {
      super(param1UserInfo);
      if (param1UserInfo == null)
        return; 
      this.user_id = param1UserInfo.user_id;
      this.portrait = param1UserInfo.portrait;
      this.user_name = param1UserInfo.user_name;
      this.gender = param1UserInfo.gender;
      this.intro = param1UserInfo.intro;
      this.tshow_icon = param1UserInfo.tshow_icon;
    }
    
    public UserInfo build(boolean param1Boolean) {
      return new UserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
