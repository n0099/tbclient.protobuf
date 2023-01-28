package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserStory extends Message {
  public static final Integer DEFAULT_HAS_READ;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer has_read;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_HAS_READ = Integer.valueOf(0);
  }
  
  public UserStory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
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
      integer = paramBuilder.has_read;
      if (integer == null) {
        this.has_read = DEFAULT_HAS_READ;
      } else {
        this.has_read = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.portrait = ((Builder)integer).portrait;
      this.has_read = ((Builder)integer).has_read;
    } 
  }
  
  public UserStory(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserStory> {
    public Integer has_read;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(UserStory param1UserStory) {
      super(param1UserStory);
      if (param1UserStory == null)
        return; 
      this.user_id = param1UserStory.user_id;
      this.user_name = param1UserStory.user_name;
      this.portrait = param1UserStory.portrait;
      this.has_read = param1UserStory.has_read;
    }
    
    public UserStory build(boolean param1Boolean) {
      return new UserStory(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
