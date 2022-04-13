package HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.HotForum.SearchValue;

public final class HotSearch extends Message {
  public static final Integer DEFAULT_JUMP_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
      this.search_value = paramBuilder.search_value;
      integer = paramBuilder.jump_type;
      if (integer == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer;
      } 
    } else {
      this.search_title = ((Builder)integer).search_title;
      this.search_value = ((Builder)integer).search_value;
      this.jump_type = ((Builder)integer).jump_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-622060137, "Ltbclient/HotForum/HotSearch;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-622060137, "Ltbclient/HotForum/HotSearch;");
          return;
        } 
      } 
    } 
  }
}
