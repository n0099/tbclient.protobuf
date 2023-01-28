package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumSquareRecommendForumInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE = Integer.valueOf(0);
  
  public static final Long DEFAULT_MEMBER_COUNT;
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final Long DEFAULT_THREAD_COUNT;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long member_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recommend_reason;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long thread_count;
  
  static {
    DEFAULT_MEMBER_COUNT = long_;
    DEFAULT_THREAD_COUNT = long_;
  }
  
  public ForumSquareRecommendForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.recommend_reason;
      if (str2 == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str2;
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
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      Integer integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
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
      this.recommend_reason = ((Builder)long_).recommend_reason;
      this.forum_id = ((Builder)long_).forum_id;
      this.forum_name = ((Builder)long_).forum_name;
      this.avatar = ((Builder)long_).avatar;
      this._abstract = ((Builder)long_)._abstract;
      this.is_like = ((Builder)long_).is_like;
      this.member_count = ((Builder)long_).member_count;
      this.thread_count = ((Builder)long_).thread_count;
    } 
  }
  
  public ForumSquareRecommendForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<ForumSquareRecommendForumInfo> {
    public String _abstract;
    
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_like;
    
    public Long member_count;
    
    public String recommend_reason;
    
    public Long thread_count;
    
    public Builder() {}
    
    public Builder(ForumSquareRecommendForumInfo param1ForumSquareRecommendForumInfo) {
      super(param1ForumSquareRecommendForumInfo);
      if (param1ForumSquareRecommendForumInfo == null)
        return; 
      this.recommend_reason = param1ForumSquareRecommendForumInfo.recommend_reason;
      this.forum_id = param1ForumSquareRecommendForumInfo.forum_id;
      this.forum_name = param1ForumSquareRecommendForumInfo.forum_name;
      this.avatar = param1ForumSquareRecommendForumInfo.avatar;
      this._abstract = param1ForumSquareRecommendForumInfo._abstract;
      this.is_like = param1ForumSquareRecommendForumInfo.is_like;
      this.member_count = param1ForumSquareRecommendForumInfo.member_count;
      this.thread_count = param1ForumSquareRecommendForumInfo.thread_count;
    }
    
    public ForumSquareRecommendForumInfo build(boolean param1Boolean) {
      return new ForumSquareRecommendForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
