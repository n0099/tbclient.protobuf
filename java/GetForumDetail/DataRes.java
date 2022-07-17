package tbclient.GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuThrones;
import tbclient.ForumMemberInfo;
import tbclient.HotUserRankEntry;
import tbclient.ManagerApplyInfo;
import tbclient.PriManagerApplyInfo;
import tbclient.RecommendForumInfo;
import tbclient.ServiceArea;
import tbclient.SimpleThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<BawuAction> DEFAULT_BAWU_ACTIONS;
  
  public static final Integer DEFAULT_IS_BAWU_SHOW;
  
  public static final String DEFAULT_IS_BAZHU_SHOW = "";
  
  public static final Integer DEFAULT_IS_COMPLAINT_SHOW;
  
  public static final Integer DEFAULT_IS_FORUM_CARD_ENABLE;
  
  public static final Integer DEFAULT_IS_FORUM_DATA_SHOW;
  
  public static final List<SimpleThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 12)
  public final ApplyStatus apply_status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<BawuAction> bawu_actions;
  
  @ProtoField(tag = 17)
  public final BawuThrones bawu_thrones;
  
  @ProtoField(tag = 15)
  public final BazhuGrade bazhu_grade;
  
  @ProtoField(tag = 13)
  public final BazhuUniversity bazhu_university;
  
  @ProtoField(tag = 5)
  public final ManagerApplyInfo bz_apply_info;
  
  @ProtoField(tag = 8)
  public final ManagerElectionTab election_tab;
  
  @ProtoField(tag = 10)
  public final ForumDataCenter forum_data;
  
  @ProtoField(tag = 1)
  public final RecommendForumInfo forum_info;
  
  @ProtoField(tag = 21)
  public final ForumMemberInfo forum_member;
  
  @ProtoField(tag = 19)
  public final HotUserRankEntry hot_user_entry;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_bawu_show;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String is_bazhu_show;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_complaint_show;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_forum_card_enable;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_forum_data_show;
  
  @ProtoField(tag = 7)
  public final PriManagerApplyInfo pribz_apply_info;
  
  @ProtoField(tag = 20)
  public final ServiceArea small_app;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SimpleThreadInfo> thread_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BAWU_SHOW = integer;
    DEFAULT_IS_COMPLAINT_SHOW = integer;
    DEFAULT_IS_FORUM_DATA_SHOW = integer;
    DEFAULT_BAWU_ACTIONS = Collections.emptyList();
    DEFAULT_IS_FORUM_CARD_ENABLE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.forum_info = paramBuilder.forum_info;
      List<SimpleThreadInfo> list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.is_bawu_show;
      if (integer2 == null) {
        this.is_bawu_show = DEFAULT_IS_BAWU_SHOW;
      } else {
        this.is_bawu_show = integer2;
      } 
      this.bz_apply_info = paramBuilder.bz_apply_info;
      integer2 = paramBuilder.is_complaint_show;
      if (integer2 == null) {
        this.is_complaint_show = DEFAULT_IS_COMPLAINT_SHOW;
      } else {
        this.is_complaint_show = integer2;
      } 
      this.pribz_apply_info = paramBuilder.pribz_apply_info;
      this.election_tab = paramBuilder.election_tab;
      integer2 = paramBuilder.is_forum_data_show;
      if (integer2 == null) {
        this.is_forum_data_show = DEFAULT_IS_FORUM_DATA_SHOW;
      } else {
        this.is_forum_data_show = integer2;
      } 
      this.forum_data = paramBuilder.forum_data;
      List<BawuAction> list = paramBuilder.bawu_actions;
      if (list == null) {
        this.bawu_actions = DEFAULT_BAWU_ACTIONS;
      } else {
        this.bawu_actions = Message.immutableCopyOf(list);
      } 
      this.apply_status = paramBuilder.apply_status;
      this.bazhu_university = paramBuilder.bazhu_university;
      this.bazhu_grade = paramBuilder.bazhu_grade;
      Integer integer1 = paramBuilder.is_forum_card_enable;
      if (integer1 == null) {
        this.is_forum_card_enable = DEFAULT_IS_FORUM_CARD_ENABLE;
      } else {
        this.is_forum_card_enable = integer1;
      } 
      this.bawu_thrones = paramBuilder.bawu_thrones;
      String str = paramBuilder.is_bazhu_show;
      if (str == null) {
        this.is_bazhu_show = "";
      } else {
        this.is_bazhu_show = str;
      } 
      this.hot_user_entry = paramBuilder.hot_user_entry;
      this.small_app = paramBuilder.small_app;
      this.forum_member = paramBuilder.forum_member;
    } else {
      this.forum_info = paramBuilder.forum_info;
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.is_bawu_show = paramBuilder.is_bawu_show;
      this.bz_apply_info = paramBuilder.bz_apply_info;
      this.is_complaint_show = paramBuilder.is_complaint_show;
      this.pribz_apply_info = paramBuilder.pribz_apply_info;
      this.election_tab = paramBuilder.election_tab;
      this.is_forum_data_show = paramBuilder.is_forum_data_show;
      this.forum_data = paramBuilder.forum_data;
      this.bawu_actions = Message.immutableCopyOf(paramBuilder.bawu_actions);
      this.apply_status = paramBuilder.apply_status;
      this.bazhu_university = paramBuilder.bazhu_university;
      this.bazhu_grade = paramBuilder.bazhu_grade;
      this.is_forum_card_enable = paramBuilder.is_forum_card_enable;
      this.bawu_thrones = paramBuilder.bawu_thrones;
      this.is_bazhu_show = paramBuilder.is_bazhu_show;
      this.hot_user_entry = paramBuilder.hot_user_entry;
      this.small_app = paramBuilder.small_app;
      this.forum_member = paramBuilder.forum_member;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(750498670, "Ltbclient/GetForumDetail/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(750498670, "Ltbclient/GetForumDetail/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ApplyStatus apply_status;
    
    public List<BawuAction> bawu_actions;
    
    public BawuThrones bawu_thrones;
    
    public BazhuGrade bazhu_grade;
    
    public BazhuUniversity bazhu_university;
    
    public ManagerApplyInfo bz_apply_info;
    
    public ManagerElectionTab election_tab;
    
    public ForumDataCenter forum_data;
    
    public RecommendForumInfo forum_info;
    
    public ForumMemberInfo forum_member;
    
    public HotUserRankEntry hot_user_entry;
    
    public Integer is_bawu_show;
    
    public String is_bazhu_show;
    
    public Integer is_complaint_show;
    
    public Integer is_forum_card_enable;
    
    public Integer is_forum_data_show;
    
    public PriManagerApplyInfo pribz_apply_info;
    
    public ServiceArea small_app;
    
    public List<SimpleThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.forum_info = param1DataRes.forum_info;
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.is_bawu_show = param1DataRes.is_bawu_show;
      this.bz_apply_info = param1DataRes.bz_apply_info;
      this.is_complaint_show = param1DataRes.is_complaint_show;
      this.pribz_apply_info = param1DataRes.pribz_apply_info;
      this.election_tab = param1DataRes.election_tab;
      this.is_forum_data_show = param1DataRes.is_forum_data_show;
      this.forum_data = param1DataRes.forum_data;
      this.bawu_actions = Message.copyOf(param1DataRes.bawu_actions);
      this.apply_status = param1DataRes.apply_status;
      this.bazhu_university = param1DataRes.bazhu_university;
      this.bazhu_grade = param1DataRes.bazhu_grade;
      this.is_forum_card_enable = param1DataRes.is_forum_card_enable;
      this.bawu_thrones = param1DataRes.bawu_thrones;
      this.is_bazhu_show = param1DataRes.is_bazhu_show;
      this.hot_user_entry = param1DataRes.hot_user_entry;
      this.small_app = param1DataRes.small_app;
      this.forum_member = param1DataRes.forum_member;
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
