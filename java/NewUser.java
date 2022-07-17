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

public final class NewUser extends Message {
  public static Interceptable $ic;
  
  public static final List<Props> DEFAULT_APPRAISE;
  
  public static final String DEFAULT_BG_ID = "";
  
  public static final String DEFAULT_BILLBOARD = "";
  
  public static final String DEFAULT_CARD = "";
  
  public static final String DEFAULT_CDN_ERROR = "";
  
  public static final String DEFAULT_FREE_FLAG = "";
  
  public static final String DEFAULT_IS_COREUSER = "";
  
  public static final String DEFAULT_IS_DOUDIZHU = "";
  
  public static final Integer DEFAULT_IS_GROUP_OWNER;
  
  public static final Integer DEFAULT_IS_HARDWORKING;
  
  public static final String DEFAULT_IS_INTERESTMAN = "";
  
  public static final Integer DEFAULT_IS_MEMBER;
  
  public static final Integer DEFAULT_IS_PASSER;
  
  public static final Integer DEFAULT_IS_QUN_SPRING;
  
  public static final Integer DEFAULT_IS_SHENGYOU;
  
  public static final Integer DEFAULT_IS_TENYEAR;
  
  public static final Integer DEFAULT_MEIZHI_LEVEL;
  
  public static final List<NoticeMask> DEFAULT_NOTICE_MASK;
  
  public static final String DEFAULT_PAPER = "";
  
  public static final String DEFAULT_PORTRAIT_TIME = "";
  
  public static final List<Rpgoldicon> DEFAULT_RPGOLDICON;
  
  public static final Integer DEFAULT_SUPERBOY;
  
  public static final List<TbmallMonthIcon> DEFAULT_TBMALL_MONTH_ICON;
  
  public static final String DEFAULT_TBSCORE_REPEATE_FINISH_TIME = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_USER_SEX;
  
  public static final Integer DEFAULT_USER_STATUS;
  
  public static final Integer DEFAULT_USER_TYPE;
  
  public static final Integer DEFAULT_USE_SIG;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<Props> appraise;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String bg_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String billboard;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String card;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String cdn_error;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String free_flag;
  
  @ProtoField(tag = 33)
  public final GameAttr game_attr;
  
  @ProtoField(tag = 35)
  public final Global global;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String is_coreuser;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String is_doudizhu;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_group_owner;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer is_hardworking;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String is_interestman;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer is_member;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer is_passer;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer is_qun_spring;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_shengyou;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_tenyear;
  
  @ProtoField(tag = 9)
  public final MparrProps m_parr_props;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer meizhi_level;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 27)
  public final List<NoticeMask> notice_mask;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String paper;
  
  @ProtoField(tag = 8)
  public final ParrProps parr_props;
  
  @ProtoField(tag = 13)
  public final ParrScores parr_scores;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String portrait_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<Rpgoldicon> rpgoldicon;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer superboy;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 31)
  public final List<TbmallMonthIcon> tbmall_month_icon;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String tbscore_repeate_finish_time;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer use_sig;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_sex;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer user_status;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer user_type;
  
  @ProtoField(tag = 10)
  public final WapRn wap_rn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_SEX = integer;
    DEFAULT_USER_STATUS = integer;
    DEFAULT_MEIZHI_LEVEL = integer;
    DEFAULT_SUPERBOY = integer;
    DEFAULT_IS_TENYEAR = integer;
    DEFAULT_IS_GROUP_OWNER = integer;
    DEFAULT_USER_TYPE = integer;
    DEFAULT_USE_SIG = integer;
    DEFAULT_IS_SHENGYOU = integer;
    DEFAULT_IS_HARDWORKING = integer;
    DEFAULT_APPRAISE = Collections.emptyList();
    DEFAULT_IS_MEMBER = integer;
    DEFAULT_IS_PASSER = integer;
    DEFAULT_IS_QUN_SPRING = integer;
    DEFAULT_NOTICE_MASK = Collections.emptyList();
    DEFAULT_RPGOLDICON = Collections.emptyList();
    DEFAULT_TBMALL_MONTH_ICON = Collections.emptyList();
  }
  
  public NewUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str7 = paramBuilder.user_name;
      if (str7 == null) {
        this.user_name = "";
      } else {
        this.user_name = str7;
      } 
      Integer integer4 = paramBuilder.user_sex;
      if (integer4 == null) {
        this.user_sex = DEFAULT_USER_SEX;
      } else {
        this.user_sex = integer4;
      } 
      integer4 = paramBuilder.user_status;
      if (integer4 == null) {
        this.user_status = DEFAULT_USER_STATUS;
      } else {
        this.user_status = integer4;
      } 
      integer4 = paramBuilder.meizhi_level;
      if (integer4 == null) {
        this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
      } else {
        this.meizhi_level = integer4;
      } 
      integer4 = paramBuilder.superboy;
      if (integer4 == null) {
        this.superboy = DEFAULT_SUPERBOY;
      } else {
        this.superboy = integer4;
      } 
      String str6 = paramBuilder.card;
      if (str6 == null) {
        this.card = "";
      } else {
        this.card = str6;
      } 
      this.parr_props = paramBuilder.parr_props;
      this.m_parr_props = paramBuilder.m_parr_props;
      this.wap_rn = paramBuilder.wap_rn;
      Integer integer3 = paramBuilder.is_tenyear;
      if (integer3 == null) {
        this.is_tenyear = DEFAULT_IS_TENYEAR;
      } else {
        this.is_tenyear = integer3;
      } 
      integer3 = paramBuilder.is_group_owner;
      if (integer3 == null) {
        this.is_group_owner = DEFAULT_IS_GROUP_OWNER;
      } else {
        this.is_group_owner = integer3;
      } 
      this.parr_scores = paramBuilder.parr_scores;
      integer3 = paramBuilder.user_type;
      if (integer3 == null) {
        this.user_type = DEFAULT_USER_TYPE;
      } else {
        this.user_type = integer3;
      } 
      integer3 = paramBuilder.use_sig;
      if (integer3 == null) {
        this.use_sig = DEFAULT_USE_SIG;
      } else {
        this.use_sig = integer3;
      } 
      String str5 = paramBuilder.paper;
      if (str5 == null) {
        this.paper = "";
      } else {
        this.paper = str5;
      } 
      str5 = paramBuilder.bg_id;
      if (str5 == null) {
        this.bg_id = "";
      } else {
        this.bg_id = str5;
      } 
      Integer integer2 = paramBuilder.is_shengyou;
      if (integer2 == null) {
        this.is_shengyou = DEFAULT_IS_SHENGYOU;
      } else {
        this.is_shengyou = integer2;
      } 
      integer2 = paramBuilder.is_hardworking;
      if (integer2 == null) {
        this.is_hardworking = DEFAULT_IS_HARDWORKING;
      } else {
        this.is_hardworking = integer2;
      } 
      String str4 = paramBuilder.billboard;
      if (str4 == null) {
        this.billboard = "";
      } else {
        this.billboard = str4;
      } 
      str4 = paramBuilder.portrait_time;
      if (str4 == null) {
        this.portrait_time = "";
      } else {
        this.portrait_time = str4;
      } 
      List<Props> list3 = paramBuilder.appraise;
      if (list3 == null) {
        this.appraise = DEFAULT_APPRAISE;
      } else {
        this.appraise = Message.immutableCopyOf(list3);
      } 
      String str3 = paramBuilder.tbscore_repeate_finish_time;
      if (str3 == null) {
        this.tbscore_repeate_finish_time = "";
      } else {
        this.tbscore_repeate_finish_time = str3;
      } 
      Integer integer1 = paramBuilder.is_member;
      if (integer1 == null) {
        this.is_member = DEFAULT_IS_MEMBER;
      } else {
        this.is_member = integer1;
      } 
      integer1 = paramBuilder.is_passer;
      if (integer1 == null) {
        this.is_passer = DEFAULT_IS_PASSER;
      } else {
        this.is_passer = integer1;
      } 
      integer1 = paramBuilder.is_qun_spring;
      if (integer1 == null) {
        this.is_qun_spring = DEFAULT_IS_QUN_SPRING;
      } else {
        this.is_qun_spring = integer1;
      } 
      List<NoticeMask> list2 = paramBuilder.notice_mask;
      if (list2 == null) {
        this.notice_mask = DEFAULT_NOTICE_MASK;
      } else {
        this.notice_mask = Message.immutableCopyOf(list2);
      } 
      List<Rpgoldicon> list1 = paramBuilder.rpgoldicon;
      if (list1 == null) {
        this.rpgoldicon = DEFAULT_RPGOLDICON;
      } else {
        this.rpgoldicon = Message.immutableCopyOf(list1);
      } 
      String str2 = paramBuilder.is_doudizhu;
      if (str2 == null) {
        this.is_doudizhu = "";
      } else {
        this.is_doudizhu = str2;
      } 
      str2 = paramBuilder.cdn_error;
      if (str2 == null) {
        this.cdn_error = "";
      } else {
        this.cdn_error = str2;
      } 
      List<TbmallMonthIcon> list = paramBuilder.tbmall_month_icon;
      if (list == null) {
        this.tbmall_month_icon = DEFAULT_TBMALL_MONTH_ICON;
      } else {
        this.tbmall_month_icon = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.is_coreuser;
      if (str1 == null) {
        this.is_coreuser = "";
      } else {
        this.is_coreuser = str1;
      } 
      this.game_attr = paramBuilder.game_attr;
      str1 = paramBuilder.is_interestman;
      if (str1 == null) {
        this.is_interestman = "";
      } else {
        this.is_interestman = str1;
      } 
      this.global = paramBuilder.global;
      str = paramBuilder.free_flag;
      if (str == null) {
        this.free_flag = "";
      } else {
        this.free_flag = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.user_sex = ((Builder)str).user_sex;
      this.user_status = ((Builder)str).user_status;
      this.meizhi_level = ((Builder)str).meizhi_level;
      this.superboy = ((Builder)str).superboy;
      this.card = ((Builder)str).card;
      this.parr_props = ((Builder)str).parr_props;
      this.m_parr_props = ((Builder)str).m_parr_props;
      this.wap_rn = ((Builder)str).wap_rn;
      this.is_tenyear = ((Builder)str).is_tenyear;
      this.is_group_owner = ((Builder)str).is_group_owner;
      this.parr_scores = ((Builder)str).parr_scores;
      this.user_type = ((Builder)str).user_type;
      this.use_sig = ((Builder)str).use_sig;
      this.paper = ((Builder)str).paper;
      this.bg_id = ((Builder)str).bg_id;
      this.is_shengyou = ((Builder)str).is_shengyou;
      this.is_hardworking = ((Builder)str).is_hardworking;
      this.billboard = ((Builder)str).billboard;
      this.portrait_time = ((Builder)str).portrait_time;
      this.appraise = Message.immutableCopyOf(((Builder)str).appraise);
      this.tbscore_repeate_finish_time = ((Builder)str).tbscore_repeate_finish_time;
      this.is_member = ((Builder)str).is_member;
      this.is_passer = ((Builder)str).is_passer;
      this.is_qun_spring = ((Builder)str).is_qun_spring;
      this.notice_mask = Message.immutableCopyOf(((Builder)str).notice_mask);
      this.rpgoldicon = Message.immutableCopyOf(((Builder)str).rpgoldicon);
      this.is_doudizhu = ((Builder)str).is_doudizhu;
      this.cdn_error = ((Builder)str).cdn_error;
      this.tbmall_month_icon = Message.immutableCopyOf(((Builder)str).tbmall_month_icon);
      this.is_coreuser = ((Builder)str).is_coreuser;
      this.game_attr = ((Builder)str).game_attr;
      this.is_interestman = ((Builder)str).is_interestman;
      this.global = ((Builder)str).global;
      this.free_flag = ((Builder)str).free_flag;
    } 
  }
  
  public NewUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1642039034, "Ltbclient/NewUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1642039034, "Ltbclient/NewUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NewUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Props> appraise;
    
    public String bg_id;
    
    public String billboard;
    
    public String card;
    
    public String cdn_error;
    
    public String free_flag;
    
    public GameAttr game_attr;
    
    public Global global;
    
    public String is_coreuser;
    
    public String is_doudizhu;
    
    public Integer is_group_owner;
    
    public Integer is_hardworking;
    
    public String is_interestman;
    
    public Integer is_member;
    
    public Integer is_passer;
    
    public Integer is_qun_spring;
    
    public Integer is_shengyou;
    
    public Integer is_tenyear;
    
    public MparrProps m_parr_props;
    
    public Integer meizhi_level;
    
    public List<NoticeMask> notice_mask;
    
    public String paper;
    
    public ParrProps parr_props;
    
    public ParrScores parr_scores;
    
    public String portrait_time;
    
    public List<Rpgoldicon> rpgoldicon;
    
    public Integer superboy;
    
    public List<TbmallMonthIcon> tbmall_month_icon;
    
    public String tbscore_repeate_finish_time;
    
    public Integer use_sig;
    
    public Long user_id;
    
    public String user_name;
    
    public Integer user_sex;
    
    public Integer user_status;
    
    public Integer user_type;
    
    public WapRn wap_rn;
    
    public Builder() {}
    
    public Builder(NewUser param1NewUser) {
      super(param1NewUser);
      if (param1NewUser == null)
        return; 
      this.user_id = param1NewUser.user_id;
      this.user_name = param1NewUser.user_name;
      this.user_sex = param1NewUser.user_sex;
      this.user_status = param1NewUser.user_status;
      this.meizhi_level = param1NewUser.meizhi_level;
      this.superboy = param1NewUser.superboy;
      this.card = param1NewUser.card;
      this.parr_props = param1NewUser.parr_props;
      this.m_parr_props = param1NewUser.m_parr_props;
      this.wap_rn = param1NewUser.wap_rn;
      this.is_tenyear = param1NewUser.is_tenyear;
      this.is_group_owner = param1NewUser.is_group_owner;
      this.parr_scores = param1NewUser.parr_scores;
      this.user_type = param1NewUser.user_type;
      this.use_sig = param1NewUser.use_sig;
      this.paper = param1NewUser.paper;
      this.bg_id = param1NewUser.bg_id;
      this.is_shengyou = param1NewUser.is_shengyou;
      this.is_hardworking = param1NewUser.is_hardworking;
      this.billboard = param1NewUser.billboard;
      this.portrait_time = param1NewUser.portrait_time;
      this.appraise = Message.copyOf(param1NewUser.appraise);
      this.tbscore_repeate_finish_time = param1NewUser.tbscore_repeate_finish_time;
      this.is_member = param1NewUser.is_member;
      this.is_passer = param1NewUser.is_passer;
      this.is_qun_spring = param1NewUser.is_qun_spring;
      this.notice_mask = Message.copyOf(param1NewUser.notice_mask);
      this.rpgoldicon = Message.copyOf(param1NewUser.rpgoldicon);
      this.is_doudizhu = param1NewUser.is_doudizhu;
      this.cdn_error = param1NewUser.cdn_error;
      this.tbmall_month_icon = Message.copyOf(param1NewUser.tbmall_month_icon);
      this.is_coreuser = param1NewUser.is_coreuser;
      this.game_attr = param1NewUser.game_attr;
      this.is_interestman = param1NewUser.is_interestman;
      this.global = param1NewUser.global;
      this.free_flag = param1NewUser.free_flag;
    }
    
    public NewUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewUser)interceptResult.objValue; 
      } 
      return new NewUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
