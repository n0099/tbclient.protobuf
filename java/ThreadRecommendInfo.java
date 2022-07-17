package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadRecommendInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_RECOMMEND_ICON = "";
  
  public static final String DEFAULT_RECOMMEND_REASON = "";
  
  public static final String DEFAULT_RECOMMEND_TAIL = "";
  
  public static final String DEFAULT_RECOMMEND_TYPE = "";
  
  public static final Integer DEFAULT_SHOW_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_SHOW_TYPE = "";
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 13)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String jump_link;
  
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
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.forum_avatar;
      if (str3 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str3;
      } 
      str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      Integer integer = paramBuilder.show_num;
      if (integer == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer;
      } 
      String str2 = paramBuilder.show_type;
      if (str2 == null) {
        this.show_type = "";
      } else {
        this.show_type = str2;
      } 
      str2 = paramBuilder.recommend_reason;
      if (str2 == null) {
        this.recommend_reason = "";
      } else {
        this.recommend_reason = str2;
      } 
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str1 = paramBuilder.recommend_type;
      if (str1 == null) {
        this.recommend_type = "";
      } else {
        this.recommend_type = str1;
      } 
      str1 = paramBuilder.recommend_tail;
      if (str1 == null) {
        this.recommend_tail = "";
      } else {
        this.recommend_tail = str1;
      } 
      str1 = paramBuilder.recommend_icon;
      if (str1 == null) {
        this.recommend_icon = "";
      } else {
        this.recommend_icon = str1;
      } 
      this.recommend_type_color = paramBuilder.recommend_type_color;
      this.recommend_reason_color = paramBuilder.recommend_reason_color;
      this.strip_color = paramBuilder.strip_color;
      this.background_color = paramBuilder.background_color;
      str = paramBuilder.jump_link;
      if (str == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str;
      } 
    } else {
      this.forum_avatar = ((Builder)str).forum_avatar;
      this.forum_name = ((Builder)str).forum_name;
      this.show_num = ((Builder)str).show_num;
      this.show_type = ((Builder)str).show_type;
      this.recommend_reason = ((Builder)str).recommend_reason;
      this.topic_id = ((Builder)str).topic_id;
      this.recommend_type = ((Builder)str).recommend_type;
      this.recommend_tail = ((Builder)str).recommend_tail;
      this.recommend_icon = ((Builder)str).recommend_icon;
      this.recommend_type_color = ((Builder)str).recommend_type_color;
      this.recommend_reason_color = ((Builder)str).recommend_reason_color;
      this.strip_color = ((Builder)str).strip_color;
      this.background_color = ((Builder)str).background_color;
      this.jump_link = ((Builder)str).jump_link;
    } 
  }
  
  public ThreadRecommendInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-640137595, "Ltbclient/ThreadRecommendInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-640137595, "Ltbclient/ThreadRecommendInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ThemeColorInfo background_color;
    
    public String forum_avatar;
    
    public String forum_name;
    
    public String jump_link;
    
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
    }
    
    public ThreadRecommendInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadRecommendInfo)interceptResult.objValue; 
      } 
      return new ThreadRecommendInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
