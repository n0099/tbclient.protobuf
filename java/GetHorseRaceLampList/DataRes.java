package GetHorseRaceLampList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetHorseRaceLampList.LiveList;

public final class DataRes extends Message {
  public static final List<LiveList> DEFAULT_LIVE_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LiveList> live_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.live_list;
      if (list == null) {
        this.live_list = DEFAULT_LIVE_LIST;
      } else {
        this.live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.live_list = Message.immutableCopyOf(((Builder)list).live_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-204516740, "Ltbclient/GetHorseRaceLampList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-204516740, "Ltbclient/GetHorseRaceLampList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
