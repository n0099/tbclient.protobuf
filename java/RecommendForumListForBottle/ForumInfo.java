package tbclient.RecommendForumListForBottle;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Long DEFAULT_MEMBER_COUNT;
  
  public static final Long DEFAULT_THREAD_COUNT;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long member_count;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long thread_count;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_MEMBER_COUNT = long_;
    DEFAULT_THREAD_COUNT = long_;
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      Long long_1 = paramBuilder.member_count;
      if (long_1 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = long_1;
      } 
      long_ = paramBuilder.thread_count;
      if (long_ == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = long_;
      } 
    } else {
      this.avatar = ((Builder)long_).avatar;
      this.forum_id = ((Builder)long_).forum_id;
      this.forum_name = ((Builder)long_).forum_name;
      this.member_count = ((Builder)long_).member_count;
      this.thread_count = ((Builder)long_).thread_count;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Long member_count;
    
    public Long thread_count;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.avatar = param1ForumInfo.avatar;
      this.forum_id = param1ForumInfo.forum_id;
      this.forum_name = param1ForumInfo.forum_name;
      this.member_count = param1ForumInfo.member_count;
      this.thread_count = param1ForumInfo.thread_count;
    }
    
    public ForumInfo build(boolean param1Boolean) {
      return new ForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
