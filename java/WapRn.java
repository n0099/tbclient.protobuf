package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WapRn extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FRSRN;
  
  public static final Integer DEFAULT_PBRN;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer frsrn;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pbrn;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(733677091, "Ltbclient/WapRn;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(733677091, "Ltbclient/WapRn;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FRSRN = integer;
    DEFAULT_PBRN = integer;
  }
  
  public WapRn(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.frsrn;
      if (integer1 == null) {
        this.frsrn = DEFAULT_FRSRN;
      } else {
        this.frsrn = integer1;
      } 
      integer = paramBuilder.pbrn;
      if (integer == null) {
        this.pbrn = DEFAULT_PBRN;
      } else {
        this.pbrn = integer;
      } 
    } else {
      this.frsrn = ((Builder)integer).frsrn;
      this.pbrn = ((Builder)integer).pbrn;
    } 
  }
  
  public WapRn(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WapRn> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer frsrn;
    
    public Integer pbrn;
    
    public Builder() {}
    
    public Builder(WapRn param1WapRn) {
      super(param1WapRn);
      if (param1WapRn == null)
        return; 
      this.frsrn = param1WapRn.frsrn;
      this.pbrn = param1WapRn.pbrn;
    }
    
    public WapRn build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (WapRn)interceptResult.objValue; 
      } 
      return new WapRn(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
