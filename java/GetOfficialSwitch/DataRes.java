package GetOfficialSwitch;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetOfficialSwitch.OfficialList;

public final class DataRes extends Message {
  public static final List<OfficialList> DEFAULT_OFFICIAL_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<OfficialList> official_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.official_list;
      if (list == null) {
        this.official_list = DEFAULT_OFFICIAL_LIST;
      } else {
        this.official_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.official_list = Message.immutableCopyOf(((Builder)list).official_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(181673161, "Ltbclient/GetOfficialSwitch/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(181673161, "Ltbclient/GetOfficialSwitch/DataRes;");
          return;
        } 
      } 
    } 
  }
}
