import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SimpleUser;

public final class SimpleUser extends Message {
  public static final Integer DEFAULT_AGREE_TYPE;
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_BLOCK_MSG = "";
  
  public static final Integer DEFAULT_INCOMPLETE_USER;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SECUREEMAIL = "";
  
  public static final String DEFAULT_SECUREMOBIL = "";
  
  public static final Integer DEFAULT_SHOW_ONLYME;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_NICKNAME = "";
  
  public static final Integer DEFAULT_USER_STATUS;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer agree_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String block_msg;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer incomplete_user;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String secureemail;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String securemobil;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer show_onlyme;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String user_nickname;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer user_status;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_STATUS = integer;
    DEFAULT_INCOMPLETE_USER = integer;
    DEFAULT_AGREE_TYPE = integer;
    DEFAULT_SHOW_ONLYME = integer;
  }
  
  public SimpleUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer3 = paramBuilder.user_status;
      if (integer3 == null) {
        this.user_status = DEFAULT_USER_STATUS;
      } else {
        this.user_status = integer3;
      } 
      String str3 = paramBuilder.secureemail;
      if (str3 == null) {
        this.secureemail = "";
      } else {
        this.secureemail = str3;
      } 
      str3 = paramBuilder.securemobil;
      if (str3 == null) {
        this.securemobil = "";
      } else {
        this.securemobil = str3;
      } 
      str3 = paramBuilder.user_name;
      if (str3 == null) {
        this.user_name = "";
      } else {
        this.user_name = str3;
      } 
      str3 = paramBuilder.user_nickname;
      if (str3 == null) {
        this.user_nickname = "";
      } else {
        this.user_nickname = str3;
      } 
      Integer integer2 = paramBuilder.incomplete_user;
      if (integer2 == null) {
        this.incomplete_user = DEFAULT_INCOMPLETE_USER;
      } else {
        this.incomplete_user = integer2;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Integer integer1 = paramBuilder.agree_type;
      if (integer1 == null) {
        this.agree_type = DEFAULT_AGREE_TYPE;
      } else {
        this.agree_type = integer1;
      } 
      String str1 = paramBuilder.ahead_url;
      if (str1 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str1;
      } 
      str1 = paramBuilder.block_msg;
      if (str1 == null) {
        this.block_msg = "";
      } else {
        this.block_msg = str1;
      } 
      integer = paramBuilder.show_onlyme;
      if (integer == null) {
        this.show_onlyme = DEFAULT_SHOW_ONLYME;
      } else {
        this.show_onlyme = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_status = ((Builder)integer).user_status;
      this.secureemail = ((Builder)integer).secureemail;
      this.securemobil = ((Builder)integer).securemobil;
      this.user_name = ((Builder)integer).user_name;
      this.user_nickname = ((Builder)integer).user_nickname;
      this.incomplete_user = ((Builder)integer).incomplete_user;
      this.portrait = ((Builder)integer).portrait;
      this.agree_type = ((Builder)integer).agree_type;
      this.ahead_url = ((Builder)integer).ahead_url;
      this.block_msg = ((Builder)integer).block_msg;
      this.show_onlyme = ((Builder)integer).show_onlyme;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(184794132, "Ltbclient/SimpleUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(184794132, "Ltbclient/SimpleUser;");
          return;
        } 
      } 
    } 
  }
}
