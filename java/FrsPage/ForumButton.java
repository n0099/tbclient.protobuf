package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumButton extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_BLUEV = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_blueV;
  
  public ForumButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_blueV;
      if (integer == null) {
        this.is_blueV = DEFAULT_IS_BLUEV;
      } else {
        this.is_blueV = integer;
      } 
    } else {
      this.is_blueV = ((Builder)integer).is_blueV;
    } 
  }
  
  public ForumButton(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1359266805, "Ltbclient/FrsPage/ForumButton;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1359266805, "Ltbclient/FrsPage/ForumButton;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumButton> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_blueV;
    
    public Builder() {}
    
    public Builder(ForumButton param1ForumButton) {
      super(param1ForumButton);
      if (param1ForumButton == null)
        return; 
      this.is_blueV = param1ForumButton.is_blueV;
    }
    
    public ForumButton build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumButton)interceptResult.objValue; 
      } 
      return new ForumButton(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
