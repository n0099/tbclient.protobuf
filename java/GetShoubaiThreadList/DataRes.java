package GetShoubaiThreadList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetShoubaiThreadList.PageInfo;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final PageInfo page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.page = ((Builder)list).page;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1697652361, "Ltbclient/GetShoubaiThreadList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1697652361, "Ltbclient/GetShoubaiThreadList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
