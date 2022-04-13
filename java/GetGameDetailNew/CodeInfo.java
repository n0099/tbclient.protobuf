package GetGameDetailNew;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CodeInfo extends Message {
  public static final Integer DEFAULT_CODE_STATUS;
  
  public static final Integer DEFAULT_CODE_TYPE;
  
  public static final String DEFAULT_GAME_CODE = "";
  
  public static final String DEFAULT_GIFT_CODE = "";
  
  public static final Integer DEFAULT_KAIFU_ID;
  
  public static final Integer DEFAULT_USER_STATUS;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer code_status;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer code_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String game_code;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String gift_code;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer kaifu_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer user_status;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1448885154, "Ltbclient/GetGameDetailNew/CodeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1448885154, "Ltbclient/GetGameDetailNew/CodeInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_STATUS = integer;
    DEFAULT_CODE_STATUS = integer;
    DEFAULT_KAIFU_ID = integer;
    DEFAULT_CODE_TYPE = integer;
  }
  
  public CodeInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.user_status;
      if (integer == null) {
        this.user_status = DEFAULT_USER_STATUS;
      } else {
        this.user_status = integer;
      } 
      integer = paramBuilder.code_status;
      if (integer == null) {
        this.code_status = DEFAULT_CODE_STATUS;
      } else {
        this.code_status = integer;
      } 
      integer = paramBuilder.kaifu_id;
      if (integer == null) {
        this.kaifu_id = DEFAULT_KAIFU_ID;
      } else {
        this.kaifu_id = integer;
      } 
      integer = paramBuilder.code_type;
      if (integer == null) {
        this.code_type = DEFAULT_CODE_TYPE;
      } else {
        this.code_type = integer;
      } 
      String str1 = paramBuilder.gift_code;
      if (str1 == null) {
        this.gift_code = "";
      } else {
        this.gift_code = str1;
      } 
      str = paramBuilder.game_code;
      if (str == null) {
        this.game_code = "";
      } else {
        this.game_code = str;
      } 
    } else {
      this.user_status = ((Builder)str).user_status;
      this.code_status = ((Builder)str).code_status;
      this.kaifu_id = ((Builder)str).kaifu_id;
      this.code_type = ((Builder)str).code_type;
      this.gift_code = ((Builder)str).gift_code;
      this.game_code = ((Builder)str).game_code;
    } 
  }
}
