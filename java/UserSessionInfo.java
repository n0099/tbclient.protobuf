package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserSessionInfo extends Message {
  public static final String DEFAULT_BDUSS = "";
  
  public static final String DEFAULT_EMAIL = "";
  
  public static final String DEFAULT_MOBILE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bduss;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String email;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String mobile;
  
  public UserSessionInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.bduss;
      if (str1 == null) {
        this.bduss = "";
      } else {
        this.bduss = str1;
      } 
      str1 = paramBuilder.mobile;
      if (str1 == null) {
        this.mobile = "";
      } else {
        this.mobile = str1;
      } 
      str = paramBuilder.email;
      if (str == null) {
        this.email = "";
      } else {
        this.email = str;
      } 
    } else {
      this.bduss = ((Builder)str).bduss;
      this.mobile = ((Builder)str).mobile;
      this.email = ((Builder)str).email;
    } 
  }
  
  public UserSessionInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserSessionInfo> {
    public String bduss;
    
    public String email;
    
    public String mobile;
    
    public Builder() {}
    
    public Builder(UserSessionInfo param1UserSessionInfo) {
      super(param1UserSessionInfo);
      if (param1UserSessionInfo == null)
        return; 
      this.bduss = param1UserSessionInfo.bduss;
      this.mobile = param1UserSessionInfo.mobile;
      this.email = param1UserSessionInfo.email;
    }
    
    public UserSessionInfo build(boolean param1Boolean) {
      return new UserSessionInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
