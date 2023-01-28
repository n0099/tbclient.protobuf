package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SimpleUser extends Message {
  public static final Integer DEFAULT_AGREE_TYPE;
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_BLOCK_MSG = "";
  
  public static final Integer DEFAULT_INCOMPLETE_USER;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SECUREEMAIL = "";
  
  public static final String DEFAULT_SECUREMOBIL = "";
  
  public static final Integer DEFAULT_SHOW_ONLYME;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_NICKNAME = "";
  
  public static final Integer DEFAULT_USER_STATUS;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer agree_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String block_msg;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer incomplete_user;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String secureemail;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String securemobil;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer show_onlyme;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String user_nickname;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer user_status;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_STATUS = integer;
    DEFAULT_INCOMPLETE_USER = integer;
    DEFAULT_AGREE_TYPE = integer;
    DEFAULT_SHOW_ONLYME = integer;
  }
  
  public SimpleUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer3 = paramBuilder.user_status;
      if (integer3 == null) {
        this.user_status = DEFAULT_USER_STATUS;
      } else {
        this.user_status = integer3;
      } 
      String str3 = paramBuilder.secureemail;
      if (str3 == null) {
        this.secureemail = "";
      } else {
        this.secureemail = str3;
      } 
      str3 = paramBuilder.securemobil;
      if (str3 == null) {
        this.securemobil = "";
      } else {
        this.securemobil = str3;
      } 
      str3 = paramBuilder.user_name;
      if (str3 == null) {
        this.user_name = "";
      } else {
        this.user_name = str3;
      } 
      str3 = paramBuilder.user_nickname;
      if (str3 == null) {
        this.user_nickname = "";
      } else {
        this.user_nickname = str3;
      } 
      Integer integer2 = paramBuilder.incomplete_user;
      if (integer2 == null) {
        this.incomplete_user = DEFAULT_INCOMPLETE_USER;
      } else {
        this.incomplete_user = integer2;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Integer integer1 = paramBuilder.agree_type;
      if (integer1 == null) {
        this.agree_type = DEFAULT_AGREE_TYPE;
      } else {
        this.agree_type = integer1;
      } 
      String str1 = paramBuilder.ahead_url;
      if (str1 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str1;
      } 
      str1 = paramBuilder.block_msg;
      if (str1 == null) {
        this.block_msg = "";
      } else {
        this.block_msg = str1;
      } 
      integer = paramBuilder.show_onlyme;
      if (integer == null) {
        this.show_onlyme = DEFAULT_SHOW_ONLYME;
      } else {
        this.show_onlyme = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_status = ((Builder)integer).user_status;
      this.secureemail = ((Builder)integer).secureemail;
      this.securemobil = ((Builder)integer).securemobil;
      this.user_name = ((Builder)integer).user_name;
      this.user_nickname = ((Builder)integer).user_nickname;
      this.incomplete_user = ((Builder)integer).incomplete_user;
      this.portrait = ((Builder)integer).portrait;
      this.agree_type = ((Builder)integer).agree_type;
      this.ahead_url = ((Builder)integer).ahead_url;
      this.block_msg = ((Builder)integer).block_msg;
      this.show_onlyme = ((Builder)integer).show_onlyme;
    } 
  }
  
  public SimpleUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SimpleUser> {
    public Integer agree_type;
    
    public String ahead_url;
    
    public String block_msg;
    
    public Integer incomplete_user;
    
    public String portrait;
    
    public String secureemail;
    
    public String securemobil;
    
    public Integer show_onlyme;
    
    public Long user_id;
    
    public String user_name;
    
    public String user_nickname;
    
    public Integer user_status;
    
    public Builder() {}
    
    public Builder(SimpleUser param1SimpleUser) {
      super(param1SimpleUser);
      if (param1SimpleUser == null)
        return; 
      this.user_id = param1SimpleUser.user_id;
      this.user_status = param1SimpleUser.user_status;
      this.secureemail = param1SimpleUser.secureemail;
      this.securemobil = param1SimpleUser.securemobil;
      this.user_name = param1SimpleUser.user_name;
      this.user_nickname = param1SimpleUser.user_nickname;
      this.incomplete_user = param1SimpleUser.incomplete_user;
      this.portrait = param1SimpleUser.portrait;
      this.agree_type = param1SimpleUser.agree_type;
      this.ahead_url = param1SimpleUser.ahead_url;
      this.block_msg = param1SimpleUser.block_msg;
      this.show_onlyme = param1SimpleUser.show_onlyme;
    }
    
    public SimpleUser build(boolean param1Boolean) {
      return new SimpleUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
