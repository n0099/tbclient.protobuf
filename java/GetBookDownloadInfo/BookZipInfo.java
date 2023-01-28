package tbclient.GetBookDownloadInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookZipInfo extends Message {
  public static final String DEFAULT_MD5 = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SIZE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String size;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public BookZipInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.size;
      if (str1 == null) {
        this.size = "";
      } else {
        this.size = str1;
      } 
      str = paramBuilder.md5;
      if (str == null) {
        this.md5 = "";
      } else {
        this.md5 = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
      this.size = ((Builder)str).size;
      this.md5 = ((Builder)str).md5;
    } 
  }
  
  public BookZipInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BookZipInfo> {
    public String md5;
    
    public String name;
    
    public String size;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BookZipInfo param1BookZipInfo) {
      super(param1BookZipInfo);
      if (param1BookZipInfo == null)
        return; 
      this.name = param1BookZipInfo.name;
      this.url = param1BookZipInfo.url;
      this.size = param1BookZipInfo.size;
      this.md5 = param1BookZipInfo.md5;
    }
    
    public BookZipInfo build(boolean param1Boolean) {
      return new BookZipInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
