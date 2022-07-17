package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewsInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_NEWS_ICON = "";
  
  public static final String DEFAULT_NEWS_LINK = "";
  
  public static final Integer DEFAULT_NEWS_TYPE;
  
  public static final Integer DEFAULT_POSITION;
  
  public static final String DEFAULT_SUBTITLE = "";
  
  public static final String DEFAULT_SUMMARY = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String news_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String news_link;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer news_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer position;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String subtitle;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String summary;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(999535126, "Ltbclient/PbPage/NewsInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(999535126, "Ltbclient/PbPage/NewsInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_POSITION = integer;
    DEFAULT_NEWS_TYPE = integer;
  }
  
  public NewsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.news_link;
      if (str2 == null) {
        this.news_link = "";
      } else {
        this.news_link = str2;
      } 
      str2 = paramBuilder.summary;
      if (str2 == null) {
        this.summary = "";
      } else {
        this.summary = str2;
      } 
      Integer integer = paramBuilder.position;
      if (integer == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer;
      } 
      integer = paramBuilder.news_type;
      if (integer == null) {
        this.news_type = DEFAULT_NEWS_TYPE;
      } else {
        this.news_type = integer;
      } 
      String str1 = paramBuilder.news_icon;
      if (str1 == null) {
        this.news_icon = "";
      } else {
        this.news_icon = str1;
      } 
      str1 = paramBuilder.subtitle;
      if (str1 == null) {
        this.subtitle = "";
      } else {
        this.subtitle = str1;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
    } else {
      this.news_link = ((Builder)str).news_link;
      this.summary = ((Builder)str).summary;
      this.position = ((Builder)str).position;
      this.news_type = ((Builder)str).news_type;
      this.news_icon = ((Builder)str).news_icon;
      this.subtitle = ((Builder)str).subtitle;
      this.button_text = ((Builder)str).button_text;
    } 
  }
  
  public NewsInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewsInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String button_text;
    
    public String news_icon;
    
    public String news_link;
    
    public Integer news_type;
    
    public Integer position;
    
    public String subtitle;
    
    public String summary;
    
    public Builder() {}
    
    public Builder(NewsInfo param1NewsInfo) {
      super(param1NewsInfo);
      if (param1NewsInfo == null)
        return; 
      this.news_link = param1NewsInfo.news_link;
      this.summary = param1NewsInfo.summary;
      this.position = param1NewsInfo.position;
      this.news_type = param1NewsInfo.news_type;
      this.news_icon = param1NewsInfo.news_icon;
      this.subtitle = param1NewsInfo.subtitle;
      this.button_text = param1NewsInfo.button_text;
    }
    
    public NewsInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewsInfo)interceptResult.objValue; 
      } 
      return new NewsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
