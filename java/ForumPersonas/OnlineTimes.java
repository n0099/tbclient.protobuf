package tbclient.ForumPersonas;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OnlineTimes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_END = "";
  
  public static final Integer DEFAULT_SEQ = Integer.valueOf(0);
  
  public static final String DEFAULT_START = "";
  
  public static final String DEFAULT_TIME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String end;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer seq;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String start;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time;
  
  public OnlineTimes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.time;
      if (str == null) {
        this.time = "";
      } else {
        this.time = str;
      } 
      str = paramBuilder.start;
      if (str == null) {
        this.start = "";
      } else {
        this.start = str;
      } 
      str = paramBuilder.end;
      if (str == null) {
        this.end = "";
      } else {
        this.end = str;
      } 
      integer = paramBuilder.seq;
      if (integer == null) {
        this.seq = DEFAULT_SEQ;
      } else {
        this.seq = integer;
      } 
    } else {
      this.time = ((Builder)integer).time;
      this.start = ((Builder)integer).start;
      this.end = ((Builder)integer).end;
      this.seq = ((Builder)integer).seq;
    } 
  }
  
  public OnlineTimes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<OnlineTimes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String end;
    
    public Integer seq;
    
    public String start;
    
    public String time;
    
    public Builder() {}
    
    public Builder(OnlineTimes param1OnlineTimes) {
      super(param1OnlineTimes);
      if (param1OnlineTimes == null)
        return; 
      this.time = param1OnlineTimes.time;
      this.start = param1OnlineTimes.start;
      this.end = param1OnlineTimes.end;
      this.seq = param1OnlineTimes.seq;
    }
    
    public OnlineTimes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (OnlineTimes)interceptResult.objValue; 
      } 
      return new OnlineTimes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
