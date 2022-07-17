package tbclient.GetTails;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TailInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final Integer DEFAULT_IS_SELECTED;
  
  public static final String DEFAULT_TAILCONTENT = "";
  
  public static final Integer DEFAULT_TAILID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_selected;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tailContent;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tailId;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(486387205, "Ltbclient/GetTails/TailInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(486387205, "Ltbclient/GetTails/TailInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAILID = integer;
    DEFAULT_IS_SELECTED = integer;
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tailId;
      if (integer == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = integer;
      } 
      integer = paramBuilder.is_selected;
      if (integer == null) {
        this.is_selected = DEFAULT_IS_SELECTED;
      } else {
        this.is_selected = integer;
      } 
      String str1 = paramBuilder.tailContent;
      if (str1 == null) {
        this.tailContent = "";
      } else {
        this.tailContent = str1;
      } 
      str1 = paramBuilder.fontColor;
      if (str1 == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str1;
      } 
      str = paramBuilder.fontKeyName;
      if (str == null) {
        this.fontKeyName = "";
      } else {
        this.fontKeyName = str;
      } 
    } else {
      this.tailId = ((Builder)str).tailId;
      this.is_selected = ((Builder)str).is_selected;
      this.tailContent = ((Builder)str).tailContent;
      this.fontColor = ((Builder)str).fontColor;
      this.fontKeyName = ((Builder)str).fontKeyName;
    } 
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TailInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String fontColor;
    
    public String fontKeyName;
    
    public Integer is_selected;
    
    public String tailContent;
    
    public Integer tailId;
    
    public Builder() {}
    
    public Builder(TailInfo param1TailInfo) {
      super(param1TailInfo);
      if (param1TailInfo == null)
        return; 
      this.tailId = param1TailInfo.tailId;
      this.is_selected = param1TailInfo.is_selected;
      this.tailContent = param1TailInfo.tailContent;
      this.fontColor = param1TailInfo.fontColor;
      this.fontKeyName = param1TailInfo.fontKeyName;
    }
    
    public TailInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TailInfo)interceptResult.objValue; 
      } 
      return new TailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
