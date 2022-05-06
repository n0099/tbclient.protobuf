import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BaijiahaoInfo;

public final class BaijiahaoInfo extends Message {
  public static final String DEFAULT_AUTH_DESC = "";
  
  public static final Integer DEFAULT_AUTH_ID;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_AVATAR_H = "";
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final Integer DEFAULT_CAN_MODIFY_AVATAR;
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String auth_desc;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer auth_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar_h;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer can_modify_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1775892871, "Ltbclient/BaijiahaoInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1775892871, "Ltbclient/BaijiahaoInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUTH_ID = integer;
    DEFAULT_CAN_MODIFY_AVATAR = integer;
  }
  
  public BaijiahaoInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      str2 = paramBuilder.avatar_h;
      if (str2 == null) {
        this.avatar_h = "";
      } else {
        this.avatar_h = str2;
      } 
      str2 = paramBuilder.brief;
      if (str2 == null) {
        this.brief = "";
      } else {
        this.brief = str2;
      } 
      Integer integer1 = paramBuilder.auth_id;
      if (integer1 == null) {
        this.auth_id = DEFAULT_AUTH_ID;
      } else {
        this.auth_id = integer1;
      } 
      String str1 = paramBuilder.auth_desc;
      if (str1 == null) {
        this.auth_desc = "";
      } else {
        this.auth_desc = str1;
      } 
      integer = paramBuilder.can_modify_avatar;
      if (integer == null) {
        this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
      } else {
        this.can_modify_avatar = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.avatar = ((Builder)integer).avatar;
      this.avatar_h = ((Builder)integer).avatar_h;
      this.brief = ((Builder)integer).brief;
      this.auth_id = ((Builder)integer).auth_id;
      this.auth_desc = ((Builder)integer).auth_desc;
      this.can_modify_avatar = ((Builder)integer).can_modify_avatar;
    } 
  }
}
