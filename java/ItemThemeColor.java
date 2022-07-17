package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemThemeColor extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
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
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ItemThemeColorElement day;
    
    public Builder() {}
    
    public Builder(ItemThemeColor param1ItemThemeColor) {
      super(param1ItemThemeColor);
      if (param1ItemThemeColor == null)
        return; 
      this.day = param1ItemThemeColor.day;
    }
    
    public ItemThemeColor build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ItemThemeColor)interceptResult.objValue; 
      } 
      return new ItemThemeColor(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
