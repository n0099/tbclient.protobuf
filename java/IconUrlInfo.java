package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconUrlInfo extends Message {
  public static final String DEFAULT_DARK = "";
  
  public static final String DEFAULT_DAY = "";
  
  public static final String DEFAULT_NIGHT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String dark;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String night;
  
  public IconUrlInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.day;
      if (str1 == null) {
        this.day = "";
      } else {
        this.day = str1;
      } 
      str1 = paramBuilder.night;
      if (str1 == null) {
        this.night = "";
      } else {
        this.night = str1;
      } 
      str = paramBuilder.dark;
      if (str == null) {
        this.dark = "";
      } else {
        this.dark = str;
      } 
    } else {
      this.day = ((Builder)str).day;
      this.night = ((Builder)str).night;
      this.dark = ((Builder)str).dark;
    } 
  }
  
  public IconUrlInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IconUrlInfo> {
    public String dark;
    
    public String day;
    
    public String night;
    
    public Builder() {}
    
    public Builder(IconUrlInfo param1IconUrlInfo) {
      super(param1IconUrlInfo);
      if (param1IconUrlInfo == null)
        return; 
      this.day = param1IconUrlInfo.day;
      this.night = param1IconUrlInfo.night;
      this.dark = param1IconUrlInfo.dark;
    }
    
    public IconUrlInfo build(boolean param1Boolean) {
      return new IconUrlInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
