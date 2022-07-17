package tbclient.CartoonReader;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Images extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(397940667, "Ltbclient/CartoonReader/Images;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(397940667, "Ltbclient/CartoonReader/Images;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_HEIGHT = integer;
    DEFAULT_WIDTH = integer;
  }
  
  public Images(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
      Integer integer1 = paramBuilder.height;
      if (integer1 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer1;
      } 
      integer = paramBuilder.width;
      if (integer == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer;
      } 
    } else {
      this.img_url = ((Builder)integer).img_url;
      this.height = ((Builder)integer).height;
      this.width = ((Builder)integer).width;
    } 
  }
  
  public Images(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Images> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer height;
    
    public String img_url;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(Images param1Images) {
      super(param1Images);
      if (param1Images == null)
        return; 
      this.img_url = param1Images.img_url;
      this.height = param1Images.height;
      this.width = param1Images.width;
    }
    
    public Images build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Images)interceptResult.objValue; 
      } 
      return new Images(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
