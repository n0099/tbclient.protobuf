package AddMsgRecord;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AddMsgRecord.MsgRecord;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<MsgRecord> DEFAULT_RECORDS = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<MsgRecord> records;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      list = paramBuilder.records;
      if (list == null) {
        this.records = DEFAULT_RECORDS;
      } else {
        this.records = Message.immutableCopyOf(list);
      } 
    } else {
      this.common = ((Builder)list).common;
      this.records = Message.immutableCopyOf(((Builder)list).records);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(560375899, "Ltbclient/AddMsgRecord/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(560375899, "Ltbclient/AddMsgRecord/DataReq;");
          return;
        } 
      } 
    } 
  }
}
