package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Integer DEFAULT_POS;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_REASON = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer member_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer pos;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String reason;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_POS = integer;
    DEFAULT_IS_LIKE = integer;
  }
  
  public FeedForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer2 = paramBuilder.member_count;
      if (integer2 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer2;
      } 
      integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.reason;
      if (str1 == null) {
        this.reason = "";
      } else {
        this.reason = str1;
      } 
      Integer integer1 = paramBuilder.pos;
      if (integer1 == null) {
        this.pos = DEFAULT_POS;
      } else {
        this.pos = integer1;
      } 
      integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.member_count = ((Builder)integer).member_count;
      this.post_num = ((Builder)integer).post_num;
      this.avatar = ((Builder)integer).avatar;
      this.reason = ((Builder)integer).reason;
      this.pos = ((Builder)integer).pos;
      this.is_like = ((Builder)integer).is_like;
    } 
  }
  
  public FeedForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeedForumInfo> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_like;
    
    public Integer member_count;
    
    public Integer pos;
    
    public Integer post_num;
    
    public String reason;
    
    public Builder() {}
    
    public Builder(FeedForumInfo param1FeedForumInfo) {
      super(param1FeedForumInfo);
      if (param1FeedForumInfo == null)
        return; 
      this.forum_id = param1FeedForumInfo.forum_id;
      this.forum_name = param1FeedForumInfo.forum_name;
      this.member_count = param1FeedForumInfo.member_count;
      this.post_num = param1FeedForumInfo.post_num;
      this.avatar = param1FeedForumInfo.avatar;
      this.reason = param1FeedForumInfo.reason;
      this.pos = param1FeedForumInfo.pos;
      this.is_like = param1FeedForumInfo.is_like;
    }
    
    public FeedForumInfo build(boolean param1Boolean) {
      return new FeedForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
