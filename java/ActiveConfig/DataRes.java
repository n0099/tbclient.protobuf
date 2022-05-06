package ActiveConfig;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.FloatStrategy;
import tbclient.MissionInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final List<FloatStrategy> DEFAULT_FLOAT_LIST;
  
  public static final Integer DEFAULT_IS_NEW_USER = Integer.valueOf(0);
  
  public static final List<MissionInfo> DEFAULT_MISSION_LIST = Collections.emptyList();
  
  public static final String DEFAULT_NEWUSER_POP_CLICKURL = "";
  
  public static final String DEFAULT_NEWUSER_POP_MONEY = "";
  
  public static final String DEFAULT_NEWUSER_POP_TOP = "";
  
  @ProtoField(tag = 9)
  public final ActiveCenter active_center;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<FloatStrategy> float_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_new_user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<MissionInfo> mission_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String newuser_pop_clickurl;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String newuser_pop_money;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String newuser_pop_top;
  
  static {
    DEFAULT_FLOAT_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_new_user;
      if (integer == null) {
        this.is_new_user = DEFAULT_IS_NEW_USER;
      } else {
        this.is_new_user = integer;
      } 
      String str2 = paramBuilder.active_url;
      if (str2 == null) {
        this.active_url = "";
      } else {
        this.active_url = str2;
      } 
      List list = paramBuilder.mission_list;
      if (list == null) {
        this.mission_list = DEFAULT_MISSION_LIST;
      } else {
        this.mission_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.float_list;
      if (list == null) {
        this.float_list = DEFAULT_FLOAT_LIST;
      } else {
        this.float_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.newuser_pop_clickurl;
      if (str1 == null) {
        this.newuser_pop_clickurl = "";
      } else {
        this.newuser_pop_clickurl = str1;
      } 
      str1 = paramBuilder.newuser_pop_money;
      if (str1 == null) {
        this.newuser_pop_money = "";
      } else {
        this.newuser_pop_money = str1;
      } 
      str1 = paramBuilder.newuser_pop_top;
      if (str1 == null) {
        this.newuser_pop_top = "";
      } else {
        this.newuser_pop_top = str1;
      } 
      this.active_center = paramBuilder.active_center;
    } else {
      this.is_new_user = paramBuilder.is_new_user;
      this.active_url = paramBuilder.active_url;
      this.mission_list = Message.immutableCopyOf(paramBuilder.mission_list);
      this.float_list = Message.immutableCopyOf(paramBuilder.float_list);
      this.newuser_pop_clickurl = paramBuilder.newuser_pop_clickurl;
      this.newuser_pop_money = paramBuilder.newuser_pop_money;
      this.newuser_pop_top = paramBuilder.newuser_pop_top;
      this.active_center = paramBuilder.active_center;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-314789854, "Ltbclient/ActiveConfig/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-314789854, "Ltbclient/ActiveConfig/DataRes;");
          return;
        } 
      } 
    } 
  }
}
