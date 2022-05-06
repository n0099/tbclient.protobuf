package GetForumBroadcastList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BroadcastInfo;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<BroadcastInfo> DEFAULT_BCAST_INFOS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BroadcastInfo> bcast_infos;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.bcast_infos;
      if (list == null) {
        this.bcast_infos = DEFAULT_BCAST_INFOS;
      } else {
        this.bcast_infos = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.bcast_infos = Message.immutableCopyOf(paramBuilder.bcast_infos);
      this.page = paramBuilder.page;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2068175434, "Ltbclient/GetForumBroadcastList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2068175434, "Ltbclient/GetForumBroadcastList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
