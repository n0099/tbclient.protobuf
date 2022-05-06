package VideoRedIcon;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.VideoRedIcon.RedIcon;

public final class DataRes extends Message {
  public static final List<RedIcon> DEFAULT_RED_ICON_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RedIcon> red_icon_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.red_icon_list;
      if (list == null) {
        this.red_icon_list = DEFAULT_RED_ICON_LIST;
      } else {
        this.red_icon_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.red_icon_list = Message.immutableCopyOf(((Builder)list).red_icon_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1512277563, "Ltbclient/VideoRedIcon/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1512277563, "Ltbclient/VideoRedIcon/DataRes;");
          return;
        } 
      } 
    } 
  }
}
