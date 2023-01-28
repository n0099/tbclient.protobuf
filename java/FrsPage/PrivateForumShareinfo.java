package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrivateForumShareinfo extends Message {
  public static final Integer DEFAULT_CREATE_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_MANAGER_PORTRAIT = "";
  
  public static final String DEFAULT_MANAGER_USER_NAME = "";
  
  public static final String DEFAULT_SHARE_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String manager_portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String manager_user_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String share_url;
  
  public PrivateForumShareinfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      String str1 = paramBuilder.share_url;
      if (str1 == null) {
        this.share_url = "";
      } else {
        this.share_url = str1;
      } 
      str1 = paramBuilder.manager_user_name;
      if (str1 == null) {
        this.manager_user_name = "";
      } else {
        this.manager_user_name = str1;
      } 
      str = paramBuilder.manager_portrait;
      if (str == null) {
        this.manager_portrait = "";
      } else {
        this.manager_portrait = str;
      } 
    } else {
      this.create_time = ((Builder)str).create_time;
      this.share_url = ((Builder)str).share_url;
      this.manager_user_name = ((Builder)str).manager_user_name;
      this.manager_portrait = ((Builder)str).manager_portrait;
    } 
  }
  
  public PrivateForumShareinfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PrivateForumShareinfo> {
    public Integer create_time;
    
    public String manager_portrait;
    
    public String manager_user_name;
    
    public String share_url;
    
    public Builder() {}
    
    public Builder(PrivateForumShareinfo param1PrivateForumShareinfo) {
      super(param1PrivateForumShareinfo);
      if (param1PrivateForumShareinfo == null)
        return; 
      this.create_time = param1PrivateForumShareinfo.create_time;
      this.share_url = param1PrivateForumShareinfo.share_url;
      this.manager_user_name = param1PrivateForumShareinfo.manager_user_name;
      this.manager_portrait = param1PrivateForumShareinfo.manager_portrait;
    }
    
    public PrivateForumShareinfo build(boolean param1Boolean) {
      return new PrivateForumShareinfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
