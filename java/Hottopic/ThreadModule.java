package tbclient.Hottopic;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadModule extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonThread thread_module_1;
  
  @ProtoField(tag = 2)
  public final CommonThread thread_module_2;
  
  @ProtoField(tag = 3)
  public final CommonThread thread_module_3;
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.thread_module_1 = paramBuilder.thread_module_1;
      this.thread_module_2 = paramBuilder.thread_module_2;
      this.thread_module_3 = paramBuilder.thread_module_3;
    } else {
      this.thread_module_1 = paramBuilder.thread_module_1;
      this.thread_module_2 = paramBuilder.thread_module_2;
      this.thread_module_3 = paramBuilder.thread_module_3;
    } 
  }
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadModule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonThread thread_module_1;
    
    public CommonThread thread_module_2;
    
    public CommonThread thread_module_3;
    
    public Builder() {}
    
    public Builder(ThreadModule param1ThreadModule) {
      super(param1ThreadModule);
      if (param1ThreadModule == null)
        return; 
      this.thread_module_1 = param1ThreadModule.thread_module_1;
      this.thread_module_2 = param1ThreadModule.thread_module_2;
      this.thread_module_3 = param1ThreadModule.thread_module_3;
    }
    
    public ThreadModule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadModule)interceptResult.objValue; 
      } 
      return new ThreadModule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
