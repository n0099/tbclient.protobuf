package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadUser extends Message {
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 2)
  public final User user_info;
  
  public ThreadUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.user_info = paramBuilder.user_info;
    } else {
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.user_info = paramBuilder.user_info;
    } 
  }
  
  public ThreadUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadUser> {
    public List<ThreadInfo> thread_list;
    
    public User user_info;
    
    public Builder() {}
    
    public Builder(ThreadUser param1ThreadUser) {
      super(param1ThreadUser);
      if (param1ThreadUser == null)
        return; 
      this.thread_list = Message.copyOf(param1ThreadUser.thread_list);
      this.user_info = param1ThreadUser.user_info;
    }
    
    public ThreadUser build(boolean param1Boolean) {
      return new ThreadUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
