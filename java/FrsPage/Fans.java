package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Fans extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_GET;
  
  public static final Integer DEFAULT_LEFT_TIME;
  
  public static final Integer DEFAULT_NUM;
  
  public static final Integer DEFAULT_OPEN;
  
  public static final Integer DEFAULT_START_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_get;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer left_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer open;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer start_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1086682952, "Ltbclient/FrsPage/Fans;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1086682952, "Ltbclient/FrsPage/Fans;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_START_TIME = integer;
    DEFAULT_LEFT_TIME = integer;
    DEFAULT_OPEN = integer;
    DEFAULT_IS_GET = integer;
    DEFAULT_NUM = integer;
  }
  
  public Fans(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.start_time;
      if (integer1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer1;
      } 
      integer1 = paramBuilder.left_time;
      if (integer1 == null) {
        this.left_time = DEFAULT_LEFT_TIME;
      } else {
        this.left_time = integer1;
      } 
      integer1 = paramBuilder.open;
      if (integer1 == null) {
        this.open = DEFAULT_OPEN;
      } else {
        this.open = integer1;
      } 
      integer1 = paramBuilder.is_get;
      if (integer1 == null) {
        this.is_get = DEFAULT_IS_GET;
      } else {
        this.is_get = integer1;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.start_time = ((Builder)integer).start_time;
      this.left_time = ((Builder)integer).left_time;
      this.open = ((Builder)integer).open;
      this.is_get = ((Builder)integer).is_get;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public Fans(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Fans> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_get;
    
    public Integer left_time;
    
    public Integer num;
    
    public Integer open;
    
    public Integer start_time;
    
    public Builder() {}
    
    public Builder(Fans param1Fans) {
      super(param1Fans);
      if (param1Fans == null)
        return; 
      this.start_time = param1Fans.start_time;
      this.left_time = param1Fans.left_time;
      this.open = param1Fans.open;
      this.is_get = param1Fans.is_get;
      this.num = param1Fans.num;
    }
    
    public Fans build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Fans)interceptResult.objValue; 
      } 
      return new Fans(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
