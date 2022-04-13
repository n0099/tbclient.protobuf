package SubTagList;

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
  public static final List<Integer> DEFAULT_ARR_TAG_ID = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
  public final List<Integer> arr_tag_id;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      list = paramBuilder.arr_tag_id;
      if (list == null) {
        this.arr_tag_id = DEFAULT_ARR_TAG_ID;
      } else {
        this.arr_tag_id = Message.immutableCopyOf(list);
      } 
    } else {
      this.common = ((Builder)list).common;
      this.arr_tag_id = Message.immutableCopyOf(((Builder)list).arr_tag_id);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(43268180, "Ltbclient/SubTagList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(43268180, "Ltbclient/SubTagList/DataReq;");
          return;
        } 
      } 
    } 
  }
}
