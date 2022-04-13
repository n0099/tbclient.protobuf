package GetAddressList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetAddressList.LbsInfo;

public final class friendList extends Message {
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_QUANPIN = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5)
  public final LbsInfo location;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String quanpin;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public friendList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.quanpin;
      if (str1 == null) {
        this.quanpin = "";
      } else {
        this.quanpin = str1;
      } 
      this.location = paramBuilder.location;
      str = paramBuilder.name_show;
      if (str == null) {
        this.name_show = "";
      } else {
        this.name_show = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.quanpin = ((Builder)str).quanpin;
      this.location = ((Builder)str).location;
      this.name_show = ((Builder)str).name_show;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-204688458, "Ltbclient/GetAddressList/friendList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-204688458, "Ltbclient/GetAddressList/friendList;");
          return;
        } 
      } 
    } 
  }
}
