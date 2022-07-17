package tbclient.Profile;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FinanceTabItems extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC_TEXT = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_STATISTIC = "";
  
  public static final String DEFAULT_TAB_BUBBLE = "";
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAB_TYPE = "";
  
  public static final String DEFAULT_TAB_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String statistic;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tab_bubble;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tab_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_url;
  
  public FinanceTabItems(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str1 = paramBuilder.tab_url;
      if (str1 == null) {
        this.tab_url = "";
      } else {
        this.tab_url = str1;
      } 
      str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.desc_text;
      if (str1 == null) {
        this.desc_text = "";
      } else {
        this.desc_text = str1;
      } 
      str1 = paramBuilder.tab_bubble;
      if (str1 == null) {
        this.tab_bubble = "";
      } else {
        this.tab_bubble = str1;
      } 
      str1 = paramBuilder.tab_type;
      if (str1 == null) {
        this.tab_type = "";
      } else {
        this.tab_type = str1;
      } 
      str = paramBuilder.statistic;
      if (str == null) {
        this.statistic = "";
      } else {
        this.statistic = str;
      } 
    } else {
      this.tab_name = ((Builder)str).tab_name;
      this.tab_url = ((Builder)str).tab_url;
      this.icon_url = ((Builder)str).icon_url;
      this.desc_text = ((Builder)str).desc_text;
      this.tab_bubble = ((Builder)str).tab_bubble;
      this.tab_type = ((Builder)str).tab_type;
      this.statistic = ((Builder)str).statistic;
    } 
  }
  
  public FinanceTabItems(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FinanceTabItems> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc_text;
    
    public String icon_url;
    
    public String statistic;
    
    public String tab_bubble;
    
    public String tab_name;
    
    public String tab_type;
    
    public String tab_url;
    
    public Builder() {}
    
    public Builder(FinanceTabItems param1FinanceTabItems) {
      super(param1FinanceTabItems);
      if (param1FinanceTabItems == null)
        return; 
      this.tab_name = param1FinanceTabItems.tab_name;
      this.tab_url = param1FinanceTabItems.tab_url;
      this.icon_url = param1FinanceTabItems.icon_url;
      this.desc_text = param1FinanceTabItems.desc_text;
      this.tab_bubble = param1FinanceTabItems.tab_bubble;
      this.tab_type = param1FinanceTabItems.tab_type;
      this.statistic = param1FinanceTabItems.statistic;
    }
    
    public FinanceTabItems build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FinanceTabItems)interceptResult.objValue; 
      } 
      return new FinanceTabItems(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
