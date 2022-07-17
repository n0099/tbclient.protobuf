package tbclient.GetGambleResult;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Winnner extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_SCORE;
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer score;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1611393712, "Ltbclient/GetGambleResult/Winnner;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1611393712, "Ltbclient/GetGambleResult/Winnner;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCORE = integer;
    DEFAULT_TIME = integer;
    DEFAULT_TYPE = integer;
  }
  
  public Winnner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      Integer integer1 = paramBuilder.score;
      if (integer1 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer1;
      } 
      integer1 = paramBuilder.time;
      if (integer1 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer1;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.user_name = ((Builder)integer).user_name;
      this.portrait = ((Builder)integer).portrait;
      this.score = ((Builder)integer).score;
      this.time = ((Builder)integer).time;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public Winnner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Winnner> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String portrait;
    
    public Integer score;
    
    public Integer time;
    
    public Integer type;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(Winnner param1Winnner) {
      super(param1Winnner);
      if (param1Winnner == null)
        return; 
      this.user_name = param1Winnner.user_name;
      this.portrait = param1Winnner.portrait;
      this.score = param1Winnner.score;
      this.time = param1Winnner.time;
      this.type = param1Winnner.type;
    }
    
    public Winnner build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Winnner)interceptResult.objValue; 
      } 
      return new Winnner(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
