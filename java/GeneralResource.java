package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GeneralResource extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_RES_FLOOR = Integer.valueOf(0);
  
  public static final String DEFAULT_RES_IMAGE = "";
  
  public static final String DEFAULT_RES_LINK = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer res_floor;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String res_image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String res_link;
  
  public GeneralResource(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.res_image;
      if (str == null) {
        this.res_image = "";
      } else {
        this.res_image = str;
      } 
      str = paramBuilder.res_link;
      if (str == null) {
        this.res_link = "";
      } else {
        this.res_link = str;
      } 
      integer = paramBuilder.res_floor;
      if (integer == null) {
        this.res_floor = DEFAULT_RES_FLOOR;
      } else {
        this.res_floor = integer;
      } 
    } else {
      this.res_image = ((Builder)integer).res_image;
      this.res_link = ((Builder)integer).res_link;
      this.res_floor = ((Builder)integer).res_floor;
    } 
  }
  
  public GeneralResource(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1018257103, "Ltbclient/GeneralResource;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1018257103, "Ltbclient/GeneralResource;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GeneralResource> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer res_floor;
    
    public String res_image;
    
    public String res_link;
    
    public Builder() {}
    
    public Builder(GeneralResource param1GeneralResource) {
      super(param1GeneralResource);
      if (param1GeneralResource == null)
        return; 
      this.res_image = param1GeneralResource.res_image;
      this.res_link = param1GeneralResource.res_link;
      this.res_floor = param1GeneralResource.res_floor;
    }
    
    public GeneralResource build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GeneralResource)interceptResult.objValue; 
      } 
      return new GeneralResource(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
