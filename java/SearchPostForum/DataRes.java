package tbclient.SearchPostForum;

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
  
  public static final List<SearchForum> DEFAULT_FUZZY_MATCH = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final SearchForum exact_match;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SearchForum> fuzzy_match;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SearchForum> list;
    if (paramBoolean == true) {
      this.exact_match = paramBuilder.exact_match;
      list = paramBuilder.fuzzy_match;
      if (list == null) {
        this.fuzzy_match = DEFAULT_FUZZY_MATCH;
      } else {
        this.fuzzy_match = Message.immutableCopyOf(list);
      } 
    } else {
      this.exact_match = ((Builder)list).exact_match;
      this.fuzzy_match = Message.immutableCopyOf(((Builder)list).fuzzy_match);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-785279195, "Ltbclient/SearchPostForum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-785279195, "Ltbclient/SearchPostForum/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public SearchForum exact_match;
    
    public List<SearchForum> fuzzy_match;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.exact_match = param1DataRes.exact_match;
      this.fuzzy_match = Message.copyOf(param1DataRes.fuzzy_match);
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
