import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GiftInfo;

public final class GiftInfo extends Message {
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final String DEFAULT_GIFT_NAME = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_LARGE_THUMBNAIL_URL = "";
  
  public static final Integer DEFAULT_NUM;
  
  public static final Long DEFAULT_SENDER_ID;
  
  public static final String DEFAULT_SENDER_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String gift_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String large_thumbnail_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long sender_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String sender_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(453469267, "Ltbclient/GiftInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(453469267, "Ltbclient/GiftInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NUM = integer;
    DEFAULT_GIFT_ID = integer;
    DEFAULT_SENDER_ID = Long.valueOf(0L);
  }
  
  public GiftInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      Integer integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      integer = paramBuilder.gift_id;
      if (integer == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer;
      } 
      String str1 = paramBuilder.gift_name;
      if (str1 == null) {
        this.gift_name = "";
      } else {
        this.gift_name = str1;
      } 
      str1 = paramBuilder.large_thumbnail_url;
      if (str1 == null) {
        this.large_thumbnail_url = "";
      } else {
        this.large_thumbnail_url = str1;
      } 
      Long long_ = paramBuilder.sender_id;
      if (long_ == null) {
        this.sender_id = DEFAULT_SENDER_ID;
      } else {
        this.sender_id = long_;
      } 
      str = paramBuilder.sender_name;
      if (str == null) {
        this.sender_name = "";
      } else {
        this.sender_name = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.num = ((Builder)str).num;
      this.gift_id = ((Builder)str).gift_id;
      this.gift_name = ((Builder)str).gift_name;
      this.large_thumbnail_url = ((Builder)str).large_thumbnail_url;
      this.sender_id = ((Builder)str).sender_id;
      this.sender_name = ((Builder)str).sender_name;
    } 
  }
}
