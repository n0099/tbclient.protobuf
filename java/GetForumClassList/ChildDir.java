package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChildDir extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_EXPLAIN = "";
  
  public static final Long DEFAULT_FORUM_LID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Long DEFAULT_MEMBER_COUNT;
  
  public static final String DEFAULT_TAG = "";
  
  public static final Long DEFAULT_THREAD_NUM;
  
  public static final Long DEFAULT_TORDER;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String explain;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_lid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long member_count;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tag;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long thread_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long torder;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_LID = long_;
    DEFAULT_TORDER = long_;
    DEFAULT_MEMBER_COUNT = long_;
    DEFAULT_THREAD_NUM = long_;
  }
  
  public ChildDir(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.forum_lid;
      if (long_3 == null) {
        this.forum_lid = DEFAULT_FORUM_LID;
      } else {
        this.forum_lid = long_3;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Long long_2 = paramBuilder.torder;
      if (long_2 == null) {
        this.torder = DEFAULT_TORDER;
      } else {
        this.torder = long_2;
      } 
      String str1 = paramBuilder.explain;
      if (str1 == null) {
        this.explain = "";
      } else {
        this.explain = str1;
      } 
      str1 = paramBuilder.tag;
      if (str1 == null) {
        this.tag = "";
      } else {
        this.tag = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      Long long_1 = paramBuilder.member_count;
      if (long_1 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = long_1;
      } 
      long_ = paramBuilder.thread_num;
      if (long_ == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = long_;
      } 
    } else {
      this.forum_lid = ((Builder)long_).forum_lid;
      this.forum_name = ((Builder)long_).forum_name;
      this.torder = ((Builder)long_).torder;
      this.explain = ((Builder)long_).explain;
      this.tag = ((Builder)long_).tag;
      this.link = ((Builder)long_).link;
      this.avatar = ((Builder)long_).avatar;
      this.desc = ((Builder)long_).desc;
      this.member_count = ((Builder)long_).member_count;
      this.thread_num = ((Builder)long_).thread_num;
    } 
  }
  
  public ChildDir(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChildDir> {
    public String avatar;
    
    public String desc;
    
    public String explain;
    
    public Long forum_lid;
    
    public String forum_name;
    
    public String link;
    
    public Long member_count;
    
    public String tag;
    
    public Long thread_num;
    
    public Long torder;
    
    public Builder() {}
    
    public Builder(ChildDir param1ChildDir) {
      super(param1ChildDir);
      if (param1ChildDir == null)
        return; 
      this.forum_lid = param1ChildDir.forum_lid;
      this.forum_name = param1ChildDir.forum_name;
      this.torder = param1ChildDir.torder;
      this.explain = param1ChildDir.explain;
      this.tag = param1ChildDir.tag;
      this.link = param1ChildDir.link;
      this.avatar = param1ChildDir.avatar;
      this.desc = param1ChildDir.desc;
      this.member_count = param1ChildDir.member_count;
      this.thread_num = param1ChildDir.thread_num;
    }
    
    public ChildDir build(boolean param1Boolean) {
      return new ChildDir(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
