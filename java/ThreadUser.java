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

public final class ThreadUser extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 2)
  public final User user_info;
  
  public ThreadUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.user_info = paramBuilder.user_info;
    } else {
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.user_info = paramBuilder.user_info;
    } 
  }
  
  public ThreadUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-760293700, "Ltbclient/ThreadUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-760293700, "Ltbclient/ThreadUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThreadUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThreadInfo> thread_list;
    
    public User user_info;
    
    public Builder() {}
    
    public Builder(ThreadUser param1ThreadUser) {
      super(param1ThreadUser);
      if (param1ThreadUser == null)
        return; 
      this.thread_list = Message.copyOf(param1ThreadUser.thread_list);
      this.user_info = param1ThreadUser.user_info;
    }
    
    public ThreadUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadUser)interceptResult.objValue; 
      } 
      return new ThreadUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
