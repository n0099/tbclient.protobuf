package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShareInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_IMAGEURL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String imageurl;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public ShareInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.imageurl;
      if (str == null) {
        this.imageurl = "";
      } else {
        this.imageurl = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.url = ((Builder)str).url;
      this.imageurl = ((Builder)str).imageurl;
    } 
  }
  
  public ShareInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ShareInfo> {
    public String content;
    
    public String imageurl;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ShareInfo param1ShareInfo) {
      super(param1ShareInfo);
      if (param1ShareInfo == null)
        return; 
      this.title = param1ShareInfo.title;
      this.content = param1ShareInfo.content;
      this.url = param1ShareInfo.url;
      this.imageurl = param1ShareInfo.imageurl;
    }
    
    public ShareInfo build(boolean param1Boolean) {
      return new ShareInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
