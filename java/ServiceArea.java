import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ServiceArea;
import tbclient.SmartApp;

public final class ServiceArea extends Message {
  public static final String DEFAULT_PICURL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SERVICENAME = "";
  
  public static final String DEFAULT_SERVICEURL = "";
  
  public static final String DEFAULT_SERVICE_TYPE = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 6)
  public final SmartApp area_smart_app;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String picurl;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String service_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String servicename;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String serviceurl;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String version;
  
  public ServiceArea(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.servicename;
      if (str == null) {
        this.servicename = "";
      } else {
        this.servicename = str;
      } 
      str = paramBuilder.picurl;
      if (str == null) {
        this.picurl = "";
      } else {
        this.picurl = str;
      } 
      str = paramBuilder.serviceurl;
      if (str == null) {
        this.serviceurl = "";
      } else {
        this.serviceurl = str;
      } 
      str = paramBuilder.version;
      if (str == null) {
        this.version = "";
      } else {
        this.version = str;
      } 
      str = paramBuilder.service_type;
      if (str == null) {
        this.service_type = "";
      } else {
        this.service_type = str;
      } 
      this.area_smart_app = paramBuilder.area_smart_app;
      str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
    } else {
      this.servicename = ((Builder)list).servicename;
      this.picurl = ((Builder)list).picurl;
      this.serviceurl = ((Builder)list).serviceurl;
      this.version = ((Builder)list).version;
      this.service_type = ((Builder)list).service_type;
      this.area_smart_app = ((Builder)list).area_smart_app;
      this.schema = ((Builder)list).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)list).third_statistics_url);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1207075453, "Ltbclient/ServiceArea;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1207075453, "Ltbclient/ServiceArea;");
          return;
        } 
      } 
    } 
  }
}
