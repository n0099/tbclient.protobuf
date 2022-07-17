package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TwAnchorTaskItem extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_COMPLETE;
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PROGRESS = "";
  
  public static final String DEFAULT_REMARK = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer complete;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String progress;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String remark;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1852894943, "Ltbclient/TwAnchorTaskItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1852894943, "Ltbclient/TwAnchorTaskItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_COMPLETE = integer;
  }
  
  public TwAnchorTaskItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.id;
      if (integer2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer2;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.progress;
      if (str2 == null) {
        this.progress = "";
      } else {
        this.progress = str2;
      } 
      Integer integer1 = paramBuilder.complete;
      if (integer1 == null) {
        this.complete = DEFAULT_COMPLETE;
      } else {
        this.complete = integer1;
      } 
      String str1 = paramBuilder.remark;
      if (str1 == null) {
        this.remark = "";
      } else {
        this.remark = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.progress = ((Builder)str).progress;
      this.complete = ((Builder)str).complete;
      this.remark = ((Builder)str).remark;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public TwAnchorTaskItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TwAnchorTaskItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer complete;
    
    public String icon;
    
    public Integer id;
    
    public String name;
    
    public String progress;
    
    public String remark;
    
    public Builder() {}
    
    public Builder(TwAnchorTaskItem param1TwAnchorTaskItem) {
      super(param1TwAnchorTaskItem);
      if (param1TwAnchorTaskItem == null)
        return; 
      this.id = param1TwAnchorTaskItem.id;
      this.name = param1TwAnchorTaskItem.name;
      this.progress = param1TwAnchorTaskItem.progress;
      this.complete = param1TwAnchorTaskItem.complete;
      this.remark = param1TwAnchorTaskItem.remark;
      this.icon = param1TwAnchorTaskItem.icon;
    }
    
    public TwAnchorTaskItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TwAnchorTaskItem)interceptResult.objValue; 
      } 
      return new TwAnchorTaskItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
