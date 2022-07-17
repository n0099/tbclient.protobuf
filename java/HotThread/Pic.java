package tbclient.HotThread;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Pic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BIG_PIC = "";
  
  public static final String DEFAULT_SMALL_PIC = "";
  
  public static final String DEFAULT_WATER_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String big_pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String small_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String water_pic;
  
  public Pic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.small_pic;
      if (str1 == null) {
        this.small_pic = "";
      } else {
        this.small_pic = str1;
      } 
      str1 = paramBuilder.big_pic;
      if (str1 == null) {
        this.big_pic = "";
      } else {
        this.big_pic = str1;
      } 
      str = paramBuilder.water_pic;
      if (str == null) {
        this.water_pic = "";
      } else {
        this.water_pic = str;
      } 
    } else {
      this.small_pic = ((Builder)str).small_pic;
      this.big_pic = ((Builder)str).big_pic;
      this.water_pic = ((Builder)str).water_pic;
    } 
  }
  
  public Pic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Pic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String big_pic;
    
    public String small_pic;
    
    public String water_pic;
    
    public Builder() {}
    
    public Builder(Pic param1Pic) {
      super(param1Pic);
      if (param1Pic == null)
        return; 
      this.small_pic = param1Pic.small_pic;
      this.big_pic = param1Pic.big_pic;
      this.water_pic = param1Pic.water_pic;
    }
    
    public Pic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Pic)interceptResult.objValue; 
      } 
      return new Pic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
