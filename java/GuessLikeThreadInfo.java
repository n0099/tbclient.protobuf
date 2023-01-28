package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GuessLikeThreadInfo extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_RECOM_COVER = "";
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final Long DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String recom_cover;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long reply_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_REPLY_NUM = long_;
  }
  
  public GuessLikeThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.forum_id;
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
      Long long_1 = paramBuilder.reply_num;
      if (long_1 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = long_1;
      } 
      String str1 = paramBuilder.recom_cover;
      if (str1 == null) {
        this.recom_cover = "";
      } else {
        this.recom_cover = str1;
      } 
      str1 = paramBuilder.recom_reason;
      if (str1 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.reply_num = ((Builder)str).reply_num;
      this.recom_cover = ((Builder)str).recom_cover;
      this.recom_reason = ((Builder)str).recom_reason;
      this.title = ((Builder)str).title;
    } 
  }
  
  public GuessLikeThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GuessLikeThreadInfo> {
    public Long forum_id;
    
    public String forum_name;
    
    public String recom_cover;
    
    public String recom_reason;
    
    public Long reply_num;
    
    public Long thread_id;
    
    public String title;
    
    public Builder() {}
    
    public Builder(GuessLikeThreadInfo param1GuessLikeThreadInfo) {
      super(param1GuessLikeThreadInfo);
      if (param1GuessLikeThreadInfo == null)
        return; 
      this.thread_id = param1GuessLikeThreadInfo.thread_id;
      this.forum_id = param1GuessLikeThreadInfo.forum_id;
      this.forum_name = param1GuessLikeThreadInfo.forum_name;
      this.reply_num = param1GuessLikeThreadInfo.reply_num;
      this.recom_cover = param1GuessLikeThreadInfo.recom_cover;
      this.recom_reason = param1GuessLikeThreadInfo.recom_reason;
      this.title = param1GuessLikeThreadInfo.title;
    }
    
    public GuessLikeThreadInfo build(boolean param1Boolean) {
      return new GuessLikeThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
