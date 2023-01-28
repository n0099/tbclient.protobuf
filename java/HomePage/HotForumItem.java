package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotForumItem extends Message {
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKED = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_liked;
  
  public HotForumItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.forum_avatar;
      if (str == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str;
      } 
      integer = paramBuilder.is_liked;
      if (integer == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.forum_avatar = ((Builder)integer).forum_avatar;
      this.is_liked = ((Builder)integer).is_liked;
    } 
  }
  
  public HotForumItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotForumItem> {
    public String forum_avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_liked;
    
    public Builder() {}
    
    public Builder(HotForumItem param1HotForumItem) {
      super(param1HotForumItem);
      if (param1HotForumItem == null)
        return; 
      this.forum_id = param1HotForumItem.forum_id;
      this.forum_name = param1HotForumItem.forum_name;
      this.forum_avatar = param1HotForumItem.forum_avatar;
      this.is_liked = param1HotForumItem.is_liked;
    }
    
    public HotForumItem build(boolean param1Boolean) {
      return new HotForumItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
