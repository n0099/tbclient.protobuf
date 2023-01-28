package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemThemeColor extends Message {
  @ProtoField(tag = 1)
  public final ItemThemeColorElement day;
  
  public ItemThemeColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.day = paramBuilder.day;
    } else {
      this.day = paramBuilder.day;
    } 
  }
  
  public ItemThemeColor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemThemeColor> {
    public ItemThemeColorElement day;
    
    public Builder() {}
    
    public Builder(ItemThemeColor param1ItemThemeColor) {
      super(param1ItemThemeColor);
      if (param1ItemThemeColor == null)
        return; 
      this.day = param1ItemThemeColor.day;
    }
    
    public ItemThemeColor build(boolean param1Boolean) {
      return new ItemThemeColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
