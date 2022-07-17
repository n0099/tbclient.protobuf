package tbclient.HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SearchValue extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1718854781, "Ltbclient/HotForum/SearchValue;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1718854781, "Ltbclient/HotForum/SearchValue;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TYPE = long_;
    DEFAULT_ID = long_;
  }
  
  public SearchValue(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.type;
      if (long_ == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = long_;
      } 
      long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public SearchValue(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchValue> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public Long id;
    
    public String name;
    
    public Long type;
    
    public Builder() {}
    
    public Builder(SearchValue param1SearchValue) {
      super(param1SearchValue);
      if (param1SearchValue == null)
        return; 
      this.type = param1SearchValue.type;
      this.id = param1SearchValue.id;
      this.name = param1SearchValue.name;
      this.desc = param1SearchValue.desc;
    }
    
    public SearchValue build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SearchValue)interceptResult.objValue; 
      } 
      return new SearchValue(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
