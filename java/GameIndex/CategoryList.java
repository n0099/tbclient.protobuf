package GameIndex;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;

public final class CategoryList extends Message {
  public static final List<GameInfo> DEFAULT_CATEGORY_GAME_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GameInfo> category_game_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String category_name;
  
  public CategoryList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.category_name;
      if (str == null) {
        this.category_name = "";
      } else {
        this.category_name = str;
      } 
      List list = paramBuilder.category_game_list;
      if (list == null) {
        this.category_game_list = DEFAULT_CATEGORY_GAME_LIST;
      } else {
        this.category_game_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
    } else {
      this.category_name = ((Builder)integer).category_name;
      this.category_game_list = Message.immutableCopyOf(((Builder)integer).category_game_list);
      this.category_id = ((Builder)integer).category_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-559125274, "Ltbclient/GameIndex/CategoryList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-559125274, "Ltbclient/GameIndex/CategoryList;");
          return;
        } 
      } 
    } 
  }
}
