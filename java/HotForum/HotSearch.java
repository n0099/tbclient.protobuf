package tbclient.HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotSearch extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_JUMP_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
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
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<HotSearch> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer jump_type;
    
    public String search_title;
    
    public SearchValue search_value;
    
    public Builder() {}
    
    public Builder(HotSearch param1HotSearch) {
      super(param1HotSearch);
      if (param1HotSearch == null)
        return; 
      this.search_title = param1HotSearch.search_title;
      this.search_value = param1HotSearch.search_value;
      this.jump_type = param1HotSearch.jump_type;
    }
    
    public HotSearch build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotSearch)interceptResult.objValue; 
      } 
      return new HotSearch(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
