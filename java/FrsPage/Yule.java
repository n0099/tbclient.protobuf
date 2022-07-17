package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Yule extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ACTIVITY_SHOW = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_show;
  
  @ProtoField(tag = 1)
  public final YuleActivity yule_activity;
  
  public Yule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.yule_activity = paramBuilder.yule_activity;
      integer = paramBuilder.activity_show;
      if (integer == null) {
        this.activity_show = DEFAULT_ACTIVITY_SHOW;
      } else {
        this.activity_show = integer;
      } 
    } else {
      this.yule_activity = ((Builder)integer).yule_activity;
      this.activity_show = ((Builder)integer).activity_show;
    } 
  }
  
  public Yule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1068542589, "Ltbclient/FrsPage/Yule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1068542589, "Ltbclient/FrsPage/Yule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Yule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer activity_show;
    
    public YuleActivity yule_activity;
    
    public Builder() {}
    
    public Builder(Yule param1Yule) {
      super(param1Yule);
      if (param1Yule == null)
        return; 
      this.yule_activity = param1Yule.yule_activity;
      this.activity_show = param1Yule.activity_show;
    }
    
    public Yule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Yule)interceptResult.objValue; 
      } 
      return new Yule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
