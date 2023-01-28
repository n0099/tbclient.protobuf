package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class JNews extends Message {
  public static final String DEFAULT_FROM = "";
  
  public static final Long DEFAULT_JID = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long jid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public JNews(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.jid;
      if (long_ == null) {
        this.jid = DEFAULT_JID;
      } else {
        this.jid = long_;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.from;
      if (str == null) {
        this.from = "";
      } else {
        this.from = str;
      } 
    } else {
      this.jid = ((Builder)str).jid;
      this.url = ((Builder)str).url;
      this.from = ((Builder)str).from;
    } 
  }
  
  public JNews(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<JNews> {
    public String from;
    
    public Long jid;
    
    public String url;
    
    public Builder() {}
    
    public Builder(JNews param1JNews) {
      super(param1JNews);
      if (param1JNews == null)
        return; 
      this.jid = param1JNews.jid;
      this.url = param1JNews.url;
      this.from = param1JNews.from;
    }
    
    public JNews build(boolean param1Boolean) {
      return new JNews(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
