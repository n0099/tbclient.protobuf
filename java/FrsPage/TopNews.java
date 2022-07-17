package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopNews extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NEWS_LINK = "";
  
  public static final String DEFAULT_SUMMARY = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String news_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String summary;
  
  public TopNews(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.news_link;
      if (str1 == null) {
        this.news_link = "";
      } else {
        this.news_link = str1;
      } 
      str = paramBuilder.summary;
      if (str == null) {
        this.summary = "";
      } else {
        this.summary = str;
      } 
    } else {
      this.news_link = ((Builder)str).news_link;
      this.summary = ((Builder)str).summary;
    } 
  }
  
  public TopNews(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopNews> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String news_link;
    
    public String summary;
    
    public Builder() {}
    
    public Builder(TopNews param1TopNews) {
      super(param1TopNews);
      if (param1TopNews == null)
        return; 
      this.news_link = param1TopNews.news_link;
      this.summary = param1TopNews.summary;
    }
    
    public TopNews build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TopNews)interceptResult.objValue; 
      } 
      return new TopNews(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
