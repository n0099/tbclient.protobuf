package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForcusUsers extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_USER_ID = long_;
  }
  
  public ForcusUsers(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public ForcusUsers(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForcusUsers> {
    public String portrait;
    
    public Long thread_id;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ForcusUsers param1ForcusUsers) {
      super(param1ForcusUsers);
      if (param1ForcusUsers == null)
        return; 
      this.thread_id = param1ForcusUsers.thread_id;
      this.user_name = param1ForcusUsers.user_name;
      this.user_id = param1ForcusUsers.user_id;
      this.portrait = param1ForcusUsers.portrait;
    }
    
    public ForcusUsers build(boolean param1Boolean) {
      return new ForcusUsers(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
