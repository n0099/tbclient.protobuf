package GetSuggestionByAddrName;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Lbs;

public final class DataRes extends Message {
  public static final List<Lbs> DEFAULT_POI_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Lbs> poi_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.poi_info;
      if (list == null) {
        this.poi_info = DEFAULT_POI_INFO;
      } else {
        this.poi_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.poi_info = Message.immutableCopyOf(((Builder)list).poi_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-315190767, "Ltbclient/GetSuggestionByAddrName/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-315190767, "Ltbclient/GetSuggestionByAddrName/DataRes;");
          return;
        } 
      } 
    } 
  }
}
