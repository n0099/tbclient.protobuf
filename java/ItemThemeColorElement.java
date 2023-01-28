package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemThemeColorElement extends Message {
  public static final String DEFAULT_BOTTOM_COLOR = "";
  
  public static final String DEFAULT_EDIT_BUTTON_COLOR = "";
  
  public static final String DEFAULT_TOP_COLOR = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bottom_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String edit_button_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String top_color;
  
  public ItemThemeColorElement(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.top_color;
      if (str1 == null) {
        this.top_color = "";
      } else {
        this.top_color = str1;
      } 
      str1 = paramBuilder.bottom_color;
      if (str1 == null) {
        this.bottom_color = "";
      } else {
        this.bottom_color = str1;
      } 
      str = paramBuilder.edit_button_color;
      if (str == null) {
        this.edit_button_color = "";
      } else {
        this.edit_button_color = str;
      } 
    } else {
      this.top_color = ((Builder)str).top_color;
      this.bottom_color = ((Builder)str).bottom_color;
      this.edit_button_color = ((Builder)str).edit_button_color;
    } 
  }
  
  public ItemThemeColorElement(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemThemeColorElement> {
    public String bottom_color;
    
    public String edit_button_color;
    
    public String top_color;
    
    public Builder() {}
    
    public Builder(ItemThemeColorElement param1ItemThemeColorElement) {
      super(param1ItemThemeColorElement);
      if (param1ItemThemeColorElement == null)
        return; 
      this.top_color = param1ItemThemeColorElement.top_color;
      this.bottom_color = param1ItemThemeColorElement.bottom_color;
      this.edit_button_color = param1ItemThemeColorElement.edit_button_color;
    }
    
    public ItemThemeColorElement build(boolean param1Boolean) {
      return new ItemThemeColorElement(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
