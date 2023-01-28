package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MagicPost extends Message {
  public static final String DEFAULT_MAGIC_TITLE = "";
  
  public static final List<MagicPostList> DEFAULT_MC_POST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String magic_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<MagicPostList> mc_post_list;
  
  public MagicPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<MagicPostList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.magic_title;
      if (str == null) {
        this.magic_title = "";
      } else {
        this.magic_title = str;
      } 
      list = paramBuilder.mc_post_list;
      if (list == null) {
        this.mc_post_list = DEFAULT_MC_POST_LIST;
      } else {
        this.mc_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.magic_title = ((Builder)list).magic_title;
      this.mc_post_list = Message.immutableCopyOf(((Builder)list).mc_post_list);
    } 
  }
  
  public MagicPost(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MagicPost> {
    public String magic_title;
    
    public List<MagicPostList> mc_post_list;
    
    public Builder() {}
    
    public Builder(MagicPost param1MagicPost) {
      super(param1MagicPost);
      if (param1MagicPost == null)
        return; 
      this.magic_title = param1MagicPost.magic_title;
      this.mc_post_list = Message.copyOf(param1MagicPost.mc_post_list);
    }
    
    public MagicPost build(boolean param1Boolean) {
      return new MagicPost(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
