import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BaijiahaoInfo;
import tbclient.BawuRoleInfoPub;

public final class BawuRoleInfoPub extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_ROLE_ID;
  
  public static final String DEFAULT_ROLE_NAME = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 10)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer role_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String role_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(15256105, "Ltbclient/BawuRoleInfoPub;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(15256105, "Ltbclient/BawuRoleInfoPub;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_USER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_ROLE_ID = integer;
    DEFAULT_USER_LEVEL = integer;
  }
  
  public BawuRoleInfoPub(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer2 = paramBuilder.role_id;
      if (integer2 == null) {
        this.role_id = DEFAULT_ROLE_ID;
      } else {
        this.role_id = integer2;
      } 
      String str2 = paramBuilder.role_name;
      if (str2 == null) {
        this.role_name = "";
      } else {
        this.role_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Integer integer1 = paramBuilder.user_level;
      if (integer1 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer1;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
    } else {
      this.forum_id = paramBuilder.forum_id;
      this.user_id = paramBuilder.user_id;
      this.role_id = paramBuilder.role_id;
      this.role_name = paramBuilder.role_name;
      this.portrait = paramBuilder.portrait;
      this.user_level = paramBuilder.user_level;
      this.level_name = paramBuilder.level_name;
      this.user_name = paramBuilder.user_name;
      this.name_show = paramBuilder.name_show;
      this.baijiahao_info = paramBuilder.baijiahao_info;
    } 
  }
}
