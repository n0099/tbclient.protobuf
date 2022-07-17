package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Position extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CARD;
  
  public static final Integer DEFAULT_FRS;
  
  public static final Integer DEFAULT_HOME;
  
  public static final Integer DEFAULT_PB;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer card;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer frs;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer home;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pb;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1610472072, "Ltbclient/Position;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1610472072, "Ltbclient/Position;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FRS = integer;
    DEFAULT_PB = integer;
    DEFAULT_HOME = integer;
    DEFAULT_CARD = integer;
  }
  
  public Position(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.frs;
      if (integer1 == null) {
        this.frs = DEFAULT_FRS;
      } else {
        this.frs = integer1;
      } 
      integer1 = paramBuilder.pb;
      if (integer1 == null) {
        this.pb = DEFAULT_PB;
      } else {
        this.pb = integer1;
      } 
      integer1 = paramBuilder.home;
      if (integer1 == null) {
        this.home = DEFAULT_HOME;
      } else {
        this.home = integer1;
      } 
      integer = paramBuilder.card;
      if (integer == null) {
        this.card = DEFAULT_CARD;
      } else {
        this.card = integer;
      } 
    } else {
      this.frs = ((Builder)integer).frs;
      this.pb = ((Builder)integer).pb;
      this.home = ((Builder)integer).home;
      this.card = ((Builder)integer).card;
    } 
  }
  
  public Position(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Position> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer card;
    
    public Integer frs;
    
    public Integer home;
    
    public Integer pb;
    
    public Builder() {}
    
    public Builder(Position param1Position) {
      super(param1Position);
      if (param1Position == null)
        return; 
      this.frs = param1Position.frs;
      this.pb = param1Position.pb;
      this.home = param1Position.home;
      this.card = param1Position.card;
    }
    
    public Position build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Position)interceptResult.objValue; 
      } 
      return new Position(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
