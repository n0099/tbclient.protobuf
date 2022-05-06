import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LbsInfo;

public final class LbsInfo extends Message {
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LON = "";
  
  public static final String DEFAULT_TOWN = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String town;
  
  public LbsInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.lat;
      if (str1 == null) {
        this.lat = "";
      } else {
        this.lat = str1;
      } 
      str1 = paramBuilder.lon;
      if (str1 == null) {
        this.lon = "";
      } else {
        this.lon = str1;
      } 
      str = paramBuilder.town;
      if (str == null) {
        this.town = "";
      } else {
        this.town = str;
      } 
    } else {
      this.lat = ((Builder)str).lat;
      this.lon = ((Builder)str).lon;
      this.town = ((Builder)str).town;
    } 
  }
}
