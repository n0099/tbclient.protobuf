package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumList extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT = Integer.valueOf(0);
  
  public static final Long DEFAULT_POST_NUM;
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final Long DEFAULT_THREAD_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer member_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long post_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long thread_num;
  
  static {
    DEFAULT_POST_NUM = long_;
    DEFAULT_THREAD_NUM = long_;
  }
  
  public ForumList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      Integer integer = paramBuilder.member_count;
      if (integer == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer;
      } 
      String str1 = paramBuilder.slogan;
      if (str1 == null) {
        this.slogan = "";
      } else {
        this.slogan = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      Long long_1 = paramBuilder.post_num;
      if (long_1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_1;
      } 
      long_ = paramBuilder.thread_num;
      if (long_ == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = long_;
      } 
    } else {
      this.forum_id = ((Builder)long_).forum_id;
      this.forum_name = ((Builder)long_).forum_name;
      this.avatar = ((Builder)long_).avatar;
      this.member_count = ((Builder)long_).member_count;
      this.slogan = ((Builder)long_).slogan;
      this.content = ((Builder)long_).content;
      this.post_num = ((Builder)long_).post_num;
      this.thread_num = ((Builder)long_).thread_num;
    } 
  }
  
  public ForumList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<ForumList> {
    public String avatar;
    
    public String content;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer member_count;
    
    public Long post_num;
    
    public String slogan;
    
    public Long thread_num;
    
    public Builder() {}
    
    public Builder(ForumList param1ForumList) {
      super(param1ForumList);
      if (param1ForumList == null)
        return; 
      this.forum_id = param1ForumList.forum_id;
      this.forum_name = param1ForumList.forum_name;
      this.avatar = param1ForumList.avatar;
      this.member_count = param1ForumList.member_count;
      this.slogan = param1ForumList.slogan;
      this.content = param1ForumList.content;
      this.post_num = param1ForumList.post_num;
      this.thread_num = param1ForumList.thread_num;
    }
    
    public ForumList build(boolean param1Boolean) {
      return new ForumList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
