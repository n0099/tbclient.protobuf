package GetMoreMsg;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetMoreMsg.MsgContent;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<MsgContent> DEFAULT_MSG_CONTENT = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MsgContent> msg_content;
  
  static {
    DEFAULT_HAS_MORE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.msg_content;
      if (list == null) {
        this.msg_content = DEFAULT_MSG_CONTENT;
      } else {
        this.msg_content = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.msg_content = Message.immutableCopyOf(((Builder)integer).msg_content);
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1083724692, "Ltbclient/GetMoreMsg/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1083724692, "Ltbclient/GetMoreMsg/DataRes;");
          return;
        } 
      } 
    } 
  }
}
