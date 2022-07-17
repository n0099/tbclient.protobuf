package tbclient.ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SpecialColumnList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<SpecialColumn> DEFAULT_ITEM_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SPECIAL_COLUMN_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SpecialColumn> item_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String special_column_name;
  
  public SpecialColumnList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SpecialColumn> list;
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
  
  public SpecialColumnList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<SpecialColumnList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer floor_position;
    
    public List<SpecialColumn> item_list;
    
    public String special_column_name;
    
    public Builder() {}
    
    public Builder(SpecialColumnList param1SpecialColumnList) {
      super(param1SpecialColumnList);
      if (param1SpecialColumnList == null)
        return; 
      this.floor_position = param1SpecialColumnList.floor_position;
      this.special_column_name = param1SpecialColumnList.special_column_name;
      this.item_list = Message.copyOf(param1SpecialColumnList.item_list);
    }
    
    public SpecialColumnList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SpecialColumnList)interceptResult.objValue; 
      } 
      return new SpecialColumnList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
