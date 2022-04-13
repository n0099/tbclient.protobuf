package GetGiftList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PresentCategoryList extends Message {
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final List<Integer> DEFAULT_GIFT_IDS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT32)
  public final List<Integer> gift_ids;
  
  public PresentCategoryList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      String str = paramBuilder.category_name;
      if (str == null) {
        this.category_name = "";
      } else {
        this.category_name = str;
      } 
      list = paramBuilder.gift_ids;
      if (list == null) {
        this.gift_ids = DEFAULT_GIFT_IDS;
      } else {
        this.gift_ids = Message.immutableCopyOf(list);
      } 
    } else {
      this.category_id = ((Builder)list).category_id;
      this.category_name = ((Builder)list).category_name;
      this.gift_ids = Message.immutableCopyOf(((Builder)list).gift_ids);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1622044377, "Ltbclient/GetGiftList/PresentCategoryList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1622044377, "Ltbclient/GetGiftList/PresentCategoryList;");
          return;
        } 
      } 
    } 
  }
}
