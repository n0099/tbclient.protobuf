package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Post;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Post> post_list;
  
  @ProtoField(tag = 1)
  public final ExcellentPbThreadInfo thread_info;
  
  @ProtoField(tag = 4)
  public final UserInfo user_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      List<Post> list1 = paramBuilder.post_list;
      if (list1 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list1);
      } 
      List<User> list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      this.user_info = paramBuilder.user_info;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.user_info = paramBuilder.user_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<Post> post_list;
    
    public ExcellentPbThreadInfo thread_info;
    
    public UserInfo user_info;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_info = param1DataRes.thread_info;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.user_info = param1DataRes.user_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
