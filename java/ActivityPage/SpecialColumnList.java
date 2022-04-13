package ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActivityPage.SpecialColumn;

public final class SpecialColumnList extends Message {
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<SpecialColumn> DEFAULT_ITEM_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SPECIAL_COLUMN_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SpecialColumn> item_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String special_column_name;
  
  public SpecialColumnList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      String str = paramBuilder.special_column_name;
      if (str == null) {
        this.special_column_name = "";
      } else {
        this.special_column_name = str;
      } 
      list = paramBuilder.item_list;
      if (list == null) {
        this.item_list = DEFAULT_ITEM_LIST;
      } else {
        this.item_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.special_column_name = ((Builder)list).special_column_name;
      this.item_list = Message.immutableCopyOf(((Builder)list).item_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2061838485, "Ltbclient/ActivityPage/SpecialColumnList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2061838485, "Ltbclient/ActivityPage/SpecialColumnList;");
          return;
        } 
      } 
    } 
  }
}
