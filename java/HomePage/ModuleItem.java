package tbclient.HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ModuleItem extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_MID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long mid;
  
  public ModuleItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.mid;
      if (long_ == null) {
        this.mid = DEFAULT_MID;
      } else {
        this.mid = long_;
      } 
    } else {
      this.mid = ((Builder)long_).mid;
    } 
  }
  
  public ModuleItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1212901435, "Ltbclient/HomePage/ModuleItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1212901435, "Ltbclient/HomePage/ModuleItem;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ModuleItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long mid;
    
    public Builder() {}
    
    public Builder(ModuleItem param1ModuleItem) {
      super(param1ModuleItem);
      if (param1ModuleItem == null)
        return; 
      this.mid = param1ModuleItem.mid;
    }
    
    public ModuleItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ModuleItem)interceptResult.objValue; 
      } 
      return new ModuleItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
