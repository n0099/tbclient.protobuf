package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NativeApp extends Message {
  public static final String DEFAULT_DOWNLOAD_AND = "";
  
  public static final String DEFAULT_DOWNLOAD_IOS = "";
  
  public static final String DEFAULT_JUMP_AND = "";
  
  public static final String DEFAULT_JUMP_IOS = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String download_and;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String download_ios;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String jump_and;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_ios;
  
  public NativeApp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.jump_and;
      if (str1 == null) {
        this.jump_and = "";
      } else {
        this.jump_and = str1;
      } 
      str1 = paramBuilder.jump_ios;
      if (str1 == null) {
        this.jump_ios = "";
      } else {
        this.jump_ios = str1;
      } 
      str1 = paramBuilder.download_and;
      if (str1 == null) {
        this.download_and = "";
      } else {
        this.download_and = str1;
      } 
      str = paramBuilder.download_ios;
      if (str == null) {
        this.download_ios = "";
      } else {
        this.download_ios = str;
      } 
    } else {
      this.jump_and = ((Builder)str).jump_and;
      this.jump_ios = ((Builder)str).jump_ios;
      this.download_and = ((Builder)str).download_and;
      this.download_ios = ((Builder)str).download_ios;
    } 
  }
  
  public NativeApp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NativeApp> {
    public String download_and;
    
    public String download_ios;
    
    public String jump_and;
    
    public String jump_ios;
    
    public Builder() {}
    
    public Builder(NativeApp param1NativeApp) {
      super(param1NativeApp);
      if (param1NativeApp == null)
        return; 
      this.jump_and = param1NativeApp.jump_and;
      this.jump_ios = param1NativeApp.jump_ios;
      this.download_and = param1NativeApp.download_and;
      this.download_ios = param1NativeApp.download_ios;
    }
    
    public NativeApp build(boolean param1Boolean) {
      return new NativeApp(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
