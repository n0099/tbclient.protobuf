import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.HotUserRankEntry;
import tbclient.ShortUserInfo;

public final class HotUserRankEntry extends Message {
  public static final List<ShortUserInfo> DEFAULT_HOT_USER = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_IN_RANK;
  
  public static final String DEFAULT_MODULE_ICON = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_TODAY_RANK;
  
  public static final Integer DEFAULT_YESTERDAY_RANK;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ShortUserInfo> hot_user;
  
  @ProtoField(tag = 6, type = Message.Datatype.BOOL)
  public final Boolean is_in_rank;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String module_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer today_rank;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer yesterday_rank;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TODAY_RANK = integer;
    DEFAULT_YESTERDAY_RANK = integer;
    DEFAULT_IS_IN_RANK = Boolean.FALSE;
  }
  
  public HotUserRankEntry(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List list = paramBuilder.hot_user;
      if (list == null) {
        this.hot_user = DEFAULT_HOT_USER;
      } else {
        this.hot_user = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      str = paramBuilder.module_icon;
      if (str == null) {
        this.module_icon = "";
      } else {
        this.module_icon = str;
      } 
      Integer integer = paramBuilder.today_rank;
      if (integer == null) {
        this.today_rank = DEFAULT_TODAY_RANK;
      } else {
        this.today_rank = integer;
      } 
      integer = paramBuilder.yesterday_rank;
      if (integer == null) {
        this.yesterday_rank = DEFAULT_YESTERDAY_RANK;
      } else {
        this.yesterday_rank = integer;
      } 
      bool = paramBuilder.is_in_rank;
      if (bool == null) {
        this.is_in_rank = DEFAULT_IS_IN_RANK;
      } else {
        this.is_in_rank = bool;
      } 
    } else {
      this.hot_user = Message.immutableCopyOf(((Builder)bool).hot_user);
      this.module_name = ((Builder)bool).module_name;
      this.module_icon = ((Builder)bool).module_icon;
      this.today_rank = ((Builder)bool).today_rank;
      this.yesterday_rank = ((Builder)bool).yesterday_rank;
      this.is_in_rank = ((Builder)bool).is_in_rank;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2086985341, "Ltbclient/HotUserRankEntry;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2086985341, "Ltbclient/HotUserRankEntry;");
          return;
        } 
      } 
    } 
  }
}
