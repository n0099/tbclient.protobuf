package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Voice extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DURING_TIME;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer during_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(717784755, "Ltbclient/Voice;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(717784755, "Ltbclient/Voice;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DURING_TIME = integer;
  }
  
  public Voice(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.during_time;
      if (integer == null) {
        this.during_time = DEFAULT_DURING_TIME;
      } else {
        this.during_time = integer;
      } 
      str = paramBuilder.voice_md5;
      if (str == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.during_time = ((Builder)str).during_time;
      this.voice_md5 = ((Builder)str).voice_md5;
    } 
  }
  
  public Voice(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Voice> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer during_time;
    
    public Integer type;
    
    public String voice_md5;
    
    public Builder() {}
    
    public Builder(Voice param1Voice) {
      super(param1Voice);
      if (param1Voice == null)
        return; 
      this.type = param1Voice.type;
      this.during_time = param1Voice.during_time;
      this.voice_md5 = param1Voice.voice_md5;
    }
    
    public Voice build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Voice)interceptResult.objValue; 
      } 
      return new Voice(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
