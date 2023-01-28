package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ActPost extends Message {
  public static final List<ActHot> DEFAULT_ACT_HOT = Collections.emptyList();
  
  public static final List<LinkInfo> DEFAULT_LINK_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LIST_HEAD = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ActHot> act_hot;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<LinkInfo> link_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String list_head;
  
  public ActPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LinkInfo> list;
    if (paramBoolean == true) {
      List<ActHot> list1 = paramBuilder.act_hot;
      if (list1 == null) {
        this.act_hot = DEFAULT_ACT_HOT;
      } else {
        this.act_hot = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.list_head;
      if (str == null) {
        this.list_head = "";
      } else {
        this.list_head = str;
      } 
      list = paramBuilder.link_info;
      if (list == null) {
        this.link_info = DEFAULT_LINK_INFO;
      } else {
        this.link_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.act_hot = Message.immutableCopyOf(((Builder)list).act_hot);
      this.list_head = ((Builder)list).list_head;
      this.link_info = Message.immutableCopyOf(((Builder)list).link_info);
    } 
  }
  
  public ActPost(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActPost> {
    public List<ActHot> act_hot;
    
    public List<LinkInfo> link_info;
    
    public String list_head;
    
    public Builder() {}
    
    public Builder(ActPost param1ActPost) {
      super(param1ActPost);
      if (param1ActPost == null)
        return; 
      this.act_hot = Message.copyOf(param1ActPost.act_hot);
      this.list_head = param1ActPost.list_head;
      this.link_info = Message.copyOf(param1ActPost.link_info);
    }
    
    public ActPost build(boolean param1Boolean) {
      return new ActPost(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
