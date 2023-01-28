package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeMyTab extends Message {
  public static final String DEFAULT_BUTTON_COLOR = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ThemeMyTab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.dynamic_url;
      if (str1 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str1;
      } 
      str = paramBuilder.button_color;
      if (str == null) {
        this.button_color = "";
      } else {
        this.button_color = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.dynamic_url = ((Builder)str).dynamic_url;
      this.button_color = ((Builder)str).button_color;
    } 
  }
  
  public ThemeMyTab(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeMyTab> {
    public String button_color;
    
    public String dynamic_url;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ThemeMyTab param1ThemeMyTab) {
      super(param1ThemeMyTab);
      if (param1ThemeMyTab == null)
        return; 
      this.url = param1ThemeMyTab.url;
      this.dynamic_url = param1ThemeMyTab.dynamic_url;
      this.button_color = param1ThemeMyTab.button_color;
    }
    
    public ThemeMyTab build(boolean param1Boolean) {
      return new ThemeMyTab(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
