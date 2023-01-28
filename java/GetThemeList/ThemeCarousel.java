package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCarousel extends Message {
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  public ThemeCarousel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str = paramBuilder.active_url;
      if (str == null) {
        this.active_url = "";
      } else {
        this.active_url = str;
      } 
    } else {
      this.pic_url = ((Builder)str).pic_url;
      this.active_url = ((Builder)str).active_url;
    } 
  }
  
  public ThemeCarousel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeCarousel> {
    public String active_url;
    
    public String pic_url;
    
    public Builder() {}
    
    public Builder(ThemeCarousel param1ThemeCarousel) {
      super(param1ThemeCarousel);
      if (param1ThemeCarousel == null)
        return; 
      this.pic_url = param1ThemeCarousel.pic_url;
      this.active_url = param1ThemeCarousel.active_url;
    }
    
    public ThemeCarousel build(boolean param1Boolean) {
      return new ThemeCarousel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
