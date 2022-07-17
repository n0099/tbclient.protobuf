package tbclient.GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipThemeList extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CARD_ID = "";
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_CLASS_URL = "";
  
  public static final String DEFAULT_CLASS_URL_NAME = "";
  
  public static final List<VipThemeItem> DEFAULT_ITEM = Collections.emptyList();
  
  public static final List<VipThemeItem> DEFAULT_ITEM_CARD = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String class_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_url_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<VipThemeItem> item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<VipThemeItem> item_card;
  
  public VipThemeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str1 = paramBuilder.class_url_name;
      if (str1 == null) {
        this.class_url_name = "";
      } else {
        this.class_url_name = str1;
      } 
      str1 = paramBuilder.class_url;
      if (str1 == null) {
        this.class_url = "";
      } else {
        this.class_url = str1;
      } 
      List<VipThemeItem> list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.item_card;
      if (list == null) {
        this.item_card = DEFAULT_ITEM_CARD;
      } else {
        this.item_card = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.class_name = ((Builder)str).class_name;
      this.class_url_name = ((Builder)str).class_url_name;
      this.class_url = ((Builder)str).class_url;
      this.item = Message.immutableCopyOf(((Builder)str).item);
      this.item_card = Message.immutableCopyOf(((Builder)str).item_card);
      this.card_id = ((Builder)str).card_id;
    } 
  }
  
  public VipThemeList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1177302143, "Ltbclient/GetVipInfo/VipThemeList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1177302143, "Ltbclient/GetVipInfo/VipThemeList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<VipThemeList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String card_id;
    
    public String class_name;
    
    public String class_url;
    
    public String class_url_name;
    
    public List<VipThemeItem> item;
    
    public List<VipThemeItem> item_card;
    
    public Builder() {}
    
    public Builder(VipThemeList param1VipThemeList) {
      super(param1VipThemeList);
      if (param1VipThemeList == null)
        return; 
      this.class_name = param1VipThemeList.class_name;
      this.class_url_name = param1VipThemeList.class_url_name;
      this.class_url = param1VipThemeList.class_url;
      this.item = Message.copyOf(param1VipThemeList.item);
      this.item_card = Message.copyOf(param1VipThemeList.item_card);
      this.card_id = param1VipThemeList.card_id;
    }
    
    public VipThemeList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipThemeList)interceptResult.objValue; 
      } 
      return new VipThemeList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
