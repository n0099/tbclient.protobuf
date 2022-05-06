import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;

public final class AppTransmitData extends Message {
  public static final String DEFAULT_WISE_SAMPLE_ID = "";
  
  public static final String DEFAULT_YY_HDID = "";
  
  public static final String DEFAULT_YY_VERSION = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String wise_sample_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String yy_hdid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String yy_version;
  
  public AppTransmitData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.wise_sample_id;
      if (str1 == null) {
        this.wise_sample_id = "";
      } else {
        this.wise_sample_id = str1;
      } 
      str1 = paramBuilder.yy_hdid;
      if (str1 == null) {
        this.yy_hdid = "";
      } else {
        this.yy_hdid = str1;
      } 
      str = paramBuilder.yy_version;
      if (str == null) {
        this.yy_version = "";
      } else {
        this.yy_version = str;
      } 
    } else {
      this.wise_sample_id = ((Builder)str).wise_sample_id;
      this.yy_hdid = ((Builder)str).yy_hdid;
      this.yy_version = ((Builder)str).yy_version;
    } 
  }
}
