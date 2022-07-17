package tbclient.GetMyPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Media_Num extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PIC = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pic;
  
  public Media_Num(Builder paramBuilder, boolean paramBoolean) {
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
  
  public Media_Num(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(312567271, "Ltbclient/GetMyPost/Media_Num;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(312567271, "Ltbclient/GetMyPost/Media_Num;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Media_Num> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer pic;
    
    public Builder() {}
    
    public Builder(Media_Num param1Media_Num) {
      super(param1Media_Num);
      if (param1Media_Num == null)
        return; 
      this.pic = param1Media_Num.pic;
    }
    
    public Media_Num build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Media_Num)interceptResult.objValue; 
      } 
      return new Media_Num(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
