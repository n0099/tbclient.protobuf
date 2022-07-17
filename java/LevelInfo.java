package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_SCORE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer score;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1485550739, "Ltbclient/LevelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1485550739, "Ltbclient/LevelInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_SCORE = integer;
  }
  
  public LevelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.score;
      if (integer == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.score = ((Builder)integer).score;
    } 
  }
  
  public LevelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LevelInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer id;
    
    public String name;
    
    public Integer score;
    
    public Builder() {}
    
    public Builder(LevelInfo param1LevelInfo) {
      super(param1LevelInfo);
      if (param1LevelInfo == null)
        return; 
      this.id = param1LevelInfo.id;
      this.name = param1LevelInfo.name;
      this.score = param1LevelInfo.score;
    }
    
    public LevelInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LevelInfo)interceptResult.objValue; 
      } 
      return new LevelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
