package MFollow;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<String> DEFAULT_PORTRAIT = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> portrait;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      list = paramBuilder.portrait;
      if (list == null) {
        this.portrait = DEFAULT_PORTRAIT;
      } else {
        this.portrait = Message.immutableCopyOf(list);
      } 
    } else {
      this.common = ((Builder)list).common;
      this.portrait = Message.immutableCopyOf(((Builder)list).portrait);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(659238818, "Ltbclient/MFollow/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(659238818, "Ltbclient/MFollow/DataReq;");
          return;
        } 
      } 
    } 
  }
}
