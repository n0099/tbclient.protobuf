package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserDynamic extends Message {
  public static final List<User> DEFAULT_CONCERNED_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> concerned_user_list;
  
  public UserDynamic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      list = paramBuilder.concerned_user_list;
      if (list == null) {
        this.concerned_user_list = DEFAULT_CONCERNED_USER_LIST;
      } else {
        this.concerned_user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.concerned_user_list = Message.immutableCopyOf(((Builder)list).concerned_user_list);
    } 
  }
  
  public UserDynamic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserDynamic> {
    public List<User> concerned_user_list;
    
    public Builder() {}
    
    public Builder(UserDynamic param1UserDynamic) {
      super(param1UserDynamic);
      if (param1UserDynamic == null)
        return; 
      this.concerned_user_list = Message.copyOf(param1UserDynamic.concerned_user_list);
    }
    
    public UserDynamic build(boolean param1Boolean) {
      return new UserDynamic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
