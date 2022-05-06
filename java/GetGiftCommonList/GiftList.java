package GetGiftCommonList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetGiftCommonList.Item;

public final class GiftList extends Message {
  public static final List<Item> DEFAULT_ITEM;
  
  public static final Integer DEFAULT_TYPE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Item> item;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type_name;
  
  static {
    DEFAULT_ITEM = Collections.emptyList();
  }
  
  public GiftList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.type_name;
      if (str == null) {
        this.type_name = "";
      } else {
        this.type_name = str;
      } 
      Integer integer = paramBuilder.type_id;
      if (integer == null) {
        this.type_id = DEFAULT_TYPE_ID;
      } else {
        this.type_id = integer;
      } 
      list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
    } else {
      this.type_name = ((Builder)list).type_name;
      this.type_id = ((Builder)list).type_id;
      this.item = Message.immutableCopyOf(((Builder)list).item);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1732883933, "Ltbclient/GetGiftCommonList/GiftList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1732883933, "Ltbclient/GetGiftCommonList/GiftList;");
          return;
        } 
      } 
    } 
  }
}
