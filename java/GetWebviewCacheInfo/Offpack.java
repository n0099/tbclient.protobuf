package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Offpack extends Message {
  public static final Integer DEFAULT_IS_USE = Integer.valueOf(0);
  
  public static final String DEFAULT_MD5 = "";
  
  public static final String DEFAULT_MOD_NAME = "";
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_WEBVIEW_VERSION = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_use;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String mod_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String webview_version;
  
  public Offpack(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.mod_name;
      if (str == null) {
        this.mod_name = "";
      } else {
        this.mod_name = str;
      } 
      str = paramBuilder.src;
      if (str == null) {
        this.src = "";
      } else {
        this.src = str;
      } 
      str = paramBuilder.md5;
      if (str == null) {
        this.md5 = "";
      } else {
        this.md5 = str;
      } 
      str = paramBuilder.webview_version;
      if (str == null) {
        this.webview_version = "";
      } else {
        this.webview_version = str;
      } 
      integer = paramBuilder.is_use;
      if (integer == null) {
        this.is_use = DEFAULT_IS_USE;
      } else {
        this.is_use = integer;
      } 
    } else {
      this.mod_name = ((Builder)integer).mod_name;
      this.src = ((Builder)integer).src;
      this.md5 = ((Builder)integer).md5;
      this.webview_version = ((Builder)integer).webview_version;
      this.is_use = ((Builder)integer).is_use;
    } 
  }
  
  public Offpack(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Offpack> {
    public Integer is_use;
    
    public String md5;
    
    public String mod_name;
    
    public String src;
    
    public String webview_version;
    
    public Builder() {}
    
    public Builder(Offpack param1Offpack) {
      super(param1Offpack);
      if (param1Offpack == null)
        return; 
      this.mod_name = param1Offpack.mod_name;
      this.src = param1Offpack.src;
      this.md5 = param1Offpack.md5;
      this.webview_version = param1Offpack.webview_version;
      this.is_use = param1Offpack.is_use;
    }
    
    public Offpack build(boolean param1Boolean) {
      return new Offpack(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
