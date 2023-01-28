package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class JoinUser extends Message {
  public static final List<UserInfo> DEFAULT_JOIN_USER = Collections.emptyList();
  
  public static final Long DEFAULT_JOIN_USER_NUM = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<UserInfo> join_user;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long join_user_num;
  
  public JoinUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List<UserInfo> list = paramBuilder.join_user;
      if (list == null) {
        this.join_user = DEFAULT_JOIN_USER;
      } else {
        this.join_user = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.join_user_num;
      if (long_ == null) {
        this.join_user_num = DEFAULT_JOIN_USER_NUM;
      } else {
        this.join_user_num = long_;
      } 
    } else {
      this.join_user = Message.immutableCopyOf(((Builder)long_).join_user);
      this.join_user_num = ((Builder)long_).join_user_num;
    } 
  }
  
  public JoinUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<JoinUser> {
    public List<UserInfo> join_user;
    
    public Long join_user_num;
    
    public Builder() {}
    
    public Builder(JoinUser param1JoinUser) {
      super(param1JoinUser);
      if (param1JoinUser == null)
        return; 
      this.join_user = Message.copyOf(param1JoinUser.join_user);
      this.join_user_num = param1JoinUser.join_user_num;
    }
    
    public JoinUser build(boolean param1Boolean) {
      return new JoinUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
