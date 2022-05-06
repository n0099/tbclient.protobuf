import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PluginUser;

public final class PluginUser extends Message {
  public static final Integer DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME_SHOW = "";
  
  public static final String DEFAULT_USER_PHOTO = "";
  
  public static final Integer DEFAULT_USER_TYPE;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_download_card_whiteuser;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name_show;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_photo;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_TYPE = integer;
    DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER = integer;
  }
  
  public PluginUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str2 = paramBuilder.user_name_show;
      if (str2 == null) {
        this.user_name_show = "";
      } else {
        this.user_name_show = str2;
      } 
      Integer integer1 = paramBuilder.user_type;
      if (integer1 == null) {
        this.user_type = DEFAULT_USER_TYPE;
      } else {
        this.user_type = integer1;
      } 
      String str1 = paramBuilder.user_photo;
      if (str1 == null) {
        this.user_photo = "";
      } else {
        this.user_photo = str1;
      } 
      integer = paramBuilder.is_download_card_whiteuser;
      if (integer == null) {
        this.is_download_card_whiteuser = DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER;
      } else {
        this.is_download_card_whiteuser = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name_show = ((Builder)integer).user_name_show;
      this.user_type = ((Builder)integer).user_type;
      this.user_photo = ((Builder)integer).user_photo;
      this.is_download_card_whiteuser = ((Builder)integer).is_download_card_whiteuser;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1793865933, "Ltbclient/PluginUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1793865933, "Ltbclient/PluginUser;");
          return;
        } 
      } 
    } 
  }
}
