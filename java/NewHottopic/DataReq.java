package NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_CALL_FROM = "";
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      str = paramBuilder.call_from;
      if (str == null) {
        this.call_from = "";
      } else {
        this.call_from = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.topic_id = ((Builder)str).topic_id;
      this.call_from = ((Builder)str).call_from;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1996507870, "Ltbclient/NewHottopic/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1996507870, "Ltbclient/NewHottopic/DataReq;");
          return;
        } 
      } 
    } 
  }
}
