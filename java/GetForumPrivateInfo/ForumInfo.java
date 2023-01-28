package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_IS_HIDE = "";
  
  public static final Integer DEFAULT_LEVEL_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String is_hide;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      Integer integer = paramBuilder.level_id;
      if (integer == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer;
      } 
      str = paramBuilder.is_hide;
      if (str == null) {
        this.is_hide = "";
      } else {
        this.is_hide = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
      this.level_id = ((Builder)str).level_id;
      this.is_hide = ((Builder)str).is_hide;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String is_hide;
    
    public Integer level_id;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.forum_id = param1ForumInfo.forum_id;
      this.forum_name = param1ForumInfo.forum_name;
      this.avatar = param1ForumInfo.avatar;
      this.level_id = param1ForumInfo.level_id;
      this.is_hide = param1ForumInfo.is_hide;
    }
    
    public ForumInfo build(boolean param1Boolean) {
      return new ForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
