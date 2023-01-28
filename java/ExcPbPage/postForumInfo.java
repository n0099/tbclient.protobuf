package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class postForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_MEMBER_COUNT = integer;
  }
  
  public postForumInfo(Builder paramBuilder, boolean paramBoolean) {
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
      Integer integer1 = paramBuilder.is_like;
      if (integer1 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer1;
      } 
      integer = paramBuilder.member_count;
      if (integer == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.is_like = ((Builder)integer).is_like;
      this.member_count = ((Builder)integer).member_count;
    } 
  }
  
  public postForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<postForumInfo> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_like;
    
    public Integer member_count;
    
    public Builder() {}
    
    public Builder(postForumInfo param1postForumInfo) {
      super(param1postForumInfo);
      if (param1postForumInfo == null)
        return; 
      this.forum_id = param1postForumInfo.forum_id;
      this.forum_name = param1postForumInfo.forum_name;
      this.avatar = param1postForumInfo.avatar;
      this.is_like = param1postForumInfo.is_like;
      this.member_count = param1postForumInfo.member_count;
    }
    
    public postForumInfo build(boolean param1Boolean) {
      return new postForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
