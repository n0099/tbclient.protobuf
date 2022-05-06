import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Lbs;

public final class Lbs extends Message {
  public static final String DEFAULT_DISTANCE = "";
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SN = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String distance;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lng;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sn;
  
  public Lbs(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.lat;
      if (str1 == null) {
        this.lat = "";
      } else {
        this.lat = str1;
      } 
      str1 = paramBuilder.lng;
      if (str1 == null) {
        this.lng = "";
      } else {
        this.lng = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.sn;
      if (str1 == null) {
        this.sn = "";
      } else {
        this.sn = str1;
      } 
      str = paramBuilder.distance;
      if (str == null) {
        this.distance = "";
      } else {
        this.distance = str;
      } 
    } else {
      this.lat = ((Builder)str).lat;
      this.lng = ((Builder)str).lng;
      this.name = ((Builder)str).name;
      this.sn = ((Builder)str).sn;
      this.distance = ((Builder)str).distance;
    } 
  }
}
