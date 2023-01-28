package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadRecommendInfo extends Message {
  public static final String DEFAULT_BUSINESS_ID = "";
  
  public static final Integer DEFAULT_BUSINESS_TYPE;
  
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_JUMP_ICON = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_JUMP_TEXT = "";
  
  public static final String DEFAULT_RECOMMEND_ICON = "";
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final String DEFAULT_RECOMMEND_TAIL = "";
  
  public static final String DEFAULT_RECOMMEND_TYPE = "";
  
  public static final Integer DEFAULT_SHOW_NUM;
  
  public static final String DEFAULT_SHOW_TYPE = "";
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 13)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String business_id;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer business_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String jump_icon;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String jump_text;
  
  @ProtoField(tag = 19)
  public final ThemeColorInfo jump_text_color;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String recommend_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String recommend_reason;
  
  @ProtoField(tag = 11)
  public final ThemeColorInfo recommend_reason_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String recommend_tail;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String recommend_type;
  
  @ProtoField(tag = 10)
  public final ThemeColorInfo recommend_type_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer show_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_type;
  
  @ProtoField(tag = 12)
  public final ThemeColorInfo strip_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  static {
    DEFAULT_BUSINESS_TYPE = integer;
  }
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str4 = paramBuilder.forum_avatar;
      if (str4 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str4;
      } 
      str4 = paramBuilder.forum_name;
      if (str4 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str4;
      } 
      Integer integer2 = paramBuilder.show_num;
      if (integer2 == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer2;
      } 
      String str3 = paramBuilder.show_type;
      if (str3 == null) {
        this.show_type = "";
      } else {
        this.show_type = str3;
      } 
      str3 = paramBuilder.recommend_reason;
      if (str3 == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str3;
      } 
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str2 = paramBuilder.recommend_type;
      if (str2 == null) {
        this.recommend_type = "";
      } else {
        this.recommend_type = str2;
      } 
      str2 = paramBuilder.recommend_tail;
      if (str2 == null) {
        this.recommend_tail = "";
      } else {
        this.recommend_tail = str2;
      } 
      str2 = paramBuilder.recommend_icon;
      if (str2 == null) {
        this.recommend_icon = "";
      } else {
        this.recommend_icon = str2;
      } 
      this.recommend_type_color = paramBuilder.recommend_type_color;
      this.recommend_reason_color = paramBuilder.recommend_reason_color;
      this.strip_color = paramBuilder.strip_color;
      this.background_color = paramBuilder.background_color;
      str2 = paramBuilder.jump_link;
      if (str2 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str2;
      } 
      Integer integer1 = paramBuilder.business_type;
      if (integer1 == null) {
        this.business_type = DEFAULT_BUSINESS_TYPE;
      } else {
        this.business_type = integer1;
      } 
      String str1 = paramBuilder.business_id;
      if (str1 == null) {
        this.business_id = "";
      } else {
        this.business_id = str1;
      } 
      str1 = paramBuilder.jump_icon;
      if (str1 == null) {
        this.jump_icon = "";
      } else {
        this.jump_icon = str1;
      } 
      str1 = paramBuilder.jump_text;
      if (str1 == null) {
        this.jump_text = "";
      } else {
        this.jump_text = str1;
      } 
      this.jump_text_color = paramBuilder.jump_text_color;
    } else {
      this.forum_avatar = paramBuilder.forum_avatar;
      this.forum_name = paramBuilder.forum_name;
      this.show_num = paramBuilder.show_num;
      this.show_type = paramBuilder.show_type;
      this.recommend_reason = paramBuilder.recommend_reason;
      this.topic_id = paramBuilder.topic_id;
      this.recommend_type = paramBuilder.recommend_type;
      this.recommend_tail = paramBuilder.recommend_tail;
      this.recommend_icon = paramBuilder.recommend_icon;
      this.recommend_type_color = paramBuilder.recommend_type_color;
      this.recommend_reason_color = paramBuilder.recommend_reason_color;
      this.strip_color = paramBuilder.strip_color;
      this.background_color = paramBuilder.background_color;
      this.jump_link = paramBuilder.jump_link;
      this.business_type = paramBuilder.business_type;
      this.business_id = paramBuilder.business_id;
      this.jump_icon = paramBuilder.jump_icon;
      this.jump_text = paramBuilder.jump_text;
      this.jump_text_color = paramBuilder.jump_text_color;
    } 
  }
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_NUM = integer;
  }
  
  public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
    public ThemeColorInfo background_color;
    
    public String business_id;
    
    public Integer business_type;
    
    public String forum_avatar;
    
    public String forum_name;
    
    public String jump_icon;
    
    public String jump_link;
    
    public String jump_text;
    
    public ThemeColorInfo jump_text_color;
    
    public String recommend_icon;
    
    public String recommend_reason;
    
    public ThemeColorInfo recommend_reason_color;
    
    public String recommend_tail;
    
    public String recommend_type;
    
    public ThemeColorInfo recommend_type_color;
    
    public Integer show_num;
    
    public String show_type;
    
    public ThemeColorInfo strip_color;
    
    public Long topic_id;
    
    public Builder() {}
    
    public Builder(ThreadRecommendInfo param1ThreadRecommendInfo) {
      super(param1ThreadRecommendInfo);
      if (param1ThreadRecommendInfo == null)
        return; 
      this.forum_avatar = param1ThreadRecommendInfo.forum_avatar;
      this.forum_name = param1ThreadRecommendInfo.forum_name;
      this.show_num = param1ThreadRecommendInfo.show_num;
      this.show_type = param1ThreadRecommendInfo.show_type;
      this.recommend_reason = param1ThreadRecommendInfo.recommend_reason;
      this.topic_id = param1ThreadRecommendInfo.topic_id;
      this.recommend_type = param1ThreadRecommendInfo.recommend_type;
      this.recommend_tail = param1ThreadRecommendInfo.recommend_tail;
      this.recommend_icon = param1ThreadRecommendInfo.recommend_icon;
      this.recommend_type_color = param1ThreadRecommendInfo.recommend_type_color;
      this.recommend_reason_color = param1ThreadRecommendInfo.recommend_reason_color;
      this.strip_color = param1ThreadRecommendInfo.strip_color;
      this.background_color = param1ThreadRecommendInfo.background_color;
      this.jump_link = param1ThreadRecommendInfo.jump_link;
      this.business_type = param1ThreadRecommendInfo.business_type;
      this.business_id = param1ThreadRecommendInfo.business_id;
      this.jump_icon = param1ThreadRecommendInfo.jump_icon;
      this.jump_text = param1ThreadRecommendInfo.jump_text;
      this.jump_text_color = param1ThreadRecommendInfo.jump_text_color;
    }
    
    public ThreadRecommendInfo build(boolean param1Boolean) {
      return new ThreadRecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
