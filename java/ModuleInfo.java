package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ModuleInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_MAX_MODULE_NUM;
  
  public static final Integer DEFAULT_MAX_MODULE_THREAD_NUM;
  
  public static final List<ThreadModule> DEFAULT_MODULE_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer max_module_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer max_module_thread_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadModule> module_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MAX_MODULE_NUM = integer;
    DEFAULT_MAX_MODULE_THREAD_NUM = integer;
  }
  
  public ModuleInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadModule> list = paramBuilder.module_list;
      if (list == null) {
        this.module_list = DEFAULT_MODULE_LIST;
      } else {
        this.module_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.max_module_num;
      if (integer1 == null) {
        this.max_module_num = DEFAULT_MAX_MODULE_NUM;
      } else {
        this.max_module_num = integer1;
      } 
      integer = paramBuilder.max_module_thread_num;
      if (integer == null) {
        this.max_module_thread_num = DEFAULT_MAX_MODULE_THREAD_NUM;
      } else {
        this.max_module_thread_num = integer;
      } 
    } else {
      this.module_list = Message.immutableCopyOf(((Builder)integer).module_list);
      this.max_module_num = ((Builder)integer).max_module_num;
      this.max_module_thread_num = ((Builder)integer).max_module_thread_num;
    } 
  }
  
  public ModuleInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(397594391, "Ltbclient/ModuleInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(397594391, "Ltbclient/ModuleInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ModuleInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer max_module_num;
    
    public Integer max_module_thread_num;
    
    public List<ThreadModule> module_list;
    
    public Builder() {}
    
    public Builder(ModuleInfo param1ModuleInfo) {
      super(param1ModuleInfo);
      if (param1ModuleInfo == null)
        return; 
      this.module_list = Message.copyOf(param1ModuleInfo.module_list);
      this.max_module_num = param1ModuleInfo.max_module_num;
      this.max_module_thread_num = param1ModuleInfo.max_module_thread_num;
    }
    
    public ModuleInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ModuleInfo)interceptResult.objValue; 
      } 
      return new ModuleInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
