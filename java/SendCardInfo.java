import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SendCardInfo;

public final class SendCardInfo extends Message {
  public static final Integer DEFAULT_CARD_GET_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_CARD_LOGO = "";
  
  public static final String DEFAULT_CARD_NAME = "";
  
  public static final String DEFAULT_CARD_PRO = "";
  
  public static final Long DEFAULT_PACKET_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer card_get_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_logo;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String card_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String card_pro;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long packet_id;
  
  public SendCardInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.card_logo;
      if (str == null) {
        this.card_logo = "";
      } else {
        this.card_logo = str;
      } 
      str = paramBuilder.card_name;
      if (str == null) {
        this.card_name = "";
      } else {
        this.card_name = str;
      } 
      str = paramBuilder.card_pro;
      if (str == null) {
        this.card_pro = "";
      } else {
        this.card_pro = str;
      } 
      Integer integer = paramBuilder.card_get_status;
      if (integer == null) {
        this.card_get_status = DEFAULT_CARD_GET_STATUS;
      } else {
        this.card_get_status = integer;
      } 
      long_ = paramBuilder.packet_id;
      if (long_ == null) {
        this.packet_id = DEFAULT_PACKET_ID;
      } else {
        this.packet_id = long_;
      } 
    } else {
      this.card_logo = ((Builder)long_).card_logo;
      this.card_name = ((Builder)long_).card_name;
      this.card_pro = ((Builder)long_).card_pro;
      this.card_get_status = ((Builder)long_).card_get_status;
      this.packet_id = ((Builder)long_).packet_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-534270773, "Ltbclient/SendCardInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-534270773, "Ltbclient/SendCardInfo;");
          return;
        } 
      } 
    } 
  }
}
