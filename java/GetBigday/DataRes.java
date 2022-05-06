package GetBigday;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetBigday.BigdayInfo;

public final class DataRes extends Message {
  public static final List<BigdayInfo> DEFAULT_BIGDAY_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BigdayInfo> bigday_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.bigday_list;
      if (list == null) {
        this.bigday_list = DEFAULT_BIGDAY_LIST;
      } else {
        this.bigday_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.bigday_list = Message.immutableCopyOf(((Builder)list).bigday_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(442870988, "Ltbclient/GetBigday/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(442870988, "Ltbclient/GetBigday/DataRes;");
          return;
        } 
      } 
    } 
  }
}
