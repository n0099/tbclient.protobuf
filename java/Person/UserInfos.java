package Person;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Icon;
import tbclient.Person.LbsInfo;

public final class UserInfos extends Message {
  public static final Double DEFAULT_DISTANCE;
  
  public static final List<Icon> DEFAULT_ICONINFO;
  
  public static final Integer DEFAULT_LASTEST_TIME;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SEX = "";
  
  public static final String DEFAULT_USERDETAIL = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
  public final Double distance;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Icon> iconinfo;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer lastest_time;
  
  @ProtoField(tag = 9)
  public final LbsInfo location;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sex;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String userdetail;
  
  static {
    DEFAULT_DISTANCE = Double.valueOf(0.0D);
    DEFAULT_LASTEST_TIME = Integer.valueOf(0);
    DEFAULT_ICONINFO = Collections.emptyList();
  }
  
  public UserInfos(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.sex;
      if (str2 == null) {
        this.sex = "";
      } else {
        this.sex = str2;
      } 
      Double double_ = paramBuilder.distance;
      if (double_ == null) {
        this.distance = DEFAULT_DISTANCE;
      } else {
        this.distance = double_;
      } 
      Integer integer = paramBuilder.lastest_time;
      if (integer == null) {
        this.lastest_time = DEFAULT_LASTEST_TIME;
      } else {
        this.lastest_time = integer;
      } 
      List list = paramBuilder.iconinfo;
      if (list == null) {
        this.iconinfo = DEFAULT_ICONINFO;
      } else {
        this.iconinfo = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.userdetail;
      if (str1 == null) {
        this.userdetail = "";
      } else {
        this.userdetail = str1;
      } 
      this.location = paramBuilder.location;
    } else {
      this.user_id = paramBuilder.user_id;
      this.user_name = paramBuilder.user_name;
      this.portrait = paramBuilder.portrait;
      this.sex = paramBuilder.sex;
      this.distance = paramBuilder.distance;
      this.lastest_time = paramBuilder.lastest_time;
      this.iconinfo = Message.immutableCopyOf(paramBuilder.iconinfo);
      this.userdetail = paramBuilder.userdetail;
      this.location = paramBuilder.location;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1397733775, "Ltbclient/Person/UserInfos;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1397733775, "Ltbclient/Person/UserInfos;");
          return;
        } 
      } 
    } 
  }
}
