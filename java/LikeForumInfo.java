package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LikeForumInfo extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_name;
  
  public LikeForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
    } else {
      this.forum_name = ((Builder)long_).forum_name;
      this.forum_id = ((Builder)long_).forum_id;
    } 
  }
  
  public LikeForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LikeForumInfo> {
    public Long forum_id;
    
    public String forum_name;
    
    public Builder() {}
    
    public Builder(LikeForumInfo param1LikeForumInfo) {
      super(param1LikeForumInfo);
      if (param1LikeForumInfo == null)
        return; 
      this.forum_name = param1LikeForumInfo.forum_name;
      this.forum_id = param1LikeForumInfo.forum_id;
    }
    
    public LikeForumInfo build(boolean param1Boolean) {
      return new LikeForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
