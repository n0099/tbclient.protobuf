package GetPoisByLocation;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PoiInfo extends Message {
  public static final String DEFAULT_ADDR = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SN = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String addr;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sn;
  
  public PoiInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.addr;
      if (str1 == null) {
        this.addr = "";
      } else {
        this.addr = str1;
      } 
      str = paramBuilder.sn;
      if (str == null) {
        this.sn = "";
      } else {
        this.sn = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.addr = ((Builder)str).addr;
      this.sn = ((Builder)str).sn;
    } 
  }
}
