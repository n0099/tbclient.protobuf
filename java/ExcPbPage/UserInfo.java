package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfo extends Message {
  public static final Long DEFAULT_GENDER;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long gender;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_GENDER = long_;
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.id;
      if (long_1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.gender;
      if (long_ == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.name = ((Builder)long_).name;
      this.portrait = ((Builder)long_).portrait;
      this.gender = ((Builder)long_).gender;
    } 
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserInfo> {
    public Long gender;
    
    public Long id;
    
    public String name;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(UserInfo param1UserInfo) {
      super(param1UserInfo);
      if (param1UserInfo == null)
        return; 
      this.id = param1UserInfo.id;
      this.name = param1UserInfo.name;
      this.portrait = param1UserInfo.portrait;
      this.gender = param1UserInfo.gender;
    }
    
    public UserInfo build(boolean param1Boolean) {
      return new UserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
