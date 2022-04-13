import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TiebaPlusAd;

public final class TiebaPlusAd extends Message {
  public static final String DEFAULT_AD_SOURCE = "";
  
  public static final String DEFAULT_COST_URL = "";
  
  public static final String DEFAULT_SHOW_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_source;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String cost_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String show_url;
  
  public TiebaPlusAd(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.cost_url;
      if (str1 == null) {
        this.cost_url = "";
      } else {
        this.cost_url = str1;
      } 
      str1 = paramBuilder.show_url;
      if (str1 == null) {
        this.show_url = "";
      } else {
        this.show_url = str1;
      } 
      str = paramBuilder.ad_source;
      if (str == null) {
        this.ad_source = "";
      } else {
        this.ad_source = str;
      } 
    } else {
      this.cost_url = ((Builder)str).cost_url;
      this.show_url = ((Builder)str).show_url;
      this.ad_source = ((Builder)str).ad_source;
    } 
  }
}
