package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotLiveWithCategory extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BITMAP_WH_RATIO = "";
  
  public static final String DEFAULT_ENTRY_NAME = "";
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final List<ThreadInfo> DEFAULT_LIVE;
  
  public static final Integer DEFAULT_LIVE_TAB_TYPE;
  
  public static final Integer DEFAULT_TAB_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bitmap_wh_ratio;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String entry_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThreadInfo> live;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer live_tab_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-67838360, "Ltbclient/HotLiveWithCategory;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-67838360, "Ltbclient/HotLiveWithCategory;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    DEFAULT_LIVE = Collections.emptyList();
    DEFAULT_LIVE_TAB_TYPE = integer;
  }
  
  public HotLiveWithCategory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.entry_name;
      if (str3 == null) {
        this.entry_name = "";
      } else {
        this.entry_name = str3;
      } 
      Integer integer1 = paramBuilder.tab_id;
      if (integer1 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer1;
      } 
      String str2 = paramBuilder.bitmap_wh_ratio;
      if (str2 == null) {
        this.bitmap_wh_ratio = "";
      } else {
        this.bitmap_wh_ratio = str2;
      } 
      List<ThreadInfo> list = paramBuilder.live;
      if (list == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.label_name;
      if (str1 == null) {
        this.label_name = "";
      } else {
        this.label_name = str1;
      } 
      integer = paramBuilder.live_tab_type;
      if (integer == null) {
        this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
      } else {
        this.live_tab_type = integer;
      } 
    } else {
      this.entry_name = ((Builder)integer).entry_name;
      this.tab_id = ((Builder)integer).tab_id;
      this.bitmap_wh_ratio = ((Builder)integer).bitmap_wh_ratio;
      this.live = Message.immutableCopyOf(((Builder)integer).live);
      this.label_name = ((Builder)integer).label_name;
      this.live_tab_type = ((Builder)integer).live_tab_type;
    } 
  }
  
  public HotLiveWithCategory(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotLiveWithCategory> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bitmap_wh_ratio;
    
    public String entry_name;
    
    public String label_name;
    
    public List<ThreadInfo> live;
    
    public Integer live_tab_type;
    
    public Integer tab_id;
    
    public Builder() {}
    
    public Builder(HotLiveWithCategory param1HotLiveWithCategory) {
      super(param1HotLiveWithCategory);
      if (param1HotLiveWithCategory == null)
        return; 
      this.entry_name = param1HotLiveWithCategory.entry_name;
      this.tab_id = param1HotLiveWithCategory.tab_id;
      this.bitmap_wh_ratio = param1HotLiveWithCategory.bitmap_wh_ratio;
      this.live = Message.copyOf(param1HotLiveWithCategory.live);
      this.label_name = param1HotLiveWithCategory.label_name;
      this.live_tab_type = param1HotLiveWithCategory.live_tab_type;
    }
    
    public HotLiveWithCategory build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotLiveWithCategory)interceptResult.objValue; 
      } 
      return new HotLiveWithCategory(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
