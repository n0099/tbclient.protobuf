package tbclient.GetThemeList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCarousel extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public transient FieldHolder $fh;
  
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
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeCarousel)interceptResult.objValue; 
      } 
      return new ThemeCarousel(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
