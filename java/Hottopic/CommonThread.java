package tbclient.Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CommonThread extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final List<GoodThread> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GoodThread> thread_list;
  
  public CommonThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GoodThread> list;
    if (paramBoolean == true) {
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.module_name = ((Builder)list).module_name;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public CommonThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1960348163, "Ltbclient/Hottopic/CommonThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1960348163, "Ltbclient/Hottopic/CommonThread;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String module_name;
    
    public List<GoodThread> thread_list;
    
    public Builder() {}
    
    public Builder(CommonThread param1CommonThread) {
      super(param1CommonThread);
      if (param1CommonThread == null)
        return; 
      this.module_name = param1CommonThread.module_name;
      this.thread_list = Message.copyOf(param1CommonThread.thread_list);
    }
    
    public CommonThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CommonThread)interceptResult.objValue; 
      } 
      return new CommonThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
