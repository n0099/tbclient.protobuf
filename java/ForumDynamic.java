package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumDynamic extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final Integer DEFAULT_THREAD_COUNT;
  
  public static final Integer DEFAULT_USER_THREAD_COUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer thread_count;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer user_thread_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_THREAD_COUNT = integer;
    DEFAULT_USER_THREAD_COUNT = integer;
  }
  
  public ForumDynamic(Builder paramBuilder, boolean paramBoolean) {
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
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.slogan;
      if (str == null) {
        this.slogan = "";
      } else {
        this.slogan = str;
      } 
      Integer integer1 = paramBuilder.is_like;
      if (integer1 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer1;
      } 
      integer1 = paramBuilder.member_count;
      if (integer1 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer1;
      } 
      integer1 = paramBuilder.thread_count;
      if (integer1 == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = integer1;
      } 
      integer = paramBuilder.user_thread_count;
      if (integer == null) {
        this.user_thread_count = DEFAULT_USER_THREAD_COUNT;
      } else {
        this.user_thread_count = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.slogan = ((Builder)integer).slogan;
      this.is_like = ((Builder)integer).is_like;
      this.member_count = ((Builder)integer).member_count;
      this.thread_count = ((Builder)integer).thread_count;
      this.user_thread_count = ((Builder)integer).user_thread_count;
    } 
  }
  
  public ForumDynamic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumDynamic> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_like;
    
    public Integer member_count;
    
    public String slogan;
    
    public Integer thread_count;
    
    public Integer user_thread_count;
    
    public Builder() {}
    
    public Builder(ForumDynamic param1ForumDynamic) {
      super(param1ForumDynamic);
      if (param1ForumDynamic == null)
        return; 
      this.forum_id = param1ForumDynamic.forum_id;
      this.forum_name = param1ForumDynamic.forum_name;
      this.avatar = param1ForumDynamic.avatar;
      this.slogan = param1ForumDynamic.slogan;
      this.is_like = param1ForumDynamic.is_like;
      this.member_count = param1ForumDynamic.member_count;
      this.thread_count = param1ForumDynamic.thread_count;
      this.user_thread_count = param1ForumDynamic.user_thread_count;
    }
    
    public ForumDynamic build(boolean param1Boolean) {
      return new ForumDynamic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
