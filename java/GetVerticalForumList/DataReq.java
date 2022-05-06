package GetVerticalForumList;

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
  public static final Integer DEFAULT_BEGIN_ID;
  
  public static final List<Integer> DEFAULT_CLASSID_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_PN;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer begin_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
  public final List<Integer> classid_list;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BEGIN_ID = integer;
    DEFAULT_PN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      List list = paramBuilder.classid_list;
      if (list == null) {
        this.classid_list = DEFAULT_CLASSID_LIST;
      } else {
        this.classid_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.begin_id;
      if (integer1 == null) {
        this.begin_id = DEFAULT_BEGIN_ID;
      } else {
        this.begin_id = integer1;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.classid_list = Message.immutableCopyOf(((Builder)integer).classid_list);
      this.begin_id = ((Builder)integer).begin_id;
      this.pn = ((Builder)integer).pn;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1229076903, "Ltbclient/GetVerticalForumList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1229076903, "Ltbclient/GetVerticalForumList/DataReq;");
          return;
        } 
      } 
    } 
  }
}
