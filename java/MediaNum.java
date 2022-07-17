package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MediaNum extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PIC = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pic;
  
  public MediaNum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.pic;
      if (integer == null) {
        this.pic = DEFAULT_PIC;
      } else {
        this.pic = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
    } 
  }
  
  public MediaNum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2043635151, "Ltbclient/MediaNum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2043635151, "Ltbclient/MediaNum;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<MediaNum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer pic;
    
    public Builder() {}
    
    public Builder(MediaNum param1MediaNum) {
      super(param1MediaNum);
      if (param1MediaNum == null)
        return; 
      this.pic = param1MediaNum.pic;
    }
    
    public MediaNum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MediaNum)interceptResult.objValue; 
      } 
      return new MediaNum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
