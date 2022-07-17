package tbclient.ForumRecommend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotSearch extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
      this.search_value = paramBuilder.search_value;
    } else {
      this.search_title = paramBuilder.search_title;
      this.search_value = paramBuilder.search_value;
    } 
  }
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotSearch> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String search_title;
    
    public SearchValue search_value;
    
    public Builder() {}
    
    public Builder(HotSearch param1HotSearch) {
      super(param1HotSearch);
      if (param1HotSearch == null)
        return; 
      this.search_title = param1HotSearch.search_title;
      this.search_value = param1HotSearch.search_value;
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
