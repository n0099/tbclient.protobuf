package ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfo extends Message {
  public static final Long DEFAULT_GENDER;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long gender;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1388425274, "Ltbclient/ExcPbPage/UserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1388425274, "Ltbclient/ExcPbPage/UserInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_GENDER = long_;
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.id;
      if (long_1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.gender;
      if (long_ == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.name = ((Builder)long_).name;
      this.portrait = ((Builder)long_).portrait;
      this.gender = ((Builder)long_).gender;
    } 
  }
}
