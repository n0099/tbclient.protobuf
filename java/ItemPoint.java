package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemPoint extends Message {
  public static Interceptable $ic;
  
  public static final Double DEFAULT_POINT = Double.valueOf(0.0D);
  
  public static final String DEFAULT_TIME_INTVAL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double point;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time_intval;
  
  public ItemPoint(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str = paramBuilder.time_intval;
      if (str == null) {
        this.time_intval = "";
      } else {
        this.time_intval = str;
      } 
      double_ = paramBuilder.point;
      if (double_ == null) {
        this.point = DEFAULT_POINT;
      } else {
        this.point = double_;
      } 
    } else {
      this.time_intval = ((Builder)double_).time_intval;
      this.point = ((Builder)double_).point;
    } 
  }
  
  public ItemPoint(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1086495224, "Ltbclient/ItemPoint;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1086495224, "Ltbclient/ItemPoint;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ItemPoint> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Double point;
    
    public String time_intval;
    
    public Builder() {}
    
    public Builder(ItemPoint param1ItemPoint) {
      super(param1ItemPoint);
      if (param1ItemPoint == null)
        return; 
      this.time_intval = param1ItemPoint.time_intval;
      this.point = param1ItemPoint.point;
    }
    
    public ItemPoint build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ItemPoint)interceptResult.objValue; 
      } 
      return new ItemPoint(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
