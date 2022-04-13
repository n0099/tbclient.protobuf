package ReplyMe;

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
import tbclient.ReplyMe.ReplyList;

public final class DataRes extends Message {
  public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ReplyList> reply_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      list = paramBuilder.reply_list;
      if (list == null) {
        this.reply_list = DEFAULT_REPLY_LIST;
      } else {
        this.reply_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.page = ((Builder)list).page;
      this.reply_list = Message.immutableCopyOf(((Builder)list).reply_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1022369604, "Ltbclient/ReplyMe/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1022369604, "Ltbclient/ReplyMe/DataRes;");
          return;
        } 
      } 
    } 
  }
}
