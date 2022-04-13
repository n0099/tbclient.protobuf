package GetPoisByLocation;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetPoisByLocation.PoiInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_FORMATTED_ADDRESS = "";
  
  public static final List<PoiInfo> DEFAULT_POI_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String formatted_address;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PoiInfo> poi_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.formatted_address;
      if (str == null) {
        this.formatted_address = "";
      } else {
        this.formatted_address = str;
      } 
      list = paramBuilder.poi_info;
      if (list == null) {
        this.poi_info = DEFAULT_POI_INFO;
      } else {
        this.poi_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.formatted_address = ((Builder)list).formatted_address;
      this.poi_info = Message.immutableCopyOf(((Builder)list).poi_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-488901101, "Ltbclient/GetPoisByLocation/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-488901101, "Ltbclient/GetPoisByLocation/DataRes;");
          return;
        } 
      } 
    } 
  }
}
