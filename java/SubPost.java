package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SubPost extends Message {
  public static final Long DEFAULT_PID = Long.valueOf(0L);
  
  public static final List<SubPostList> DEFAULT_SUB_POST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SubPostList> sub_post_list;
  
  public SubPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SubPostList> list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.pid;
      if (long_ == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_;
      } 
      list = paramBuilder.sub_post_list;
      if (list == null) {
        this.sub_post_list = DEFAULT_SUB_POST_LIST;
      } else {
        this.sub_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.pid = ((Builder)list).pid;
      this.sub_post_list = Message.immutableCopyOf(((Builder)list).sub_post_list);
    } 
  }
  
  public SubPost(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SubPost> {
    public Long pid;
    
    public List<SubPostList> sub_post_list;
    
    public Builder() {}
    
    public Builder(SubPost param1SubPost) {
      super(param1SubPost);
      if (param1SubPost == null)
        return; 
      this.pid = param1SubPost.pid;
      this.sub_post_list = Message.copyOf(param1SubPost.sub_post_list);
    }
    
    public SubPost build(boolean param1Boolean) {
      return new SubPost(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
