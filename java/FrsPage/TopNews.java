package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopNews extends Message {
  public static final String DEFAULT_NEWS_LINK = "";
  
  public static final String DEFAULT_SUMMARY = "";
  
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
      return new TopNews(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
