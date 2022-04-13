package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Group extends Message {
  public static final Integer DEFAULT_GROUP_COUNT;
  
  public static final Integer DEFAULT_HIDE_RECOMMEND_GROUP;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer group_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer hide_recommend_group;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(716929279, "Ltbclient/FrsPage/Group;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(716929279, "Ltbclient/FrsPage/Group;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_HIDE_RECOMMEND_GROUP = integer;
    DEFAULT_GROUP_COUNT = integer;
  }
  
  public Group(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.hide_recommend_group;
      if (integer1 == null) {
        this.hide_recommend_group = DEFAULT_HIDE_RECOMMEND_GROUP;
      } else {
        this.hide_recommend_group = integer1;
      } 
      integer = paramBuilder.group_count;
      if (integer == null) {
        this.group_count = DEFAULT_GROUP_COUNT;
      } else {
        this.group_count = integer;
      } 
    } else {
      this.hide_recommend_group = ((Builder)integer).hide_recommend_group;
      this.group_count = ((Builder)integer).group_count;
    } 
  }
}
