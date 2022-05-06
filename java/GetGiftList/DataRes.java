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
import tbclient.GetGiftList.PresentCategoryList;
import tbclient.GetGiftList.PresentGiftList1;
import tbclient.GetGiftList.PresentNumInfo;
import tbclient.GetGiftList.UrlTitle;

public final class DataRes extends Message {
  public static final String DEFAULT_ADDFREE_URL = "";
  
  public static final Integer DEFAULT_CURRENCY_TYPE;
  
  public static final Integer DEFAULT_FREE_CHANCE;
  
  public static final List<PresentGiftList1> DEFAULT_GIFT_LIST;
  
  public static final List<PresentCategoryList> DEFAULT_LIST = Collections.emptyList();
  
  public static final List<PresentNumInfo> DEFAULT_NUM_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_SCENE_ID;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String addfree_url;
  
  @ProtoField(tag = 8)
  public final UrlTitle currency_txt;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer currency_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer free_chance;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<PresentGiftList1> gift_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PresentCategoryList> list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PresentNumInfo> num_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  static {
    DEFAULT_GIFT_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_FREE_CHANCE = integer;
    DEFAULT_SCENE_ID = integer;
    DEFAULT_CURRENCY_TYPE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list2 = paramBuilder.list;
      if (list2 == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.num_info;
      if (list2 == null) {
        this.num_info = DEFAULT_NUM_INFO;
      } else {
        this.num_info = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.addfree_url;
      if (str == null) {
        this.addfree_url = "";
      } else {
        this.addfree_url = str;
      } 
      List list1 = paramBuilder.gift_list;
      if (list1 == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.free_chance;
      if (integer == null) {
        this.free_chance = DEFAULT_FREE_CHANCE;
      } else {
        this.free_chance = integer;
      } 
      integer = paramBuilder.scene_id;
      if (integer == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer;
      } 
      integer = paramBuilder.currency_type;
      if (integer == null) {
        this.currency_type = DEFAULT_CURRENCY_TYPE;
      } else {
        this.currency_type = integer;
      } 
      this.currency_txt = paramBuilder.currency_txt;
    } else {
      this.list = Message.immutableCopyOf(paramBuilder.list);
      this.num_info = Message.immutableCopyOf(paramBuilder.num_info);
      this.addfree_url = paramBuilder.addfree_url;
      this.gift_list = Message.immutableCopyOf(paramBuilder.gift_list);
      this.free_chance = paramBuilder.free_chance;
      this.scene_id = paramBuilder.scene_id;
      this.currency_type = paramBuilder.currency_type;
      this.currency_txt = paramBuilder.currency_txt;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2016215878, "Ltbclient/GetGiftList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2016215878, "Ltbclient/GetGiftList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
