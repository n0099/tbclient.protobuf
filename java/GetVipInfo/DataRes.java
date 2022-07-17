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
import tbclient.AutoPayInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<VipBasicList> DEFAULT_BASIC_LIST;
  
  public static final List<String> DEFAULT_CARD_ORDER;
  
  public static final String DEFAULT_GRADE_INTRO_LINK = "";
  
  public static final String DEFAULT_GRADE_INTRO_TITLE = "";
  
  public static final Integer DEFAULT_TODAY_GET_SCORE;
  
  public static final Integer DEFAULT_TODAY_UNGET_SCORE;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 17)
  public final AutoPayInfo autopay_info;
  
  @ProtoField(tag = 7)
  public final VipBannerList banner_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<VipBasicList> basic_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
  public final List<String> card_order;
  
  @ProtoField(tag = 14)
  public final VipSpecialList cooperate_list;
  
  @ProtoField(tag = 16)
  public final VipDailyList daily_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String grade_intro_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String grade_intro_title;
  
  @ProtoField(tag = 9)
  public final VipRank rank;
  
  @ProtoField(tag = 5)
  public final VipSpecialList special_list;
  
  @ProtoField(tag = 8)
  public final VipTaskList task_list;
  
  @ProtoField(tag = 6)
  public final VipThemeList theme_list;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer today_get_score;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer today_unget_score;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 4)
  public final VipUpgrade upgrade;
  
  @ProtoField(tag = 1)
  public final VipUser user;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1243160565, "Ltbclient/GetVipInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1243160565, "Ltbclient/GetVipInfo/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TODAY_GET_SCORE = integer;
    DEFAULT_TODAY_UNGET_SCORE = integer;
    DEFAULT_CARD_ORDER = Collections.emptyList();
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_BASIC_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      String str = paramBuilder.grade_intro_title;
      if (str == null) {
        this.grade_intro_title = "";
      } else {
        this.grade_intro_title = str;
      } 
      str = paramBuilder.grade_intro_link;
      if (str == null) {
        this.grade_intro_link = "";
      } else {
        this.grade_intro_link = str;
      } 
      this.upgrade = paramBuilder.upgrade;
      this.special_list = paramBuilder.special_list;
      this.theme_list = paramBuilder.theme_list;
      this.banner_list = paramBuilder.banner_list;
      this.task_list = paramBuilder.task_list;
      this.rank = paramBuilder.rank;
      Integer integer2 = paramBuilder.today_get_score;
      if (integer2 == null) {
        this.today_get_score = DEFAULT_TODAY_GET_SCORE;
      } else {
        this.today_get_score = integer2;
      } 
      integer2 = paramBuilder.today_unget_score;
      if (integer2 == null) {
        this.today_unget_score = DEFAULT_TODAY_UNGET_SCORE;
      } else {
        this.today_unget_score = integer2;
      } 
      List<String> list1 = paramBuilder.card_order;
      if (list1 == null) {
        this.card_order = DEFAULT_CARD_ORDER;
      } else {
        this.card_order = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      this.cooperate_list = paramBuilder.cooperate_list;
      List<VipBasicList> list = paramBuilder.basic_list;
      if (list == null) {
        this.basic_list = DEFAULT_BASIC_LIST;
      } else {
        this.basic_list = Message.immutableCopyOf(list);
      } 
      this.daily_list = paramBuilder.daily_list;
      this.autopay_info = paramBuilder.autopay_info;
    } else {
      this.user = paramBuilder.user;
      this.grade_intro_title = paramBuilder.grade_intro_title;
      this.grade_intro_link = paramBuilder.grade_intro_link;
      this.upgrade = paramBuilder.upgrade;
      this.special_list = paramBuilder.special_list;
      this.theme_list = paramBuilder.theme_list;
      this.banner_list = paramBuilder.banner_list;
      this.task_list = paramBuilder.task_list;
      this.rank = paramBuilder.rank;
      this.today_get_score = paramBuilder.today_get_score;
      this.today_unget_score = paramBuilder.today_unget_score;
      this.card_order = Message.immutableCopyOf(paramBuilder.card_order);
      this.update_time = paramBuilder.update_time;
      this.cooperate_list = paramBuilder.cooperate_list;
      this.basic_list = Message.immutableCopyOf(paramBuilder.basic_list);
      this.daily_list = paramBuilder.daily_list;
      this.autopay_info = paramBuilder.autopay_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public AutoPayInfo autopay_info;
    
    public VipBannerList banner_list;
    
    public List<VipBasicList> basic_list;
    
    public List<String> card_order;
    
    public VipSpecialList cooperate_list;
    
    public VipDailyList daily_list;
    
    public String grade_intro_link;
    
    public String grade_intro_title;
    
    public VipRank rank;
    
    public VipSpecialList special_list;
    
    public VipTaskList task_list;
    
    public VipThemeList theme_list;
    
    public Integer today_get_score;
    
    public Integer today_unget_score;
    
    public Integer update_time;
    
    public VipUpgrade upgrade;
    
    public VipUser user;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.grade_intro_title = param1DataRes.grade_intro_title;
      this.grade_intro_link = param1DataRes.grade_intro_link;
      this.upgrade = param1DataRes.upgrade;
      this.special_list = param1DataRes.special_list;
      this.theme_list = param1DataRes.theme_list;
      this.banner_list = param1DataRes.banner_list;
      this.task_list = param1DataRes.task_list;
      this.rank = param1DataRes.rank;
      this.today_get_score = param1DataRes.today_get_score;
      this.today_unget_score = param1DataRes.today_unget_score;
      this.card_order = Message.copyOf(param1DataRes.card_order);
      this.update_time = param1DataRes.update_time;
      this.cooperate_list = param1DataRes.cooperate_list;
      this.basic_list = Message.copyOf(param1DataRes.basic_list);
      this.daily_list = param1DataRes.daily_list;
      this.autopay_info = param1DataRes.autopay_info;
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
