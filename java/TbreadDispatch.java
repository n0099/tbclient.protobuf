import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TbreadDispatch;

public final class TbreadDispatch extends Message {
  public static final String DEFAULT_FLOOR_NUM = "";
  
  public static final String DEFAULT_PRODUCT_ID = "";
  
  public static final String DEFAULT_PRODUCT_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String floor_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String product_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String product_type;
  
  public TbreadDispatch(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.floor_num;
      if (str1 == null) {
        this.floor_num = "";
      } else {
        this.floor_num = str1;
      } 
      str1 = paramBuilder.product_type;
      if (str1 == null) {
        this.product_type = "";
      } else {
        this.product_type = str1;
      } 
      str = paramBuilder.product_id;
      if (str == null) {
        this.product_id = "";
      } else {
        this.product_id = str;
      } 
    } else {
      this.floor_num = ((Builder)str).floor_num;
      this.product_type = ((Builder)str).product_type;
      this.product_id = ((Builder)str).product_id;
    } 
  }
}
