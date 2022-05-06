package GetLevelInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LevelInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final List<LevelInfo> DEFAULT_LEVEL_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LevelInfo> level_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list = paramBuilder.level_info;
      if (list == null) {
        this.level_info = DEFAULT_LEVEL_INFO;
      } else {
        this.level_info = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
      integer = paramBuilder.user_level;
      if (integer == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer;
      } 
      str = paramBuilder.level_name;
      if (str == null) {
        this.level_name = "";
      } else {
        this.level_name = str;
      } 
    } else {
      this.level_info = Message.immutableCopyOf(((Builder)str).level_info);
      this.is_like = ((Builder)str).is_like;
      this.user_level = ((Builder)str).user_level;
      this.level_name = ((Builder)str).level_name;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1421666542, "Ltbclient/GetLevelInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1421666542, "Ltbclient/GetLevelInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
