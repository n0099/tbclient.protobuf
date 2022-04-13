package LogTogether;

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
import tbclient.LogTogether.AdReq;

public final class DataReq extends Message {
  public static final List<AdReq> DEFAULT_AD = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AdReq> Ad;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.Ad;
      if (list == null) {
        this.Ad = DEFAULT_AD;
      } else {
        this.Ad = Message.immutableCopyOf(list);
      } 
      this.common = paramBuilder.common;
    } else {
      this.Ad = Message.immutableCopyOf(paramBuilder.Ad);
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-891925630, "Ltbclient/LogTogether/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-891925630, "Ltbclient/LogTogether/DataReq;");
          return;
        } 
      } 
    } 
  }
}
