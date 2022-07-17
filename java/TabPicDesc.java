package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabPicDesc extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PIC_HEIGHT;
  
  public static final Integer DEFAULT_PIC_WIDTH;
  
  public static final String DEFAULT_SELECTED_PIC_URL = "";
  
  public static final String DEFAULT_UNSELECTED_PIC_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pic_height;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pic_width;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String selected_pic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String unselected_pic_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-9148437, "Ltbclient/TabPicDesc;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-9148437, "Ltbclient/TabPicDesc;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PIC_HEIGHT = integer;
    DEFAULT_PIC_WIDTH = integer;
  }
  
  public TabPicDesc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.selected_pic_url;
      if (str == null) {
        this.selected_pic_url = "";
      } else {
        this.selected_pic_url = str;
      } 
      str = paramBuilder.unselected_pic_url;
      if (str == null) {
        this.unselected_pic_url = "";
      } else {
        this.unselected_pic_url = str;
      } 
      Integer integer1 = paramBuilder.pic_height;
      if (integer1 == null) {
        this.pic_height = DEFAULT_PIC_HEIGHT;
      } else {
        this.pic_height = integer1;
      } 
      integer = paramBuilder.pic_width;
      if (integer == null) {
        this.pic_width = DEFAULT_PIC_WIDTH;
      } else {
        this.pic_width = integer;
      } 
    } else {
      this.selected_pic_url = ((Builder)integer).selected_pic_url;
      this.unselected_pic_url = ((Builder)integer).unselected_pic_url;
      this.pic_height = ((Builder)integer).pic_height;
      this.pic_width = ((Builder)integer).pic_width;
    } 
  }
  
  public TabPicDesc(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TabPicDesc> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer pic_height;
    
    public Integer pic_width;
    
    public String selected_pic_url;
    
    public String unselected_pic_url;
    
    public Builder() {}
    
    public Builder(TabPicDesc param1TabPicDesc) {
      super(param1TabPicDesc);
      if (param1TabPicDesc == null)
        return; 
      this.selected_pic_url = param1TabPicDesc.selected_pic_url;
      this.unselected_pic_url = param1TabPicDesc.unselected_pic_url;
      this.pic_height = param1TabPicDesc.pic_height;
      this.pic_width = param1TabPicDesc.pic_width;
    }
    
    public TabPicDesc build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TabPicDesc)interceptResult.objValue; 
      } 
      return new TabPicDesc(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
