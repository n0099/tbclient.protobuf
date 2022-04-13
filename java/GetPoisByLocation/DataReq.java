package GetPoisByLocation;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lng;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.lat;
      if (str == null) {
        this.lat = "";
      } else {
        this.lat = str;
      } 
      str = paramBuilder.lng;
      if (str == null) {
        this.lng = "";
      } else {
        this.lng = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.lat = paramBuilder.lat;
      this.lng = paramBuilder.lng;
      this.common = paramBuilder.common;
    } 
  }
}
