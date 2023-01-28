package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UrlTitle extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public UrlTitle(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
  
  public UrlTitle(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UrlTitle> {
    public String name;
    
    public String url;
    
    public Builder() {}
    
    public Builder(UrlTitle param1UrlTitle) {
      super(param1UrlTitle);
      if (param1UrlTitle == null)
        return; 
      this.name = param1UrlTitle.name;
      this.url = param1UrlTitle.url;
    }
    
    public UrlTitle build(boolean param1Boolean) {
      return new UrlTitle(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
