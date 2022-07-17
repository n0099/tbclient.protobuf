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

public final class PresentCategoryList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final List<Integer> DEFAULT_GIFT_IDS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT32)
  public final List<Integer> gift_ids;
  
  public PresentCategoryList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
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
  
  public PresentCategoryList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<PresentCategoryList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer category_id;
    
    public String category_name;
    
    public List<Integer> gift_ids;
    
    public Builder() {}
    
    public Builder(PresentCategoryList param1PresentCategoryList) {
      super(param1PresentCategoryList);
      if (param1PresentCategoryList == null)
        return; 
      this.category_id = param1PresentCategoryList.category_id;
      this.category_name = param1PresentCategoryList.category_name;
      this.gift_ids = Message.copyOf(param1PresentCategoryList.gift_ids);
    }
    
    public PresentCategoryList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PresentCategoryList)interceptResult.objValue; 
      } 
      return new PresentCategoryList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
