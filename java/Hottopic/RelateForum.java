package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RelateForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thread_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FORUM_ID = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_LIKED = integer;
  }
  
  public RelateForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.forum_id;
      if (integer2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer2;
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
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      Integer integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer1 = paramBuilder.thread_num;
      if (integer1 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
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
      this.avatar = ((Builder)integer).avatar;
      this.desc = ((Builder)integer).desc;
      this.member_num = ((Builder)integer).member_num;
      this.thread_num = ((Builder)integer).thread_num;
      this.post_num = ((Builder)integer).post_num;
      this.is_liked = ((Builder)integer).is_liked;
    } 
  }
  
  public RelateForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RelateForum> {
    public String avatar;
    
    public String desc;
    
    public Integer forum_id;
    
    public String forum_name;
    
    public Integer is_liked;
    
    public Integer member_num;
    
    public Integer post_num;
    
    public Integer thread_num;
    
    public Builder() {}
    
    public Builder(RelateForum param1RelateForum) {
      super(param1RelateForum);
      if (param1RelateForum == null)
        return; 
      this.forum_id = param1RelateForum.forum_id;
      this.forum_name = param1RelateForum.forum_name;
      this.avatar = param1RelateForum.avatar;
      this.desc = param1RelateForum.desc;
      this.member_num = param1RelateForum.member_num;
      this.thread_num = param1RelateForum.thread_num;
      this.post_num = param1RelateForum.post_num;
      this.is_liked = param1RelateForum.is_liked;
    }
    
    public RelateForum build(boolean param1Boolean) {
      return new RelateForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
