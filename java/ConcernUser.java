package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ConcernUser extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public ConcernUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.user_name = ((Builder)long_).user_name;
      this.portrait = ((Builder)long_).portrait;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
  
  public ConcernUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ConcernUser> {
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ConcernUser param1ConcernUser) {
      super(param1ConcernUser);
      if (param1ConcernUser == null)
        return; 
      this.user_name = param1ConcernUser.user_name;
      this.portrait = param1ConcernUser.portrait;
      this.user_id = param1ConcernUser.user_id;
    }
    
    public ConcernUser build(boolean param1Boolean) {
      return new ConcernUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
