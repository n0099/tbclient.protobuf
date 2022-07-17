package tbclient.GetTopicRelateThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1112202834, "Ltbclient/GetTopicRelateThread/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1112202834, "Ltbclient/GetTopicRelateThread/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Page page;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.page = param1DataRes.page;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
