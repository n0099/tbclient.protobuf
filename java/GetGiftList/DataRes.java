package tbclient.GetGiftList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ADDFREE_URL = "";
  
  public static final Integer DEFAULT_CURRENCY_TYPE;
  
  public static final Integer DEFAULT_FREE_CHANCE;
  
  public static final List<PresentGiftList1> DEFAULT_GIFT_LIST;
  
  public static final List<PresentCategoryList> DEFAULT_LIST = Collections.emptyList();
  
  public static final List<PresentNumInfo> DEFAULT_NUM_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
    if (paramBoolean == true) {
      List<PresentCategoryList> list2 = paramBuilder.list;
      if (list2 == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list2);
      } 
      List<PresentNumInfo> list1 = paramBuilder.num_info;
      if (list1 == null) {
        this.num_info = DEFAULT_NUM_INFO;
      } else {
        this.num_info = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.addfree_url;
      if (str == null) {
        this.addfree_url = "";
      } else {
        this.addfree_url = str;
      } 
      List<PresentGiftList1> list = paramBuilder.gift_list;
      if (list == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list);
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
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String addfree_url;
    
    public UrlTitle currency_txt;
    
    public Integer currency_type;
    
    public Integer free_chance;
    
    public List<PresentGiftList1> gift_list;
    
    public List<PresentCategoryList> list;
    
    public List<PresentNumInfo> num_info;
    
    public Integer scene_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.list = Message.copyOf(param1DataRes.list);
      this.num_info = Message.copyOf(param1DataRes.num_info);
      this.addfree_url = param1DataRes.addfree_url;
      this.gift_list = Message.copyOf(param1DataRes.gift_list);
      this.free_chance = param1DataRes.free_chance;
      this.scene_id = param1DataRes.scene_id;
      this.currency_type = param1DataRes.currency_type;
      this.currency_txt = param1DataRes.currency_txt;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
