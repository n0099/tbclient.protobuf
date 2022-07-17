package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppPosInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ADDR_TIMESTAMP;
  
  public static final Boolean DEFAULT_AP_CONNECTED = Boolean.FALSE;
  
  public static final String DEFAULT_AP_MAC = "";
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final String DEFAULT_COORDINATE_TYPE = "";
  
  public static final String DEFAULT_LATITUDE = "";
  
  public static final String DEFAULT_LONGITUDE = "";
  
  public static final Integer DEFAULT_MERCATOR_CITY;
  
  public static final String DEFAULT_MERCATOR_CITY_NAME = "";
  
  public static final String DEFAULT_MERCATOR_DISTRICT_NAME = "";
  
  public static final String DEFAULT_MERCATOR_LAT = "";
  
  public static final String DEFAULT_MERCATOR_LON = "";
  
  public static final String DEFAULT_MERCATOR_PROVINCE_NAME = "";
  
  public static final String DEFAULT_MERCATOR_RADIUS = "";
  
  public static final Long DEFAULT_MERCATOR_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long addr_timestamp;
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean ap_connected;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String ap_mac;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String coordinate_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String latitude;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String longitude;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer mercator_city;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String mercator_city_name;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String mercator_district_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String mercator_lat;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String mercator_lon;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String mercator_province_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String mercator_radius;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long mercator_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ADDR_TIMESTAMP = long_;
    DEFAULT_MERCATOR_TIME = long_;
    DEFAULT_MERCATOR_CITY = Integer.valueOf(0);
  }
  
  public AppPosInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str4 = paramBuilder.ap_mac;
      if (str4 == null) {
        this.ap_mac = "";
      } else {
        this.ap_mac = str4;
      } 
      Boolean bool = paramBuilder.ap_connected;
      if (bool == null) {
        this.ap_connected = DEFAULT_AP_CONNECTED;
      } else {
        this.ap_connected = bool;
      } 
      String str3 = paramBuilder.coordinate_type;
      if (str3 == null) {
        this.coordinate_type = "";
      } else {
        this.coordinate_type = str3;
      } 
      str3 = paramBuilder.longitude;
      if (str3 == null) {
        this.longitude = "";
      } else {
        this.longitude = str3;
      } 
      str3 = paramBuilder.latitude;
      if (str3 == null) {
        this.latitude = "";
      } else {
        this.latitude = str3;
      } 
      Long long_2 = paramBuilder.addr_timestamp;
      if (long_2 == null) {
        this.addr_timestamp = DEFAULT_ADDR_TIMESTAMP;
      } else {
        this.addr_timestamp = long_2;
      } 
      String str2 = paramBuilder.asp_shown_info;
      if (str2 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str2;
      } 
      str2 = paramBuilder.mercator_lat;
      if (str2 == null) {
        this.mercator_lat = "";
      } else {
        this.mercator_lat = str2;
      } 
      str2 = paramBuilder.mercator_lon;
      if (str2 == null) {
        this.mercator_lon = "";
      } else {
        this.mercator_lon = str2;
      } 
      str2 = paramBuilder.mercator_radius;
      if (str2 == null) {
        this.mercator_radius = "";
      } else {
        this.mercator_radius = str2;
      } 
      Long long_1 = paramBuilder.mercator_time;
      if (long_1 == null) {
        this.mercator_time = DEFAULT_MERCATOR_TIME;
      } else {
        this.mercator_time = long_1;
      } 
      Integer integer = paramBuilder.mercator_city;
      if (integer == null) {
        this.mercator_city = DEFAULT_MERCATOR_CITY;
      } else {
        this.mercator_city = integer;
      } 
      String str1 = paramBuilder.mercator_province_name;
      if (str1 == null) {
        this.mercator_province_name = "";
      } else {
        this.mercator_province_name = str1;
      } 
      str1 = paramBuilder.mercator_city_name;
      if (str1 == null) {
        this.mercator_city_name = "";
      } else {
        this.mercator_city_name = str1;
      } 
      str = paramBuilder.mercator_district_name;
      if (str == null) {
        this.mercator_district_name = "";
      } else {
        this.mercator_district_name = str;
      } 
    } else {
      this.ap_mac = ((Builder)str).ap_mac;
      this.ap_connected = ((Builder)str).ap_connected;
      this.coordinate_type = ((Builder)str).coordinate_type;
      this.longitude = ((Builder)str).longitude;
      this.latitude = ((Builder)str).latitude;
      this.addr_timestamp = ((Builder)str).addr_timestamp;
      this.asp_shown_info = ((Builder)str).asp_shown_info;
      this.mercator_lat = ((Builder)str).mercator_lat;
      this.mercator_lon = ((Builder)str).mercator_lon;
      this.mercator_radius = ((Builder)str).mercator_radius;
      this.mercator_time = ((Builder)str).mercator_time;
      this.mercator_city = ((Builder)str).mercator_city;
      this.mercator_province_name = ((Builder)str).mercator_province_name;
      this.mercator_city_name = ((Builder)str).mercator_city_name;
      this.mercator_district_name = ((Builder)str).mercator_district_name;
    } 
  }
  
  public AppPosInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1216077456, "Ltbclient/AppPosInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1216077456, "Ltbclient/AppPosInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AppPosInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long addr_timestamp;
    
    public Boolean ap_connected;
    
    public String ap_mac;
    
    public String asp_shown_info;
    
    public String coordinate_type;
    
    public String latitude;
    
    public String longitude;
    
    public Integer mercator_city;
    
    public String mercator_city_name;
    
    public String mercator_district_name;
    
    public String mercator_lat;
    
    public String mercator_lon;
    
    public String mercator_province_name;
    
    public String mercator_radius;
    
    public Long mercator_time;
    
    public Builder() {}
    
    public Builder(AppPosInfo param1AppPosInfo) {
      super(param1AppPosInfo);
      if (param1AppPosInfo == null)
        return; 
      this.ap_mac = param1AppPosInfo.ap_mac;
      this.ap_connected = param1AppPosInfo.ap_connected;
      this.coordinate_type = param1AppPosInfo.coordinate_type;
      this.longitude = param1AppPosInfo.longitude;
      this.latitude = param1AppPosInfo.latitude;
      this.addr_timestamp = param1AppPosInfo.addr_timestamp;
      this.asp_shown_info = param1AppPosInfo.asp_shown_info;
      this.mercator_lat = param1AppPosInfo.mercator_lat;
      this.mercator_lon = param1AppPosInfo.mercator_lon;
      this.mercator_radius = param1AppPosInfo.mercator_radius;
      this.mercator_time = param1AppPosInfo.mercator_time;
      this.mercator_city = param1AppPosInfo.mercator_city;
      this.mercator_province_name = param1AppPosInfo.mercator_province_name;
      this.mercator_city_name = param1AppPosInfo.mercator_city_name;
      this.mercator_district_name = param1AppPosInfo.mercator_district_name;
    }
    
    public AppPosInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppPosInfo)interceptResult.objValue; 
      } 
      return new AppPosInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
